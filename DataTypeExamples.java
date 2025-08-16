package Actividad1;

public class DataTypeExamples {
    // Ejemplo con número primitivo
    public double sumaNumeros(double a, double b) {
        return a + b;
    }

    // Ejemplo con cadenas
    public String concatenar(String a, String b) {
        return a + " " + b;
    }

    // Ejemplo de tipo complejo (contacto)
    public static class Contact {
        String nombre;
        String direccion;
        String telefono;

        public Contact(String nombre, String direccion, String telefono) {
            this.nombre = nombre;
            this.direccion = direccion;
            this.telefono = telefono; 
        }

        @Override
        public String toString() {
            return nombre + " | " + direccion + " | " + telefono;
        }
    }
}

