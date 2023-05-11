package src;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void  main(String[] args) {
        Locale.setDefault(Locale.US);
        var input = new Scanner(System.in);
        var var1 = 0;
        var var2 = 0;
        var var3 = 0;
        var var4 = 0.0;
        String h1, h2;

        h1 = "---------Entrada de dados----------";
        h2 = "---------Saida de dados------------";

        // Digite um valor para saber se ele é maior do que o outro
        System.out.println(h1);
        System.out.print("Digite o primeiro valor: ");
        var1 = input.nextInt();
        System.out.print(("Digite o segundo valor: "));
        var2 = input.nextInt();

        System.out.println(h2);
        if (var1 > var2) {
            System.out.println("O valor " + var1 + " é maior do que " + var2);
        } else {
            System.out.println("O valor " + var2 + " é maior do que " + var1);
        }

        // Digite o ano para saber se pode votar ou não
        System.out.println(h1);
        System.out.print("Digite o ano de nascimento 'xxxx' para saber se está apto a votar esse ano: ");
        var1 = input.nextInt();

        var2 = Calendar.getInstance().get(Calendar.YEAR) - var1;
        if (var2 > 15) {
            System.out.println("Você está apto para votar este ano");
        } else {
            System.out.println("Você não pode votar neste ano");
        }

        System.out.println(h1);
        System.out.print("Informe sua senha: ");
        var1 = input.nextInt();

        System.out.println(h2);
        if (var1 == 1234) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }

        // quantidade de maçãs e o valor gasto
        System.out.println(h1);
        System.out.print("Digite a quantidade de maçãs: ");
        var1 = input.nextInt();

        System.out.println(h2);
        if (var1 < 6 ) {
            var4 = var1 * 0.30;
            System.out.println("Foram compradas " + var1 + " Maçã(s) a R$ 0.30 e custaram R$ " + var4);
        } else {
            var4 = var1 * 0.25;
            System.out.println("Foram compradas " + var1 + " Maçã(s) a R$ 0.25 e custaram R$ " + var4);
        }

        // tres valores e ordena-los
        System.out.println(h1);
        System.out.print("Digite o primeiro valor: ");
        var1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        var2 = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        var3 = input.nextInt();

        System.out.println(h2);
        if (var1 < var2 && var1 < var3) {
            if (var2 < var3) {
                System.out.printf("Os valores em ordem crescente são: %d %d %d ", var1, var2, var3);
            } else {
                System.out.printf("Os valores em ordem crescente são: %d %d %d ", var1, var3, var2);
            }
        } else if (var2 < var1 && var2 < var3) {
            if (var1 < var3) {
                System.out.printf("Os valores em ordem crescente são: %d %d %d ", var2, var1, var3);
            } else {
                System.out.printf("Os valores em ordem crescente são: %d %d %d ", var2, var3, var1);
            }
        } else {
            if (var1 < var2) {
                System.out.printf("Os valores em ordem crescente são: %d %d %d ", var3, var1, var2);
            } else {
                System.out.printf("Os valores em ordem crescente são: %d %d %d ", var3, var2, var1);
            }
        }

        System.out.println();
        // Peso ideal
        System.out.println(h1);
        System.out.print("digite 1:feminino | 2:masculino: ");
        var1 = input.nextInt();
        System.out.println("Digite a altura: ");
        double var5 = input.nextDouble();

        System.out.println(h2);
        if (var1 == 2){
            var5 = (72.7 * var5) - 58;
            System.out.printf("Seu peso ideal é: %.2f", var5);
        } else {
            var5 = (62.1 * var5) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f", var5);
        }

        System.out.println(h1);
        System.out.println("Digite um ");

    }
}