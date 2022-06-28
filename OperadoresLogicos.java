package ExerciciosLógicaProgra;
import java.nio.channels.FileLock;
import java.util.Scanner;
public class OperadoresLogicos {
    public static void main(String[] args) {
        //Um programa que lê três números inteiros distintos e
        //imprime o maior dos três

//        Scanner in = new Scanner(System.in);
//        int n1, n2, n3;
//        System.out.println("Digite o primeiro inteiro");
//        n1 = in.nextInt();
//        System.out.println("Digite o segundo inteiro");
//        n2 = in.nextInt();
//        System.out.println("Digite o terceiro inteiro");
//        n3 = in.nextInt();
//        if ( (n1 > n2) && (n1 > n3) ) {
//            System.out.println(n1);
//        } else if (n2 > n3) {
//            System.out.println(n2);
//        } else {
//            System.out.println(n3);
//        }

        //-----------------FORMA MAIS REDUZIDA-------------------------------//
//        Scanner scan = new Scanner(System.in);
//        int n1, n2, n3;
//        System.out.println("Digite três números inteiros: ");
//        n1 = scan.nextInt();
//        n2 = scan.nextInt();
//        n3 = scan.nextInt();
//            if(n1 > n2 && n1 > n3){
//                System.out.println("O maior número é: "+n1);
//            } else if (n2 > n1 && n2 > n3) {
//                System.out.println("O maior número é: "+n2);
//            } else if (n3 > n2 && n3 > n1) {
//                System.out.println("O maior número é: "+n3);
//            }

//------------------------------------------------------------------------------------------------------//
//        Ler um valor real correspondente a uma  nota, tal que 0 ≤ nota ≤ 10, e imprimir o
//        conceito equivalente (A, B, C, D ou E), conforme a seguinte tabela:
//            A 8,5 <= nota <= 10
//            B 7,0 <= nota < 8,5
//            C 5,0 <= nota < 7,0
//            D 3,0 <= nota < 5,0
//            E       nota < 3,0
//
//        Scanner scan = new Scanner(System.in);
//        float nota;
//        System.out.println("Digite uma nota: ");
//        nota = scan.nextFloat();
//            if (nota >= 8.5f){ // 10 > nota > 8.5
//                System.out.println("nota A");
//            } else if (nota >= 7.0f) {
//                System.out.println("nota B");
//            } else if (nota <= 7.0f) {
//                System.out.println("nota C");
//            } else if (nota <= 5.0f) {
//                System.out.println("nota D");
//            } else if (nota <= 3.0f) {
//                System.out.println("nota E");
//            }
//----------------------------------------------------------------------------------------------------------------
//        //CALCULAR O INDICE CORPORAL DE UMA PESSOA IMC = PESO/ALTURA²
//        Scanner scan = new Scanner(System.in);
//        double peso, altura, imc;
//
//        System.out.println("Digite seu peso e sua altura, respectivmente: ");
//        peso = scan.nextDouble();
//        altura = scan.nextDouble();
//        imc = peso/(Math.pow(altura,2));
//        System.out.println("Seu IMC é: " +imc);
//        do {
//            if (imc <= 18.5){
//                System.out.println("Abaixo do peso");
//            } else if (imc > 18.5 && imc <= 25 ) {
//                System.out.println("Peso normal");
//            } else if (imc > 25 && imc <= 30) {
//                System.out.println("Acima do peso");
//            } else if (imc > 30) {
//                System.out.println("Obeso");
//            }
//        }while (imc == 0);
//------------------------------------------------------------------------------------------------
//        Ler valores para os três lados de um  triângulo e dizer o seu tipo (equilátero, isósceles ou escaleno).
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
//-----------------------------------------------------------------------------------------------------------
//        Scanner scan = new Scanner(System.in);
//        double pontoX, pontoY, origem;
//        System.out.println("Digite os pontos X e Y respectivamente ");
//        pontoX = scan.nextDouble();
//        pontoY = scan.nextDouble();
//        if (pontoX == 0){
//            System.out.println("está no eixo x");
//        } else if (pontoY == 0) {
//            System.out.println("está no eixo y");
//        } else if (pontoX == 0 && pontoY == 0) {
//            System.out.println("está na origem");
//        }
        //calcular média
        Scanner scan = new Scanner(System.in);
        double notaA, notaB, media, mediaF;
        System.out.println("Digite suas notas AP1 e AP2, respectivamente: ");
        notaA = scan.nextDouble();
        notaB = scan.nextDouble();

        media = (notaA + notaB) / 2;
        System.out.println("nota media: " +media);

        if (media >= 7) {
            System.out.println("aprovado");
        } else if (media < 7) {
            System.out.println("prova final");
        }

        System.out.println("AVALIAÇÃO FINAL\nDigite sua média: ");
        mediaF = scan.nextDouble();
        mediaF = (media + mediaF) / 2;
        System.out.println("nota media final: " +mediaF);

        if (mediaF > 5) {
            System.out.println("aprovado!");
        } else if (mediaF < 5) {
            System.out.println("reprovado");
        }
    }
}
