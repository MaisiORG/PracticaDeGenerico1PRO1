//Vamos a utilizar A y B para representar que los dos valores que pueden ser de tipos distintos
public class Par <A, B> {

    private A primero;
    private B segundo;

    //CONSTRUCTOR
    public Par(A primero, B segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    //GETTER AND SETTER
    public A getPrimero() {
        return primero;
    }

    public void setPrimero(A primero) {
        this.primero = primero;
    }

    public B getSegundo() {
        return segundo;
    }

    public void setSegundo(B segundo) {
        this.segundo = segundo;
    }

    //MÉTODOS

    public Par<B, A> invertir() {
        return new Par<>(this.segundo, this.primero);
    }

    //toString (para que se vea bien)
    @Override
    public String toString() {
        return "(" + primero + ", " + segundo + ")";
    }
}