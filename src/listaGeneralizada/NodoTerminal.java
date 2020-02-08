package listaGeneralizada;

public class NodoTerminal extends NodoBasico {
    private char info;

    public NodoTerminal() {
    }

    public NodoTerminal(char info) {
        this.info = info;
    }

    public char getInfo() {
        return info;
    }

    public void setInfo(char info) {
        this.info = info;
    }
    
}
