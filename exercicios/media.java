import java.util.Scanner;
public class media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float n1;
        float n2;
        float n3;
        float media;
        String nome;

        System.out.println("Nome do aluno: ");
        nome = scanner.nextLine();

        System.out.println("Digite a 1º nota: ");
        n1 = scanner.nextFloat();

        System.out.println("2º Nota: ");
        n2 = scanner.nextFloat();

        System.out.println("3º: ");
        n3 = scanner.nextFloat();

        media = (n1 + n2 + n3) / 3;

        System.out.println("A média do "+nome+" foi "+media);
        if (media >= 6) {
            System.out.println("Aluno(a) APROVADO");
        }else if (media < 6) {
            System.out.println("Aluno(a) REPROVADO");
        }
        }

        
    }