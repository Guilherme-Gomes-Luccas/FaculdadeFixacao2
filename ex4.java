import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        float num1, num2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1° número: ");
        num1 = sc.nextFloat();
        System.out.println("Digite o 2° número: ");
        num2 = sc.nextFloat();

        soma(num1, num2);
        sub(num1, num2);
        mult(num1, num2);
        div(num1, num2);
    }

    public static void soma(float num1, float num2) {
        System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, num1+num2);
    }
    public static void sub(float num1, float num2) {
        System.out.printf("%.1f - %.1f = %.1f\n", num1, num2, num1-num2);
    }
    public static void mult(float num1, float num2) {
        System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, num1*num2);
    }
    public static void div(float num1, float num2) {
        System.out.printf("%.1f + %.1f = %.1f", num1, num2, num1/num2);
    }

}
