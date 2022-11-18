import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
        num = sc.nextInt();

        inversor(num);
    }

    public static void inversor(int num) {
        int cent, aux, dez, uni;
        
        cent = num/100;
        aux = num % 100;

        dez = aux/10;
        aux = aux %10;

        uni = aux;

        System.out.printf("%d%d%d", uni, dez, cent);
    }
}
