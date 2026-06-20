

public class Exercicio02{
    /*
    2. Criar uma classe chamada Exercicio02.
   Criar o método main.

   O que deve ser feito:
   - Criar uma variável String para armazenar o título de um livro.
   - Criar uma variável String para armazenar o nome do autor.
   - Criar uma variável int para armazenar a quantidade de páginas.
   - Criar uma variável double para armazenar a avaliação do livro.
   - Criar uma variável boolean para informar se o livro já foi lido.
   - Criar uma variável char para armazenar a classificação do livro.
   - Apresentar todas as informações no console.
     */

    public void executar(){
        String tituloLivro = "United Games";
        String nomeAutor = "Restart";
        int quantidadePaginas = 99;
        double avalicacaoLivro = 8;
        boolean lido = true;
        char palavraFavorita = '.';

        System.out.println("Título: " + tituloLivro);
        System.out.println("Autor: " + nomeAutor);
        System.out.println("Quantidade de páginas: " + quantidadePaginas);
        System.out.println("Avaliação do livro: " + avalicacaoLivro);
        System.out.println("Foi lido? " + lido);
        System.out.println("Palavra favorita é " + palavraFavorita);
        

    }
}