import java.util.Scanner;
public class calculadora{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int soma;
        int sub;
        int mut;
        float div;
        float res;
        int n1;
        int n2;

        System.out.println("Digite um número intero: ");
        n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        n2 = scanner.nextInt();

        soma = n1 + n2;
        sub = n1 - n2;
        mut = n1 * n2;
        div = n1 / n2;
        res = n1 % n2;

        System.out.println("A soma deles é: "+soma);
        System.out.println("A subtração deles é: "+sub);
        System.out.println("A mutiplicação deles é: "+mut);
        System.out.println("A divisão deles é: "+div);
        System.out.println("O Resto de divisão deles é: "+res);
    }

}