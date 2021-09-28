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
        double area = 0; // recebe o resultado dos cálculos de áreas

        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");
        System.out.println("(5) - Tabuada");
        System.out.println("(6) - Fibonacci");

        opcao = entrada.nextLine(); // leitura da opção
        switch (opcao){
            case "1":
               area = calcularAreaQuadrado();
               break;
            case "2":
                area = calcularAreaRetangulo();
                break;
            case "3":
                area = calcularAreaTriangulo();
                break;
            case "4":
                area = calcularAreaCirculo();
                break;
            case "5":
                tabuada();
                break;
            case "6":
                fibonacci();
                break;
            default:
                System.out.println("Valor Invalido: " + opcao);
        }
        if(area > 0){
            System.out.println("A area e de " + area + "m²");
        }

    }

    public static int calcularAreaQuadrado(){
        int lado;

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado

        //Desenhar o quadrado
        for(int linha = 1; linha <= lado; linha+=2){
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        System.out.println(""); // pular linha
        return lado * lado; // circunflexo é usado para elevar ao quadrado
    }

    public static int calcularAreaRetangulo(){
        int base;
        int altura;

        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return base * altura;
    }

    public static int calcularAreaTriangulo(){
        int base;
        int altura;

        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return (base * altura)/2;
    }

    public static double calcularAreaCirculo(){
        int raio;
        double area;

        System.out.println("Digite o tamanho do raio: ");
        raio = entrada.nextInt();
        return 3.14 * (raio * raio);
    }

    public static void tabuada(){
        System.out.print("Você quer calcular a tabuada de qual numero? ");
        byte numero = entrada.nextByte();

        for(byte i=1;i<=10;i++){
            System.out.print(numero * i + ", ");
        }
    }

    public static void fibonacci(){
        System.out.print("Quantos numeros deseja calcular na sequencia? ");
        byte numero = entrada.nextByte();
    }
}
