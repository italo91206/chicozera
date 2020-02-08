package metodos;

public class BuscaSequencial {
    private int vetor[];
    private int TL;

    public BuscaSequencial() {
        this.vetor = null;
        this.TL = 0;
    }

    public BuscaSequencial(int[] vetor) {
        this.vetor = vetor;
        this.TL = vetor.length;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }

    public int getTL() {
        return TL;
    }

    public void setTL(int TL) {
        this.TL = TL;
    }
    
    public int start(int chave){
        int pos = 0;
        
        while( pos < this.TL && chave != this.vetor[pos]){
            pos++;
        }
        if(pos < this.TL && chave == this.vetor[pos])
            return pos;
        else
            return -1;
//            return pos + this.TL;
    }
    
    public void exibeVetor(){
        for (int i=0; i< this.vetor.length; i++)
            System.out.println("[" + i + "] " + this.vetor[i]);
    }
}
