package application;

import utilities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Person pessoa;

        char resposta;
        boolean flag = false;
        do {
            if (flag) {
                sc.nextLine();
            }
            flag = true;
            System.out.println("Name:");
            String name = sc.nextLine().toUpperCase();
            System.out.println("Height (ex.: 1.80):");
            double height = sc.nextDouble();
            System.out.println("Weight:");
            double Weight = sc.nextDouble();
            pessoa = new Person(name, height, Weight);
            System.out.println(pessoa);
            double imc = pessoa.IMC();
            if (imc >= 18.5 && imc <= 25) {
                System.out.println("normal");
            } else if (imc >= 26 && imc <= 30) {
                System.out.println("Sobrepeso");
            } else if (imc > 30) {
                System.out.println("Obeso");
            }
            System.out.println();
            System.out.println("Deseja repetir (s/n)?");
            resposta = sc.next().charAt(0);
        }
        while (resposta == 's');

        sc.close();
    }
}