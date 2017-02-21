package structures;

/**
 * Created by pepe pecas on 08/02/2017.
 */
public class List<T> {
    // Constants
    public static int EMPTY = 0;

    // Atributes
    private Node<T> anchor;
    private int length;

    public List() {
        anchor = new Node<T>();
        length = EMPTY;
    }

    public void add(T val) {
        insert(anchor.getPrev(), val);
    }

    public void insert(Node<T> pos, T val) {
        Node node = new Node<T>(val);
        pos.getNext().setPrev(node);
        node.setNext(pos);
        node.setPrev(pos);
        pos.setNext(node);
    }

    public void remove(Node<T> node) {
        Node aux;
        aux = node.getPrev();
        aux.setNext(node.getNext());
        aux.getNext().setPrev(aux);
    }

    public void search(T obj) {
        Node aux;
        aux = anchor.getNext();
    }
}
