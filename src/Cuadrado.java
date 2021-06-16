public class Cuadrado {
//---

    String ejercicio;
    private int lado;

    //--- Constructor Cuadrado
    public Cuadrado(String ejercicio) { //Constructor por defecto
        System.out.println(ejercicio);
    }

    public Cuadrado(String ejercicio, int lado) { //Constructor con parámetro
        this(ejercicio);
        this.lado = lado;
    }

    //--- Métodos de Acceso
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    //--- Método para el área
    public int areaCuadrado(int lado){
        return (lado * lado);
    }

    //--- Método para el perímetro
    public int perimetroCuadrado(int lado){
        return (4*lado);
    }

    //--- Método para mostrar resultados
    public void mostrarResultados(){
        System.out.println("*-*\tEl area del cuadrado es: "+areaCuadrado(getLado()));
        System.out.println("*-*\tEl perimetro del cuadrado es: "+perimetroCuadrado(getLado()));
    }
}
