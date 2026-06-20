
import javax.swing.JOptionPane;

public class Exercicio05 {

    public void executar() {

        String nome = JOptionPane.showInputDialog("Digite o nome da criança");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da criança"));
        boolean entra;
        if(idade >= 10){
          entra = true;
        } else {
          entra = false;
        }
        

        JOptionPane.showMessageDialog(
                null,
                "Aluno: " + nome
                + "\nIdade: " + idade
                + "\nEntra no brinquedo: " + entra
        );
        /*Criar uma classe chamada Exercicio05.
   Criar o método main.

   O que deve ser feito:
   - Solicitar o nome de uma criança.
   - Solicitar a idade da criança.
   - Converter a idade para int.
   - Verificar se a criança pode entrar em um brinquedo.
   - A criança só pode entrar se tiver 10 anos ou mais.
   - Apresentar uma mensagem informando:
     a) nome da criança
     b) idade
     c) se pode ou não entrar no brinquedo */
    }
}
