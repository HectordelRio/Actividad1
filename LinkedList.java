package Actividad1;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    // Insertar al inicio
    public void insertAtStart(Object data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertar al final
    public void insertAtEnd(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Buscar un elemento
    public boolean search(Object data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Imprimir lista de izquierda a derecha
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
