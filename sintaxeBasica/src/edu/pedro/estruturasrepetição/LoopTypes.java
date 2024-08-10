package edu.pedro.estruturasrepetição;

public class LoopTypes {
    public static void main(String[] args) {
        //For é igual no JavaScript, se define uma variavel, define a validação de parada dela e a incrementação
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        //For para arrays possui dos jeitos, o for normal percorrendo cada elemento pela posição, e o for each
        String array[] = {"Pedro", "João", "José", "Carlos"};
        //Jeito tradicional
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        //Jeito sem depender da posição do elemento
        for (String nome : array){
            System.out.println(nome);
        }
        //O while é igual ao python
        int number = 0;
        while (number < 10){
            number += 2;
            System.out.println(number);
        }
        //do while, é parecido com o while, mas o bloco de código contido dentro do do{} será executado pelo menos uma vez
        int integer = 1;
        do {
            System.out.println("Hello");
        } while (integer != 1);
    }
}

