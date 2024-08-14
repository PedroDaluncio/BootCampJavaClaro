package edu.pedro.desafiocontador.counterclass;

import edu.pedro.desafiocontador.exceptionclass.InvalidParametersException;
import java.util.Locale;
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro inteiro");
        int firstInt = scanner.nextInt();
        System.out.println("Digite o segundo inteiro");
        int secondtInt = scanner.nextInt();
        try {
            count(firstInt, secondtInt);
        } catch (InvalidParametersException error) {
            System.out.println("O primeiro número não pode ser maior que o segundo!");

        }
    }
    public static void count(int firstInt, int secondInt) throws InvalidParametersException{
        if (firstInt > secondInt){
            throw new InvalidParametersException();
        }
        int maxCounter = secondInt - firstInt;
        for (int counter = 1; counter <= maxCounter; counter++){
            System.out.println("Imprimindo o número " + counter);
        }
    }
}
