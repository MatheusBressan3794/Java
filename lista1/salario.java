import java.util.Scanner;
public class salario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu sálario em reais: ");
        float salario = scanner.nextInt();

        if (salario <= 2000) {
            float aumento = (salario * 10) / 100;
            float salarioAtual = salario + aumento;
            System.out.print("Seu salário agora é: "+salarioAtual);
    }else{
            float aumento = (salario * 5) / 100;
            float salarioAtual = salario + aumento;
            System.out.print("Seu salário agora é: "+salarioAtual);
        }

    }
}