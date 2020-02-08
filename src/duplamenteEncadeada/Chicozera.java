package duplamenteEncadeada;

public class Chicozera {


    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserirNoInicio(1);
        lista.inserirNoFinal(2);
        lista.inserirNoFinal(3);
        lista.inserirNoFinal(4);
        lista.inserirNoFinal(5);
        lista.inserirNoFinal(6);
        lista.inserirNoFinal(7);
        lista.remover(3);
        lista.exibir();
    }
    
}
