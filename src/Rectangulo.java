import java.util.Scanner;

public class Rectangulo {
//---

    private int ancho;
    private int largo;

//--- Constructor Rectángulo
    public Rectangulo (){ //Constructor por defecto

    }

    public Rectangulo (String nombre, int ancho, int largo){ //Constructor con parámetros
        System.out.println("\n"+nombre+"\n");
        this.ancho = ancho;
        this.largo = largo;
    }

    //--- Métodos de Acceso
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    //--- Método para calcula el área del Rectángulo
    public int areaRectangulo(int ancho, int largo){
        return (ancho * largo);
    }

    //--- Método para calcula el perímetro del Rectángulo
    public int perimetroRectangulo(int ancho, int largo){
        return (2*ancho + 2*largo);
    }

    public void resultadosRectangulo() {
        if (ancho == largo){
            System.out.println("*-* Los numeros ingresados son iguales");
        } else {
            System.out.println("*-*\tEl area del rectangulo es: "+areaRectangulo(getAncho(), getLargo()));
            System.out.println("*-*\tEl perimetro del rectangulo es: "+perimetroRectangulo(getAncho(), getLargo()));
        }
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        Scanner sc = new Scanner(System.in);
        int ancho, largo;

        System.out.print("Ingrese el ancho del rectangulo: ");
        ancho = sc.nextInt();
        System.out.print("Ingrese el largo del rectangulo: ");
        largo = sc.nextInt();

        Rectangulo rectangulo = new Rectangulo("Clase Rectangulo", ancho, largo);
        rectangulo.resultadosRectangulo();
    }
}
