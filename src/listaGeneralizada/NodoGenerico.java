package listaGeneralizada;

public class NodoGenerico extends NodoBasico{
    private NodoBasico head;
    private NodoGenerico tail;

    public NodoGenerico(NodoBasico head, NodoGenerico tail) {
        this.head = head;
        this.tail = tail;
    }

    public NodoGenerico() {
    }
    

    public NodoBasico getHead() {
        return head;
    }

    public void setHead(NodoBasico head) {
        this.head = head;
    }

    public NodoGenerico getTail() {
        return tail;
    }

    public void setTail(NodoGenerico tail) {
        this.tail = tail;
    }

}
