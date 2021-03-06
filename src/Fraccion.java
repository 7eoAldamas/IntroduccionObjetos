import java.util.Scanner;

public class Fraccion {
//---

    private int numerador;
    private int denominador;

//--- Constructor Fraccion
    public Fraccion (){ //Constructor por defecto
    }

    public Fraccion (int numerador, int denominador){ //Constructor con parámetros
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //--- Métodos de Acceso
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //--- Método para sumar fracción
    public void sumaFraccion(Fraccion frac){
        Fraccion aux = new Fraccion();
        aux.numerador = (this.numerador * frac.denominador) + (this.denominador * frac.numerador);
        aux.denominador = (this.denominador * frac.denominador);

        System.out.println("*-*\tLa suma es:  "+aux.numerador+"/"+aux.denominador);
    }

    //--- Método para restar fracción
    public void restaFraccion(Fraccion frac){
        Fraccion aux = new Fraccion();
        aux.numerador = (this.numerador * frac.denominador) - (this.denominador * frac.numerador);
        aux.denominador = (this.denominador * frac.denominador);

        System.out.println("*-*\tLa resta es:  "+aux.numerador+"/"+aux.denominador);
    }

    //--- Método para multiplicación de fracción
    public void multiFraccion(Fraccion frac){
        Fraccion aux = new Fraccion();
        aux.numerador = (this.numerador * frac.numerador);
        aux.denominador = (this.denominador * frac.denominador);

        System.out.println("*-*\tLa multiplicacion es:  "+aux.numerador+"/"+aux.denominador);
    }

    //--- Método para la división fracción
    public void divFraccion(Fraccion frac){
        Fraccion aux = new Fraccion();
        if (frac.denominador!=0) {
            aux.numerador = (this.numerador * frac.denominador);
            aux.denominador = (this.denominador * frac.numerador);

            System.out.println("*-*\tLa division es:  " + aux.numerador + "/" + aux.denominador);
        } else {
            System.out.println("*-* Error *-*");
        }
    }

    public static void main(String[] args) {
        //--- Código Ejecutable
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingrese el numerador de la 1ra expresion: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el denominador de la 1ra expresion: ");
        num2 = sc.nextInt();
        System.out.println("\n\n=========================================");
        Fraccion expresion1 = new Fraccion(num1, num2);

        System.out.print("Ingrese el numerador de la 2da expresion: ");
        num1 = sc.nextInt();
        System.out.print("Ingrese el denominador de la 2da expresion: ");
        num2 = sc.nextInt();

        Fraccion expresion2 = new Fraccion(num1, num2);
        System.out.println("\n\n=========================================");
        expresion1.sumaFraccion(expresion2);
        expresion1.restaFraccion(expresion2);
        expresion1.multiFraccion(expresion2);
        expresion1.divFraccion(expresion2);

    }
}
