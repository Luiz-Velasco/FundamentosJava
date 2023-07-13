package fundamentos;

import org.example.Main;

import java.util.Scanner;

public class Medidas {
static Scanner entrada;
    public static void main(String[] args) {
        String opcao;
        int area = 0;
        entrada = new Scanner(System.in);
            System.out.println("Escolha o calculo desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retangulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");
        opcao = entrada.nextLine(); // leitura da opção
        switch (opcao){
            case "1":
           area = calcularAreaDoQuadrado();
                break;
            default:
                System.out.println("Valor invalido: " + opcao);
        }
        if (area > 0) {
            System.out.println("A area é de " + area);
        }
    }
    public static int calcularAreaDoQuadrado(){
        int lado; // tamanho do lado quadrado
        System.out.println("Digite o tamanho do lado");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // retorna a area do quadrado

    }
}
