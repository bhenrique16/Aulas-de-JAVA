package src;
public class Aula1{

    public static void main(String[] args) {
        double x = 10.35784;
        String nome = "Maria";
        int idade = 10;
        double renda = 4000.0;

        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        System.out.printf("%.4f%n", x);

        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x, x);

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
