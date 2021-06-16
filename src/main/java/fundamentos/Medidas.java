package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        String opcao = " ";
        double area = 0; //Receber o resultado dos calculos de area


        while (!opcao.toUpperCase().equals("S")) {
        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) Area do Quadrado");
        System.out.println("(2) Area do Retangulo");
        System.out.println("(3) Area do Triangulo");
        System.out.println("(4) Area do Circulo");
        System.out.println("(5) Tabuada");
        System.out.println("(6) Fibonacci");
        System.out.println("(7) Contagem Regressiva");
        System.out.println("(s) Sair");

        opcao = entrada.nextLine(); //Leitura da opcao
        switch (opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "3":
                area = calcularAreaDoTriangulo();
                break;
            case "4":
                area = calcularAreaDoCirculo();
                break;
            case "5":
                tabuada();
                break;
            case "6":
                Fibonacci();
                break;
            case "7":
                contagemRegressiva();
                break;
            case "s":
                System.out.println("Agradecemos pela preferencia! Fui!!");
                break;
            default:
                System.out.println("Opcao invalida: " + opcao);

        }
        if (area > 0){

        System.out.println("A area e de: " + area + "m²" );
    }}}


    public static int calcularAreaDoQuadrado(){

        int lado;

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //Leitura do tamanho do lado


        //Desenhar o quadrado
        for(int linha = 1; linha <= lado; linha+=2) {
        for(int coluna = 1; coluna <= lado; coluna++ ) {
            System.out.print("▓");
        }
            System.out.println(" ");
        }
        System.out.println(" ");


        return lado * lado;

    }
    public static int calcularAreaDoRetangulo(){

        int base;
        int altura;

        System.out.println("Digite o tamanho da base e depois a altura do retangulo: ");
        base = entrada.nextInt();
        altura = entrada.nextInt();
        return base * altura;
    }
    public static int calcularAreaDoTriangulo(){

        int base;
        int altura;

        System.out.println("Digite o tamanho da base e depois a altura do triangulo: ");
        base = entrada.nextInt();
        altura = entrada.nextInt();
        return base * altura / 2;
    }
    public static double calcularAreaDoCirculo(){

        double pi = 3.1415;
        int raio;



        System.out.println("Digite o valor do raio; ");
        raio = entrada.nextInt();
        return raio * raio * pi;


    }

    public static void tabuada(){
        System.out.print("Voce quer calcular a tabuada de qual numero? ");
        byte numero = entrada.nextByte();

        for (byte i=1;i<=10;i++){
            System.out.print(numero * i + " ");
        }
    }

    public static void Fibonacci(){

        System.out.println("Quantos numeros deseja calcular na sequencia? ");
        byte numero = entrada.nextByte();

        switch (numero){
            case 0:
                System.out.println("A sequencia esta vazia.");
                break;
            case 1:
                System.out.println("Sequencia de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                System.out.print("Sequencia de Fibonacci: 1 ");
                for(byte i = 2; i <= numero; i++ ){
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;

                }

        }

    }


    public static void contagemRegressiva(){
        System.out.print("Começar a contagem a partir de qual numero? ");
        int numero = entrada.nextInt();

        System.out.print("Diminuindo de quantos em quantos numeros por vez? ");
        int reduz = entrada.nextInt();

        for(int i = numero; i >= 1; i-= reduz){

            System.out.println(i);
        }

    }
}
