package SearchAndInsert;

public class BST <T extends Comparable<T>>{
    private Node<T> root;

    private Node<T> insert(Node<T> root, T data)
    {

        if (root == null)
        {
            return new Node<T>(data);
        }

        else if (data.compareTo(root.data) < 0)
        {
            root.left = insert(root.left, data);
        }

        else if (data.compareTo(root.data) > 0)
        {
            root.right = insert(root.right, data);
        }

        return root;
    }
    public void insert(T data)
    {
        root = insert(root, data);
    }
    public boolean contains(T data)
    {
        return contains(root, data);
    }

    private boolean contains(Node<T> root, T data)
    {

        if (root == null)
        {
            return false;
        }

        else if (data.compareTo(root.data) < 0)
        {
            return contains(root.left, data);
        }

        else if (data.compareTo(root.data) > 0)
        {
            return contains(root.right, data);
        }

        else
        {
            return true;
        }
    }
}
