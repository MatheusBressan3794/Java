import java.util.Scanner;
public class maior {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        if (n2 > n1){
            System.out.print("O número "+n2+" é maior ");
        }else if (n1 > n2) {
            System.out.print("O maior número é "+n1);
        }
    }
}
