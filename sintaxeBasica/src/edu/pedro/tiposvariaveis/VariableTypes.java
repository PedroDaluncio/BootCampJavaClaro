package edu.pedro.tiposvariaveis;

public class VariableTypes {
    public static void main (String [] args){
        //Casting: arredondamento de um valor, tanto de um tipo maior para um menor ou o contrario
        //Casting (Widening)
        int value1 = 100;
        long value2 = value1;

        //Casting (Narrowing)
        int value3 = 150;
        short value4 = (short) value3;

        //valores constantes devem ser MAIUSCULOS e dever haver final antes do tipo
        final int value5 = 100;

        //String e Char
        //Strings possuem mais de um caractere, e usam aspas duplas
        final String meuNome = "Pedro Henrique Archer Dalsenter";

        //Char possuem apenas um caractere e usam aspas simples
        final char inicialMeuNome = 'P';
    }
}
