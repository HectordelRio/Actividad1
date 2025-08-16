package Actividad1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList listaCadenas = new LinkedList();
        LinkedList listaNumeros = new LinkedList();
        LinkedList listaContactos = new LinkedList();

        int opcion;
        do {
            System.out.println("\n MENU ");
            System.out.println("1. Insertar cadena al inicio");
            System.out.println("2. Insertar número double al final");
            System.out.println("3. Buscar en lista de cadenas");
            System.out.println("4. Imprimir lista de cadenas");
            System.out.println("5. Imprimir lista de números");
            System.out.println("6. Insertar contacto");
            System.out.println("7. Imprimir contactos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa una cadena: ");
                    String cad = sc.nextLine();
                    listaCadenas.insertAtStart(cad);
                    break;

                case 2:
                    System.out.print("Ingresa un número double: ");
                    double num = sc.nextDouble();
                    listaNumeros.insertAtEnd(num);
                    break;

                case 3:
                    System.out.print("Ingresa la cadena a buscar: ");
                    String buscar = sc.nextLine();
                    if (listaCadenas.search(buscar)) {
                        System.out.println("Elemento encontrado.");
                    } else {
                        System.out.println("No se encontró el elemento.");
                    }
                    break;

                case 4:
                    listaCadenas.printList();
                    break;

                case 5:
                    listaNumeros.printList();
                    break;

                case 6:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Dirección: ");
                    String dir = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String tel = sc.nextLine();
                    DataTypeExamples.Contact contacto = new DataTypeExamples.Contact(nombre, dir, tel);
                    listaContactos.insertAtEnd(contacto);
                    break;

                case 7:
                    listaContactos.printList();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

