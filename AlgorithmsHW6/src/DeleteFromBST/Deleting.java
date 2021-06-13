package DeleteFromBST;

public class Deleting<T extends Comparable<T>> {
    private Node<T> root;

    public void insert(T data)
    {
        root = insert(root, data);
    }

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
    public void delete(T data)
    {
        root = delete(root, data);
    }

    private Node<T> delete(Node<T> root, T data)
    {

        if (root == null)
        {
            return null;
        }

        else if (data.compareTo(root.data) < 0 )
        {
            root.left = delete(root.left, data);
        }

        else if (data.compareTo(root.data) > 0)
        {
            root.right = delete(root.right, data);
        }

        else
        {

            if (root.left == null && root.right == null)
            {
                return null;
            }

            else if (root.right == null)
            {
                return root.left;
            }

            else if (root.left == null)
            {
                return root.right;
            }

            else
            {
                root.data = findMax(root.left);
                root.left = delete(root.left, root.data);
            }
        }

        return root;
    }


    private T findMax(Node<T> root)
    {

        while (root.right != null)
        {
            root = root.right;
        }

        return root.data;
    }
}
