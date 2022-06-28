package ExerciciosLógicaProgra;
import java.util.Scanner;
public class EstruturaRepeticao { // for, do while, while
    public static void main(String[] args) {
        //1
//        Scanner scan = new Scanner(System.in);
//        char op;
//        double numA, numB;
//        System.out.println("Digite dois números para serem calculados: ");
//        numA = scan.nextDouble();
//        numB = scan.nextDouble();
//        System.out.println("Pressione '+' para somar os dois valores");
//        op = scan.next().charAt(0);
//        switch (op){
//            case '+' :
//                System.out.println(("O valor somado é:\n" +(numA+numB)));
//                break;
//            default:
//                System.out.println("Caractere incorreto!");
//        }
// -------------------------------------------------------------------------------------------------------
        //3)- gere os números de 1000 a 1999 e escreva somente os números que são
        //divisíveis por 11 e cujo resto é 5
//        for (int numero = 1000; numero < 2000; numero++){
//            System.out.println(numero);
//            if (numero / 11 == 0){
//                System.out.println("divisiveis por 11: " +numero);
//            } else if (numero % 5 == 0) {
//                System.out.println("resto 5: " +numero);
//            }
//        }
//----------------------------------------------------------------------------------------------------------
        //4) - Escreva um algoritmo que calcule a média dos números digitados pelo usuário, se eles forem pares.
        // Termine a leitura se o usuário digitar zero (0).
//        Scanner scan = new Scanner(System.in);
//        double numA,numB, media;
//        System.out.println("Digite dois valores: ");
//        numA = scan.nextDouble();
//        numB = scan.nextDouble();
//        if (numA == 0 || numB == 0){
//            System.out.println("Inválido!");
//        }
//        media = (numA + numB) / 2;
//        System.out.println(numA+ " + " +numB+ " / 2 = " +media );
//
//            if (media % 2 == 0){
//                System.out.println(media+ " é par");
//            } else if (media % 2 != 0) {
//                System.out.println("não é par");
//            }
//-------------------------------------------------------------------------------------------------------------
        //5) e leia os três lados de um triângulo (A, B, C)
//        Scanner scan = new Scanner(System.in);
//        int ladoA, ladoB, ladoC;
//        System.out.println("Digite os lados do triãngulo");
//        ladoA = scan.nextInt();
//        ladoB = scan.nextInt();
//        ladoC = scan.nextInt();
//        do {
//            //equilátero (3 iguais)
//            if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
//                System.out.println("Triângulo equilátero");
//            }
//            // isósceles (2 iguais)
//            else if (ladoA == ladoB && ladoA != ladoC || ladoB != ladoA && ladoC == ladoA || ladoB == ladoC) {
//                System.out.println("Triângulo isósceles");
//            }
//            //escaleno (3 lados diferentes)
//            else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
//                System.out.println("Triângulo escaleno");
//            }
//
//        }while (ladoA == 0 && ladoB == 0 && ladoC == 0);
//---------------------------------------------------------------------------------------------------------------------
        //6) calcule o salário semanal de um trabalhador. As entradas são o número de horas
        //trabalhadas na semana e o valor da hora. Até 40 h/semana não se acrescenta nenhum adicional. Acima de 40h e
        //até 60h há um bônus de 50% para essas horas. Acima de 60h há um bônus de 100% para essas horas
//        Scanner scan = new Scanner(System.in);
//        int horas, valorHora, valor, salario;
//        System.out.println("Digite o numero de horas trabalhadas na semana e o valor a hora, respectivamente: ");
//        horas = scan.nextInt();
//        valorHora = scan.nextInt();
//        valor = horas * valorHora;
//        System.out.println("valor a hora: "+valor);
//        if (valor <= 40){
//            System.out.println("nenhum acrescimo adicional");
//        } else if (valor >= 60 ) {
//            salario = ((int) (valor * 1.50));
//            System.out.println("acrescimo de 50% " +salario);
//        } else if (valor > 60) {
//            salario =  (valor * 1) ;
//            System.out.println("acrescimo de 100%: " +salario);
//        }
//
    }
}