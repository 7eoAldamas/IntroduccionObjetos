public class Circulo {
//---

    private float radio;

//--- Constructor Círculo
    public Circulo (String ejercicio){ //Constructor por defecto
        System.out.println(ejercicio);
    }

    public Circulo (String ejercicio, float radio){
        this(ejercicio);
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
}
