public class Libro {
//---

    private String libro;
    private boolean ocupado; //Disponibilidad del libro

//--- Constructor Libro
    public Libro (String nombre){ //Constructor por defecto
        System.out.println(nombre);
    }

    public Libro (String nombre, String libro){ //Constructor con parámetros
        this(nombre);
        this.libro = libro;
        this.ocupado = false; //Inicia como disponible
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
        if (!ocupado) {
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

}
