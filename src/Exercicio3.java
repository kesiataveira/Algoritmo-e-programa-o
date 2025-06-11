import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite a primeira nota: ");
       double nota1 = scanner.nextDouble();

       System.out.print("Digite a segunda nota: ");
       double nota2 = scanner.nextDouble();

       double media = (nota1 + nota2)/2;

       System.out.println("A media do aluno é: " +media);

       if(media>= 5){
           System.out.println("O aluno foi aprovado!");
       } else {
           System.out.println("O aluno foi reprovado!");
       }
       scanner.close();
    }

}