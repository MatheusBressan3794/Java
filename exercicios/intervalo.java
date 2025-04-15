import java.util.Scanner;
public class intervalo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número qualquer: ");
        int n = scanner.nextInt();

        if (n <= 50 && n >= 10) {
            System.out.print("Dentro do intervalo");
        }else{
            System.out.print("Fora do intervalo");
        }
    }
}
