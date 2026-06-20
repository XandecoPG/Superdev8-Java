
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Exercicio04{
    public void executar(){
        
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String livroEmprestado = JOptionPane.showInputDialog("Digite o nome do livro emprestado");
        int quantosDias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias ficará com o livro"));
        
        LocalDate hoje = LocalDate.now();
        LocalDate devolucao = hoje.plusDays(quantosDias);

         JOptionPane.showMessageDialog(
            null,
            "Aluno: " + nome +
            "\nLivro: " + livroEmprestado +
            "\nDias de empréstimo: " + quantosDias +
            "\nData aproximada de devolução: " + devolucao +
            "\n\nEmpréstimo registrado com sucesso!"
         );

        
        /*Criar uma classe chamada Exercicio04.
   Criar o método main.

   O que deve ser feito:
   - Solicitar com JOptionPane o nome de um aluno.
   - Solicitar com JOptionPane o nome de um livro emprestado.
   - Solicitar com JOptionPane a quantidade de dias que o livro ficará emprestado.
   - Converter a quantidade de dias para int.
   - Calcular a data aproximada de devolução considerando apenas a quantidade de dias informada.
   - Apresentar em uma mensagem:
     a) nome do aluno
     b) nome do livro
     c) quantidade de dias de empréstimo
     d) mensagem informando que o empréstimo foi registrado */
    }
}