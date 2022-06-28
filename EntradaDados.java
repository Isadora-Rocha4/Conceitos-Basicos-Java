package ExerciciosLógicaProgra;
import javax.swing.*;
import java.util.Scanner;
public class EntradaDados {
    //caixa de diálogo
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = null;
        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
        JOptionPane.showMessageDialog(null, nome);

        //caixa de diálogo com confirmação
        int resposta;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é " + nome + "?");


        //condição do dialogo com confirmação
        if (resposta == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Seu nome é " + nome); //yes
        } else {
            JOptionPane.showMessageDialog(null, "Seu nome não é " + nome); //no
        }

        //idade
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        JOptionPane.showMessageDialog(null, "Seu nome é "+nome+ " e você tem "+idade+ " anos");

    }
}
