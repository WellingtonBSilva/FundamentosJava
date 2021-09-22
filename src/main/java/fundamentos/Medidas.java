// 1 - Pacote
package fundamentos;

// 2 - Biclioteca

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada =  new Scanner(System.in); // instanciar o objeto de leiutra do console;

    // 3.2 Métodos e Funções
    public static void main(String[] args){
        String opcao;
        int area = 0; // recebe o resultado dos cálculos de áreas

        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        opcao = entrada.nextLine(); // leitura da opção
        switch (opcao){
            case "1":
               area = calcularAreaQuadrado();
               break;
            default:
                System.out.println("Valor invalido: " + opcao);
        }
        if(area > 0){
            System.out.println("A area e de " + area + "m²");
        }

    }

    public static int calcularAreaQuadrado(){
        int lado;

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // circunflexo é usado para elevar ao quadrado
    }

}
