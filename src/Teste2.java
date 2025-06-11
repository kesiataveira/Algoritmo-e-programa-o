//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Teste2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int soma = a+b;
        System.out.println("Soma: "+soma);

        int c = 50;
        int d = 15;
        int subtracao = c - d;
        System.out.println("Subtração: "+subtracao);

        int e = 25;
        int f = 20;
        int multiplicacao = e * f;
        System.out.println("Multiplicação: "+multiplicacao);

        int g = 25;
        int h = 20;
        int divisao = g / h;
        System.out.println("Divisão: "+divisao);

        String nome = "Kesia";
        int ano_nasc = 2003;
        double altura = 1.56;
        int ano_atual = 2025;
        int cal_idade = ano_atual - ano_nasc;

        System.out.println("Nome: "+nome);
        System.out.println("Ano de nascimento: "+ano_nasc);
        System.out.println("Altura: "+altura);
        System.out.println("Idade: "+cal_idade);
        System.out.println("Ano atual: "+ano_atual);

        String nomeProduto = "Cadeira";
        int anoFabricacao = 2018;
        double peso = 18.5;
        int ano = 2025;
        int idade_prod = ano - anoFabricacao;

        System.out.println("\nNome do produto: "+nomeProduto);
        System.out.println("Ano de fabricação: "+anoFabricacao);
        System.out.println("Idade do produto: "+idade_prod);
        System.out.println("Peso: "+peso);

        String modelo = "ford";
        int ano_fabricacao = 2021;
        double consumoMedio = 13.8;
        int idadeVeiculo = ano - ano_fabricacao;
        System.out.println("\nModelo do veiculo : "+modelo);
        System.out.println("Ano de fabricacao: "+ano_fabricacao);
        System.out.println("Idade do veiculo: "+idadeVeiculo);
        System.out.println("Consumo medio: "+consumoMedio);

    }
}