package po;

import metodos.BuscaSequencial;


public class PO {
    
    public static void buscaSequencial(){
        int vetor[] = new int[] {5, 2, 10, 3, 7, 1, 9, 8};
        
        BuscaSequencial busca = new BuscaSequencial(vetor);  
        busca.exibeVetor();
        System.out.println("Posição é: " + busca.start(9));
    }
    
    public static void main(String[] args) {
        System.out.println("Descomente a função desejada. Sinta-se livre para alterar o vetor também.");
        //buscaSequencial();
    }   
    
}
