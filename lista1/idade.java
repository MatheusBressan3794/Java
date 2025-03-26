import java.util.Scanner;
public class idade {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.print("Você é Maior de idade");
        }else {
            System.out.print("Você é Menor de idade");
        }
    }
}
