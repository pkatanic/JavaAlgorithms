package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DoList {
    private LinkedList<String> toDoList = new LinkedList<>();

    public void addToList(String task) {
        toDoList.addFirst(task);
    }
    public void addtoListPosition(int position, String task){
        toDoList.add(position, task);
    }
    private boolean addInAlphabeticalOrder(String task){
        ListIterator<String> listIterator = toDoList.listIterator();
        while(listIterator.hasNext()){
            int compared = listIterator.next().compareTo(task);
            if(compared ==0){
                System.out.println("Task already exists in the List");
                return  true;
            } else if (compared>0){
                listIterator.previous();
                listIterator.add(task);
                return true;
            }

        }
        toDoList.add(task);
        return  true;
    }
    public void printToDoList(){
        long start = System.nanoTime();

        Iterator<String> iterator = toDoList.iterator();
        while(iterator.hasNext()){
            System.out.println("Element " + iterator.next());
        }
        long end = System.nanoTime();

        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");

    }
    public void changeTask(int index, String task){
        toDoList.set(index, task);
    }
    public void removeTask(String task){
        toDoList.remove(task);
    }
    public int getTaskPriority(String task){
        return toDoList.indexOf(task);
    }
}
