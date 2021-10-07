package fundamentos;

import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada;

public class Calculos {
    public static void main(String[] args){
        System.out.print("Deseja calcular a tabuada? <S/N> ");
        String resposta = entrada.nextLine();
        if (resposta.toUpperCase().equals("S"))
            tabuada();
    }
}
