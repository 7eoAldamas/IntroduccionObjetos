import java.util.Scanner;

public class Circulo {
//---

    private float radio;

//--- Constructor Círculo
    public Circulo (){ //Constructor por defecto

    }

    public Circulo (String nombre, float radio){
        System.out.println("\n"+nombre+"\n");
        this.radio = radio;
    }

    //--- Métodos de Acceso
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    //--- Método para calcular el área
    public float areaCirculo(float radio){
        return (float) (Math.PI * Math.pow(radio, 2));
    }

    //--- Método para calcular el perímetro
    public float perimetroCirculo(float radio){
        return (float) (2 * Math.PI * radio);
    }

    //--- Método para mostrar el resultado
    public void resultadoCirculo(){
        System.out.println("*-*\tEl area del círculo es: "+areaCirculo(getRadio()));
        System.out.println("*-*\tEl perimetro del círculo es: "+perimetroCirculo(getRadio()));
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio del circulo: ");
        Circulo circulo = new Circulo("Clase Circulo", sc.nextInt());
        circulo.resultadoCirculo();
    }
}
