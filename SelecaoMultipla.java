package ExerciciosLógicaProgra;
import java.util.Scanner;
public class SelecaoMultipla { // if...(simples)//if... else(composta)// if-else-if(encadeada)//switch case (multipla)
    //LISTA 3 FOR E WHILE
    public static void main(String[] args) {
        //Ler um número inteiro maior que zero e menor que 100
//        for (int i = 1; i < 100; i++){
//            System.out.println(i);
//            if (i%2 != 0){
//                System.out.println("número ímpar: " +i);
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
        //0 5 10 15 20 25 30 35 40 Acabou!
//        for (int i = 5; i < 41; i++){
//            if (i % 5 == 0){
//                System.out.println(i);
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
//        //100 90 80 70 60 50 40 30 20 10 0 Acabou!
//        for (int i = 0; i < 101; i++){
//            if (i%10 == 0){
//                System.out.println(i);
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
//        //3. Escreva um programa que leia um número qualquer e mostre a tabuada desse número, usando a estrutura “For”.
//        //Ex: Digite um valor: 5 5 x 1 = 5 5 x 2 = 10 5 x 3 = 15 ...
//        Scanner scan = new Scanner(System.in);
//        int numero, multi;
//        System.out.println("Digite um algarismos para ser multiplicado: ");
//        numero = scan.nextInt();
//        for (int i = 1; i < 11; i++){
//            multi = i * numero;
//            System.out.println("resultado de: "+i+ " * " +numero+ " é: " +multi);
//        }
//----------------------------------------------------------------------------------------------------------------------
//        //4-> 9 Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM
//        for (int i = 0; i < 10; i++){
//            System.out.print(i);
//        }
//----------------------------------------------------------------------------------------------------------------------
        //5 -> Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura “For”.
        //a) Quantas mulheres foram cadastradas
        //b) Quantos homens pesam mais de 100Kg
        //c) A média de peso entre as mulheres
        //d) O maior peso entre os homens
//        Scanner scan = new Scanner (System.in);
//        char sexo; // F/M
//        double peso, soma = 0, media;
//        int mulheres = 0, homens = 0, maior = 0;
//
//        for (int i = 0; i < 8; i++){ //8 pessoas
//            System.out.println("Digite seu sexo: F ou M");
//            sexo = scan.next().charAt(0);
//            if (sexo == 'F'){
//                mulheres++; //QUANTIDADE DE MULHERES
//            }
//            System.out.println("Informe seu pesos: ");
//            peso = scan.nextDouble();
//            if (sexo == 'M' && peso > 100){
//                homens++; //PESO DOS HOMENS MENOR QUE 100
//            }
//            if (sexo == 'M' && peso > maior){
//                maior = (int) peso; //MAIOR PESO ENTRE OS HOMENS
//            }
//            if (sexo == 'F'){
//                soma = soma + peso; //MEDIA DE PESO DAS MULHERES
//            }
//        }
//        media = soma/8;
//        System.out.println("mulheres cadastradas: " +mulheres);
//        System.out.println("homens +100kg: " +homens);
//        System.out.println("media de pesos: " +media);
//        System.out.println("maior peso entre os homens: " +maior);
//
//
////----------------------------------------------------------------------------------------------------------------------
//        //8. Escreva um programa que mostre na tela a seguinte contagem:
//        //6 7 8 9 10 11 Acabou!
//        for (int i = 6; i < 12; i++){
//            System.out.println(i);
//        }
//----------------------------------------------------------------------------------------------------------------------
//        //9. Faça um algoritmo que mostre na tela a seguinte contagem:
//        //10 9 8 7 6 5 4 3 Acabou!
//        for (int i = 10; i >= 3; i--){
//            System.out.println(i);
//        }
//----------------------------------------------------------------------------------------------------------------------
//        //10. Crie um aplicativo que mostre na tela a seguinte contagem:
//        //0 3 6 9 12 15 18 Acabou!
//        for (int i = 0; i < 19; i++){
//            if (i%3 == 0){
//                System.out.println(i);
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
//      11. Desenvolva um programa que mostre na tela a seguinte contagem:
//      100 95 90 85 80 ... 0 Acabou!
//        for (int i = 100; i >= 0; i--){
//            if (i%5 == 0){
//                System.out.println(i);
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
//      12. Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
//        qualquer e mostre uma contagem até esse valor:
//        Ex: Digite um valor: 35
//        Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
//        Scanner scan = new Scanner(System.in);
//        int numero;
//        System.out.println("Informe um número inteiro: ");
//        numero = scan.nextInt();
//        for (int i = 1; i <= numero; i++){
//            System.out.println(i);
//        }
//----------------------------------------------------------------------------------------------------------------------
//        13. Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
//                marcando os números que forem divisíveis por 4, exatamente como mostrado
//        abaixo:
//        30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
//        for (int i = 1; i <= 30; i++){
//            if (i%4 != 0) {
//                System.out.println(i);
//            }
//            if (i%4 == 0){
//                System.out.println("[" +i+ "]");
//            }
//        }
//----------------------------------------------------------------------------------------------------------------------
        //INCOMPLETO
//        14. Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
//        incremento, mostrando em seguida todos os valores no intervalo:
//        Ex:
//        Digite o primeiro Valor: 3
//        Digite o último Valor: 10
//        Digite o incremento: 2
//        Contagem: 3 5 7 9 Acabou!
//        Scanner scan = new Scanner(System.in);
//        int primeiro, ultimo, incremento;
//        System.out.println("Informe o primerio valor, o ultimo valor e o incremento: ");
//        primeiro = scan.nextInt();
//        ultimo = scan.nextInt();
//        incremento = scan.nextInt();
//        for (int i = primeiro; i < ultimo; i++){
//            i = incremento;
//            }
//INCOMPLETO
// ---------------------------------------------------------------------------------------------------------------------
        //16. Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 8
        //+ 10 + 12 + 14 + ... + 98 + 100.
//        int soma = 0;
//        int i = 1;
//        while (i < 101){
//            System.out.print(i+ " + "); //1,2,3...+
//            soma = soma +i; //soma recebe = soma + 1,2,3...
//            i++; // i = i + 1
//        }
//        System.out.println("\na soma é: " +soma);
// ---------------------------------------------------------------------------------------------------------------------
        //17. Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
        //450 + 400 + 350 + 300 + ... + 50 + 0
//        int soma = 0;
//        for (int i = 500; i >= 0; i--){
//            if (i%5 == 0){
//                System.out.println(i+ " + ");
//                soma = soma + i;
//                i--;
//            }
//        }
//        System.out.println("\nA soma é: " +soma);
// ---------------------------------------------------------------------------------------------------------------------
        //18. Faça um programa que leia 7 números inteiros e no final mostre o somatório
        //entre eles.
//        int soma = 0;
//        for (int i = 1; i < 8; i++){
//            System.out.print(i+ " + ");
//            soma = soma + i;
//        }
//        System.out.println("\nA soma é: " +soma);
// ---------------------------------------------------------------------------------------------------------------------
        //19. Crie um programa que leia 6 números inteiros e no final mostre quantos deles
        //são pares e quantos são ímpares.
//        for (int i = 1; i < 7; i++){
//            if (i%2 == 0){
//                System.out.println("numero par: " +i);
//            }
//            if (i%2 != 0){
//                System.out.println("numero impar: " +i);
//            }
//        }
// ---------------------------------------------------------------------------------------------------------------------

    }
    }

