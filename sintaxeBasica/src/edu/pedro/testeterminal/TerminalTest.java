package edu.pedro.testeterminal;
import java.util.Scanner;

public class TerminalTest{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.next();
        System.out.print("Seu nome é: " + nome);

    }
}