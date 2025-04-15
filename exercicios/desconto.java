import java.util.Scanner;
public class desconto{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digiye o total da compra: ");
        float total = scanner.nextFloat();

        if (total < 100) {
            float valor = total - ((total * 5) / 100);
            System.out.print("Com o desconto de 5% o total é R$"+valor);
        }else if (total >= 101 && total < 500){
            float valor = total - ((total * 10) / 100);
            System.out.print("Com o desconto de 10% o total é R$"+valor);
        }else{
            float valor = total - ((total * 15) / 100);
            System.out.print("Com o desconto de 15% o total a pagar é R$"+valor);
        }
    }
}