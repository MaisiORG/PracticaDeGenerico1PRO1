public class Main {
    public static void main(String[] args) {

        System.out.println("PILA DE NUMEROS");

        Pila<Integer> pilaNumeros = new Pila<>();

        pilaNumeros.apilar(100);
        pilaNumeros.apilar(200);

        System.out.println("Numero en la cima: "+pilaNumeros.cima());
        System.out.println("Numero desapilado: "+pilaNumeros.desapilar());
        System.out.println("Numero desapilado: "+pilaNumeros.desapilar());
        System.out.println("Numero desapilado: "+pilaNumeros.desapilar());
        System.out.println("Numero en la cima: "+pilaNumeros.cima());
        System.out.println("Numero está vacio?: "+pilaNumeros.estaVacia());
        System.out.println("Tamaño del la Pila: "+pilaNumeros.tamanio());

        System.out.println("PILA DE TEXTOS");

        Pila<String> pilaTextos = new Pila<>();

        pilaTextos.apilar("Genericos");

        System.out.println("Texto que se va a desapilar:" +pilaTextos.desapilar());
        System.out.println("Texto que se va a desapilar:" +pilaTextos.desapilar());
        System.out.println("Texto esta vacio? "+pilaTextos.estaVacia());

        System.out.println("PILA DE NUMEROS DECIMALES");

        Pila<Double> pilaDecimales = new Pila<>();

        pilaDecimales.apilar(300.0);
        pilaDecimales.apilar(500.0);

        System.out.println("Decimal en la cima: "+pilaDecimales.cima());
        System.out.println("Decimal desapilado: "+pilaDecimales.desapilar());
        System.out.println("Decimal desapilado: "+pilaDecimales.desapilar());
        System.out.println("Decimal desapilado: "+pilaDecimales.desapilar());
        System.out.println("Decimal en la cima: "+pilaDecimales.cima());
        System.out.println("Decimal está vacio?: "+pilaDecimales.estaVacia());
        System.out.println("Tamaño del la Pila: "+pilaDecimales.tamanio());
    }
}