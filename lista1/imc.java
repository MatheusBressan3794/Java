import java.util.Scanner;
public class imc{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu peso (Kg): ");
        float peso = scanner.nextFloat();

        System.out.print("Qual a sua altura (M): ");
        float altura = scanner.nextFloat();

        float imc = peso / altura;

        if (imc < 18.5) {
            System.out.print("Abaixo do peso");
        }else if (imc >= 18.5 && imc <= 24.9) {
            System.out.print("Peso ideal");
        }else if (imc >= 25 && imc <= 29.9) {
            System.out.print("Sobrepeso");
        }else{
            System.out.print("Obesidade");
        }
    }
}