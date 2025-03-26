import java.util.Scanner;
public class triangulo{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as 3 medidas do triângulo");
        System.out.print("1º: ");
        int l1 = scanner.nextInt();

        System.out.print("2º: ");
        int l2 = scanner.nextInt();

        System.out.print("3º: ");
        int l3 = scanner.nextInt();

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            System.out.print("Sim, é possivel formar um triângulo com essas medidas");
        }else{
            System.out.print("Não é possivel formar um triângulo com essas medidas");
        }
    }
}