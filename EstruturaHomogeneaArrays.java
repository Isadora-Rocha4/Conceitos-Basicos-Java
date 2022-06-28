package ExerciciosLógicaProgra;
import java.util.Scanner;
public class EstruturaHomogeneaArrays {
    public static void main(String[] args) {
        //1. leitura de 10 números, ordem direta e inversa
        int[] minhaArray = new int[10];
        for (int i = 0; i < minhaArray.length; i++) {//i = i + 1 //somará o resto da ARRAY
            minhaArray[i] = (i+1); //Array inicial recebe valor 1
            System.out.println("Posição: " +i+ " valor: " +minhaArray[i]);
        }
        System.out.println("Ordem Invertida: ");
        for (int i = minhaArray.length-1; i >= 0; i-- ) {
            minhaArray[i] = (i+1);
            System.out.println("Posição: " + i + " valor: " + minhaArray[i]);
        }
        leitura();
    }

    public static void leitura(){
        Scanner scan = new Scanner(System.in);
        float valor, soma = 0, media = 0;
        int qtde = 0;
        do {
            System.out.println("Digite 10 valores: ");
            valor = scan.nextFloat();

            if (valor < 0) {
                System.out.println("Valor invalido. Digite um valor positivo! ");
            }
            else if (valor < 10) {
                qtde = qtde + 1;
                soma =+ valor;
                System.out.println(soma);
            }
        } while (valor != 0);
        media = soma / qtde;
        System.out.println(media);

    }
}
