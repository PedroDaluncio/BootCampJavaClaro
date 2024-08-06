package edu.pedro.desafiocontabancaria;

import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da Agência ! ");
        int agencyNumber = scanner.nextInt();

        System.out.print("Agora o nome da Agência ! ");
        String agencyName = scanner.next();

        System.out.print("Por favor, digite o seu nome ! ");
        String clientName = scanner.next();

        System.out.print("Por favor, digite o seu saldo ! ");
        double clientBalance = scanner.nextDouble();

        System.out.print("Olá " + clientName + ", " + "obrigado por criar uma conta em nosso banco, sua agência é "
                + agencyName + ", " + "conta " + agencyNumber + " e seu saldo " + clientBalance
                + " já está disponível para saque");
    }
}
