package fundamentos;

public class Contadores extends Medidas implements ContadoresMedidas {
    public static void main(String[] args){
        System.out.print("Deseja realizar a contagem regressiva? <S/N> ");
        String resposta = entrada.nextLine();
        if(resposta.toUpperCase().equals("S"))
           ContadoresMedidas.contagemRegressiva();
    }

}
