import java.util.Scanner;
public class par_impar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número:");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.print("Número PAR");
        }else if (n % 2 != 0) {
            System.out.print("Número IMPAR");
        }
    }
}
