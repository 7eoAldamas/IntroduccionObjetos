import java.util.Scanner;

public class Contador {
//---

    private int contador;
    private int auxcontador;

//--- Constructo de Contador
    public Contador (){ //Constructor por defecto
    }

    public Contador (String nombre, int contador){ //Constructor con parámetros
        System.out.println("\n"+nombre+"\n");
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

    public int getAuxcontador() {
        return auxcontador;
    }

    public void setAuxcontador(int auxcontador) {
        this.auxcontador = auxcontador;
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

    public static void main(String[] args) {
        //--- Código Ejecutable
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el un numero: ");
        Contador contador = new Contador("Clase Contador", sc.nextInt());
        contador.resultadoInDe();

    }
}
