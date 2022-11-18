import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        int A,S,M,D;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do mês(mês começa em março(1) e termina em fevereiro(12))");
        M = sc.nextInt();

        System.out.println("Digite o dia do mês");
        D = sc.nextInt();

        System.out.println("Digite os dois últimos algarismos do número do ano passado");
        A = sc.nextInt();

        System.out.println("Digite os dois primeiros algarismos do número do ano atual");
        S = sc.nextInt();

        System.out.println("Dia da semana: " + resto(A, S, M, D));
    }

    public static int trunca(int M) {
        int aux;
        aux = (int) (2.6 * M - 0.1);

        return aux;
    }

    public static int quociente(int n) {
        int aux;
        aux = n/4;

        return aux;
    }

    public static int resto(int A, int S, int M, int D) {
        int aux;
        aux = (trunca(M) + D + A + quociente(A) + quociente(S) - 2 * S)%7;

        return aux;
    }
}
