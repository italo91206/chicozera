package duplamenteEncadeada;

public class Lista {
    private No inicio;
    private No fim;

    public Lista() {
    }
    public void inicializa(){
        this.inicio = this.fim = null;
    }
    public void inserirNoInicio(int info){
        No no = new No(null, null, info);
        if(this.fim == null)
            this.inicio = this.fim = no;
        else
            this.inicio = no;
    }
    public void inserirNoFinal(int info){
        No no = new No(this.fim, null, info);
        this.fim.setProx(no);
        this.fim = no;
    }
    public void exibir(){
        No aux = this.inicio;
        while(aux != null){
            System.out.println(aux.getInfo());
            aux = aux.getProx();
        }
        
    }
    public void exibirFinal(){
        System.out.println(this.fim.getInfo());
    }
    public void buscaExaustiva(){
        
    }
    public void remover(int info){
        No aux = this.inicio;
        while(aux.getInfo() != info)
            aux = aux.getProx();
        
        while(aux.getProx() != null){
            aux.setInfo(aux.getProx().getInfo());
            aux = aux.getProx();
        }
        this.fim = aux.getAnt();
        this.fim.setProx(null); 
    }
    
    
}
