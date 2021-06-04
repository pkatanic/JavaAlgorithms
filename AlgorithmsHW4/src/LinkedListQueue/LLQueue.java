package LinkedListQueue;

import java.util.NoSuchElementException;

public class LLQueue {
    class Node
    {
        public int data;
        public Node next;
    }

    private Node first;

    public LLQueue()
    {
        first = null;
    }

    public void insertFirst(int x)
    {
        Node n = new Node();
        n.data = x;
        n.next = first;
        first = n;
    }

    public void enqueue(int x)
    {
        if (first == null)
        {
            insertFirst(x);
        }
        else
        {
            Node n = new Node();
            n.data = x;
            Node temp = first;
            while (temp.next != null)
                temp = temp.next;
            n.next = temp.next;
            temp.next = n;
        }
    }

    public int dequeue()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            int ret = first.data;
            first = first.next;
            return ret;
        }
    }

    public int peek()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            return first.data;
        }
    }
}
