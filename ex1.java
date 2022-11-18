import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        double kg = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do kg");
        kg = sc.nextDouble();

        preco_kg(kg);
    }

    public static void preco_kg(double valor) {
        System.out.printf("5 g: R$ %.2f\n", (valor*0.005));
        System.out.printf("10 g: R$ %.2f\n", (valor*0.01));
        System.out.printf("20 g: R$ %.2f", (valor*0.02));
    }
}

