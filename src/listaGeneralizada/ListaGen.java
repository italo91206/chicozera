package listaGeneralizada;

public class ListaGen {
    private NodoGenerico inicio;
    private Pilha pilha;
    
    public ListaGen(){
        this.inicio = null;
    }
    public ListaGen(String frase) {
        int aux = 0;
        pilha = new Pilha();
        NodoGenerico nodoAux = inicio;
        while(aux < frase.length()){
            if(frase.charAt(aux) == '['){ 
                // inserir nodoGenerico para head
                NodoGenerico nodoGen = new NodoGenerico(null, null);
                if(nodoAux == null) // caso seja primeira caixa que coloco
                {
                    nodoAux = nodoGen;
                    inicio = nodoAux;
                }
                else
                {
                    nodoAux.setHead(nodoGen);
                    nodoAux = nodoGen;
                    pilha.empilha(nodoAux);
                }
            }
            else{
                if(frase.charAt(aux) == ','){
                    // inserir nodoGenerico para Tail
                    NodoGenerico nodoGen = new NodoGenerico();
                    nodoAux.setTail(nodoGen);
                    nodoAux = nodoAux.getTail();
                    pilha.empilha(nodoAux);
                }
                else{
                    if(frase.charAt(aux) != ']'){
                        // inserir nodoGenerico tail nullo!
                        nodoAux.setTail(null);
                        nodoAux = pilha.desempilha();
                        while(nodoAux != null)
                            nodoAux = pilha.desempilha();
                    }
                    else{
                        if(frase.charAt(aux) >= 97 && frase.charAt(aux) <= 122 ){
                            // Recebi uma letra -> inserir nodoTerminal ( atomo )
                            NodoTerminal nodoTerminal = new NodoTerminal(frase.charAt(aux++)); 
                            nodoAux.setHead(nodoTerminal);
                        }
                    }
                }
            }
            aux++;
        }
    }
    public boolean atomo(NodoBasico n){
        return n instanceof NodoTerminal;
    }
    public boolean nula(NodoBasico n){
        return n == null;
    }
    public void getAtomo(NodoTerminal n){
        System.out.println(n.getInfo());
    }
    public void exibirAtomo(){
        NodoBasico atual;
        Pilha p = new Pilha();
        p.empilha(getInicio());
        while(!p.vazia()){
            atual = p.desempilha();
            if(atual != null){
                if(atual instanceof NodoTerminal){
                    System.out.println(((NodoTerminal) atual).getInfo());
                }
                else{
                    p.empilha(((NodoGenerico)atual).getTail());
                    p.empilha((NodoGenerico)((NodoGenerico)atual).getHead());
                }
            }
        }
        
    }
    public NodoGenerico getInicio(){
        return this.inicio;
    }
}
