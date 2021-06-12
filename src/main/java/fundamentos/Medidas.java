package fundamentos;

import java.util.Scanner;

public class Medidas {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        String opcao;
        int area = 0; //Receber o resultado dos calculos de area



        System.out.println("Escolha o Calculo Desejado");
        System.out.println("(1) Area do Quadrado");
        System.out.println("(2) Area do Retangulo");
        System.out.println("(3) Area do Triangulo");
        System.out.println("(4) Area do Circulo");

        opcao = entrada.nextLine(); //Leitura da opcao
        switch (opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                //ToDo: Calcular area do retangulo
                break;
            default:
                System.out.println("Opcao invalida: " + opcao);

        }
        if (area > 0){

        System.out.println("A area e de: " + area + "m²" );
    }}

    public static int calcularAreaDoQuadrado(){

        int lado;

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //Leitura do tamanho do lado
        return lado * lado;

    }



}
