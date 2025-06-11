import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Digite o seu nome: ");
       String nome = scanner.nextLine();

       System.out.print("Digite sua idade: ");
       int idade = scanner.nextInt();

       System.out.println("Olá "+nome+", você tem " +idade+ " anos");
       scanner.close();

    }
}