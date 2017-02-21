package structures;

/**
 * Created by Victor Diaz - mars.vic5@gmail.com
 * @param <T>, Node data type
 */
public class Node<T> {
    private T val;
    private Node<T> next;
    private Node<T> prev;

    public Node() {
        val = null;
        next = null;
        prev = null;
    }

    public Node(T val) {
        this.val = val;
        next = null;
        prev = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}
