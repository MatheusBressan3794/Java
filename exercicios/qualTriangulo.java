import java.util.Scanner;
public class qualTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Verificador de Triângulo");
        System.out.print("Digite a primeira medida: ");
        double a = sc.nextDouble();

        System.out.print("Digite a segunda medida: ");
        double b = sc.nextDouble();

        System.out.print("Digite a terceira medida: ");
        double c = sc.nextDouble();

       if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            System.out.println("É um triângulo Equilátero");
        }else if (a == b || a == c || b == c) {
            System.out.println("É um triângulo Isósceles");
        }else if (a != b && a != c && b != c) {
            System.out.println("É um triângulo Escaleno");
        }
       }else{
        System.out.println("Não é possível formar um triângulo com essas medidas");
       }
    }
}
