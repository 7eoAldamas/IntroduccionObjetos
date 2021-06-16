public class Principal {
    //---Constructor Principal
    public Principal (String nombre){
        System.out.println(nombre);
        initContador();
        initCuadrado();
        initCirculo();
        initRectangulo();
        initLibro();
        initFraccion();
    }

    private void initContador() {
        Contador contador = new Contador("Clase Contador", 5);
        Contador conAux = contador;
        conAux.setContador(2);
        conAux.setAuxcontador(2);
        conAux.resultadoInDe();
    }

    private void initCuadrado() {
        Cuadrado cuadrado = new Cuadrado("Clase Cuadrado", 4);
        Cuadrado cuaAux = cuadrado;
        cuaAux.setLado(9);
        cuaAux.resultadoCuadrado();
    }

    private void initCirculo() {
        Circulo circulo = new Circulo("Clase Circulo", 12);
        Circulo cirAux = circulo;
        cirAux.setRadio(15);
        cirAux.resultadoCirculo();
    }

    private void initRectangulo() {
        Rectangulo rectangulo = new Rectangulo("Clase Rectangulo", 4, 10);
        Rectangulo recAux = rectangulo;
        recAux.setAncho(5);
        recAux.resultadosRectangulo();
    }

    private void initLibro() {
        Libro libro = new Libro("Clase Libro", "Encellal y Pullil");
        Libro libAux = libro;
        System.out.println("Disponibilidad del libro: "+libAux.isOcupado());
        libAux.prestarLibro();
        System.out.println("Disponibilidad del libro: "+libAux.isOcupado());
        libAux.devolverLibro();
        System.out.println("Disponibilidad del libro: "+libAux.isOcupado());
    }

    private void initFraccion() {
        System.out.println("\nClase Fraccion\n");
        Fraccion fraccion = new Fraccion(1, 5);
        Fraccion fracc2 = new Fraccion(5, 2);
        fraccion.sumaFraccion(fracc2);
        fraccion.restaFraccion(fracc2);
        fraccion.multiFraccion(fracc2);
        fraccion.divFraccion(fracc2);
    }


    public static void main(String[] args) {
        //--- Código Ejecutable
        new Principal("Principal");
    }
}
