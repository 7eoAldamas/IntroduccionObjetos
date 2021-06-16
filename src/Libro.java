import java.util.Scanner;

public class Libro {
//---

    private String libro;
    private boolean ocupado; //Disponibilidad del libro

//--- Constructor Libro
    public Libro (){ //Constructor por defecto

    }

    public Libro (String nombre, String libro){ //Constructor con parámetros
        System.out.println("\n"+nombre+"\n");
        this.libro = libro;
        this.ocupado = true; //Inicia como disponible
    }

    //--- Métodos de Acceso
    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    //--- Método para realizar el préstamo
    public void prestarLibro(){
        if (ocupado) {
            System.out.println("*-* El libro " + libro + " ha sido prestado correctamente");
            ocupado = false; //Cambio en disponibilidad
        } else {
            System.out.println("*-* Libro no disponible *-*");
        }
    }

    //--- Método para devolver el libro
    public void devolverLibro(){
        System.out.println("*-* La devolucion del libro ha sido exitosa" +
                "\n\t\tLibro devuelto -> "+libro);
        ocupado = true; //Cambio en disponibilidad
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.print("Ingrese el nombre del libro: ");
        Libro libro = new Libro("Clase Libro", sc.nextLine());

        System.out.print("Desea prestar un libro Si (1) / No (2): ");
        opcion = sc.nextInt();

        if (opcion == 1){
            libro.prestarLibro();
        }

        System.out.print("\nDesea devolver el libro "+libro.getLibro()+" Si (1) / No (2): ");
        opcion = sc.nextInt();

        if (opcion == 1){
            libro.devolverLibro();
        }
    }
}
