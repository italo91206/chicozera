package duplamenteEncadeadaArquivo;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arquivo {
    private String nomearquivo;
    private RandomAccessFile arquivo;
    private Registro pivo = new Registro();

    public Arquivo(String nomearquivo) {
        try{
            arquivo = new RandomAccessFile(nomearquivo, "rw");
        }
        catch(IOException e){
            
        }
    }
    
    public void truncate(long pos){ // desloca eof
        try{
            arquivo.setLength(pos * pivo.length());
            // o professor passou a seguinte linha -> arquivo.setLength(pos * Registro.length());
            // mas ao que parece não consigo dar registro.length()
            // por tanto foi criado um atributo pivô só pra poder pegar o tamanho dele.
        }
        catch(IOException e){
            
        }
    }
    
    public boolean eof(){
        boolean retorno = false;
        try{
            if(arquivo.getFilePointer() == arquivo.length())
                retorno = true;
        }
        catch(IOException e){
            
        }
        return retorno;
    }
    
    public void inserirRegNoFinal(Registro reg){
        try {
            seekArq((int)arquivo.length());
            reg.gravaNoArq(arquivo);
        }
        catch (IOException e) {}
    }
    
    public void exibirArq(){
        int i;
        Registro aux = new Registro();
        seekArq(0);
        i = 0;
        while(!this.eof()){
            System.out.println("Posicao "+i);
            aux.leDoArq(arquivo);
            aux.exibirReg();
            i++;
        }
    }
    
    public void exibirUmRegistro(long pos){
        seekArq(0);
        Registro aux = new Registro();
        System.out.println("Posicao " + pos);
        aux.leDoArq(arquivo);
        aux.exibirReg();
    }
    
    public void seekArq(int pos){
        try{
            arquivo.seek(pos * pivo.length());
        }
        catch(IOException e){
            
        }
    }
    
    public void leArq()
    {
        int codigo, idade;
        String nome;
        codigo = Entrada.leInteger("Digite o código");
        while (codigo != 0)
        {
            nome = Entrada.leString("Digite o nome");
            idade = Entrada.leInteger("Digite a idade");
            inserirRegNoFinal(new Registro(codigo, nome, idade));
            codigo = Entrada.leInteger("Digite o código");
        }
    }
    
    public void executa(){
        leArq();
        exibirArq();
    }
    
}
