package desafios.classes;

import java.util.Scanner;

public class DivisaoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Digite um número");
            double n1 = sc.nextDouble();
            System.out.println("Digite outro número");
            double n2 = sc.nextDouble();

            System.out.println(n1 / n2);
        } catch (ArithmeticException e){
            System.out.println("Erro " + e.getMessage());
        }

        sc.close();
    }
}
