package listaGeneralizada;

public class Pilha {
    private int TF = 40;
    private int TL = 0;
    private final NodoGenerico[] pilha = new NodoGenerico[TF];

    public Pilha() {
    }

    public int getTF() {
        return TF;
    }

    public void setTF(int TF) {
        this.TF = TF;
    }

    public int getTL() {
        return TL;
    }

    public void setTL(int TL) {
        this.TL = TL;
    }
    
    public void empilha(NodoGenerico n){
        pilha[TL++] = n;
    }
    public NodoGenerico desempilha(){
        return pilha[TL--];
    }
    public NodoGenerico desempilhaTudo(){
        TL = 0;
        return pilha[TL];
    }

    public boolean vazia() {
        return TL == 0;
    }
}
