public class Contador {
//---

    private int incremento;
    private int decremento;

//--- Constructo de Contador
    public Contador (){ //Constructor por defecto
    }

    public Contador (int incremento, int decremento){ //Constructor con parámetros
        this.incremento = incremento;
        this.decremento = decremento;
    }

    //--- Métodos de Acceso
    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int getDecremento() {
        return decremento;
    }

    public void setDecremento(int decremento) {
        this.decremento = decremento;
    }

    //--- Método para incrementar un número -> num = num + 1
    public void incrementarNumero(int incremento){
        System.out.println(incremento++);
    }

    //--- Método para decrementar un número -> num = num - 1
    public int decrementarNumero(int decremento){
        return this.decremento = decremento--;
    }
}
