import java.util.Scanner

public class MediaAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = nota1 + nota2 / 2;

        System.out.println("Média: " + media)

        if (media >= 7) {
            System.out.println(nome + " Aprovado");
        else if (media >= 5) {
                System.out.println(nome + " Recuperação");
            } else {
                System.out.println(nome + " Reprovado");
            }

            sc.close();
        }
    }