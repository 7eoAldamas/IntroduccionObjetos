public class Cuadrado {
//---

    private int lado;

    //--- Constructor Cuadrado
    public Cuadrado(String nombre) { //Constructor por defecto
        System.out.println(nombre);
    }

    public Cuadrado(String nombre, int lado) { //Constructor con parámetro
        this(nombre);
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
    public void resultadoCuadrado(){
        System.out.println("*-*\tEl area del cuadrado es: "+areaCuadrado(getLado()));
        System.out.println("*-*\tEl perimetro del cuadrado es: "+perimetroCuadrado(getLado()));
    }
}
