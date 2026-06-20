public class Exercicio03 {
    public void executar(){

        String evento = "Bolsonaro Carreata";
        int quantidadeDisponivel = 1000; //Inicio do evento
        int quantidadeVendidos = 750;
        int soma = quantidadeDisponivel - quantidadeVendidos;

        System.out.println("Evento: " + evento);
        System.out.println("Ingressos Limitados: " + quantidadeDisponivel);
        System.out.println("Ingressos vendidios até o momento: " + quantidadeVendidos);
        System.out.println("Quantidade de ingressos para venda: " + soma);

    }
}

/*3. Criar uma classe chamada Exercicio03.
   Criar o método main.

   O que deve ser feito:
   - Criar uma variável String para o nome de um evento.
   - Criar uma variável int para a quantidade de ingressos disponíveis.
   - Criar uma variável int para a quantidade de ingressos vendidos.
   - Calcular quantos ingressos ainda restam.
   - Apresentar no console:
     a) nome do evento
     b) quantidade disponível inicialmente
     c) quantidade vendida
     d) quantidade restante
 */