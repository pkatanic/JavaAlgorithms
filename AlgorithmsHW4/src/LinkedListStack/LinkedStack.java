package LinkedListStack;

import java.io.PrintStream;

public class LinkedStack implements Stack {

    private DataNode TopPtr;

    public LinkedStack()
    {
        TopPtr = null;
    }

    @Override
    public int size() {
        int count = 0;
        DataNode cur = TopPtr;
        //iterate through the list
        while( cur != null )
        {
            cur = cur.getNext();
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
         //if TopPtr is equal to null then true is returned
        return (TopPtr == null) ? true : false;
    }

    @Override
    public Object peek() {
        if(TopPtr  == null)
            return "NULL";
        else
            return TopPtr.getData();
    }

    @Override
    public void push(Object element) {
        if( isEmpty() )
        {
            //instantiate the TopPtr if nothing in list
            TopPtr = new DataNode(element);
        }
        else
        {
            DataNode newnode = new DataNode(element);
            newnode.setNext(TopPtr);
            TopPtr = newnode;
        }
    }

    @Override
    public Object pop() {
        if( isEmpty() )
        {
            return null;
        }
        //this case checks if there is only one node in the stack
        //if so then we just set the topptr to null
        else if( TopPtr.getNext() == null)
        {
            Object data = TopPtr.getData();
            TopPtr = null;
            return data;
        }
        //this case auto handles removed the top pointer and
        //points to the next element in the stack
        else
        {
            DataNode poppednode = TopPtr;
            TopPtr = poppednode.getNext();
            return poppednode.getData();
        }
    }
    public void displayStack(PrintStream out)
    {
        DataNode cur = TopPtr;
        while( cur != null )
        {
            out.print(cur.getData() + " ");
            cur = cur.getNext();
        }
        out.println();
    }
}
