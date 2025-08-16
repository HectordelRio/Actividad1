package Actividad1;

public class Node {
    Object data;   // Puede guardar cualquier tipo de dato
    Node next;     // Apunta al siguiente nodo

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}
