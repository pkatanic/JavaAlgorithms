package LinkedListStack;

public class DataNode {
    public Object data; // data stored
    public DataNode next;// pointer to next DataNode element

    public DataNode(Object elem, DataNode nextNode)
    {
        this.data = elem;
        this.next = nextNode;
    }

    public DataNode( Object elem)
    {
        this(elem, null);
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public DataNode getNext() {
        return next;
    }
    public void setNext(DataNode next) {
        this.next = next;
    }
}
