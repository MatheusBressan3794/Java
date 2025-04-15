import java.util.Scanner;
public class positivo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro qualquer: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.print("O número é positivo");
        } else if (numero < 0) {
            System.out.print("O número é impar");
        } else{
            System.out.print("O número é zero");
        }
    }
}
