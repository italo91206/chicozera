package duplamenteEncadeadaArquivo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Entrada {
    static public String leString(String msg){
        String line = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println(msg);
            line = br.readLine();
        }
        catch(Exception e){
        }
        return line;
    }
    static public int leInteger(String msg){
        String line = "";
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try{
            System.out.println(msg);
            line = br.readLine();
            int retorno = Integer.valueOf(line);
            return retorno;
        }
        catch(Exception e){
            return -1;
        }
    }
    
}
