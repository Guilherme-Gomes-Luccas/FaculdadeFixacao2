import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        int num = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        sucessorEantecessor(num);
    }

    static void sucessorEantecessor(int num) {
        System.out.printf("Antecessor: %d\nNúmero: %d\nSucessor: %d", num-1, num, num+1);
    }
}

