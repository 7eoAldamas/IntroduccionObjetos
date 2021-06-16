public class Contador {
//---

    private int contador;
    private int auxcontador;

//--- Constructo de Contador
    public Contador (String nombre){ //Constructor por defecto
        System.out.println(nombre+"\n");
    }

    public Contador (String nombre, int contador){ //Constructor con parámetros
        this(nombre);
        this.contador = contador;
        this.auxcontador = contador;
    }

    //--- Métodos de Acceso
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    //--- Método para incrementar un número -> num = num + 1
    public int incrementarNumero(){
        return ++contador;
    }

    //--- Método para decrementar un número -> num = num - 1
    public int decrementarNumero(){
        return --auxcontador;
    }

    //--- Método para mostrar el incremento y decremento
    public void resultadoInDe(){
        System.out.println("*-* El incremento del numero es: "+incrementarNumero());
        System.out.println("*-* El decremento del numero es: "+decrementarNumero());
    }
}
