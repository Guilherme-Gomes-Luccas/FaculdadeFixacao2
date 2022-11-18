import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        float altura, peso;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        altura = sc.nextFloat();

        System.out.println("Digite seu peso: ");
        peso = sc.nextFloat();

        System.out.printf("IMC: %.2f\n", imc(altura, peso));

        tabela();

    }
    
    public static float imc(float altura, float peso) {
        return peso/(altura*altura);
    }

    public static void tabela() {
        System.out.println("---------------||---------------||---------------\n" +
        "condicao       ||  mulheres     ||  homens\n" +
        "---------------||---------------||---------------\n" +
        "abaixo do peso ||   < 19.1      ||  < 20.7\n" +
        "peso normal    ||   19.1 - 25.8 ||  20.7 - 26.4\n" +
        "acima do peso  ||   25.8 - 32.3 ||  26.4 - 31.1\n" +
        "obeso          ||   > 32.3      ||  > 31.1\n" +
        "---------------||---------------||---------------\n");
    }
}
