package edu.pedro.exemploexcecaos;
import java.util.Scanner;

public class CustomExceptionExample {
    //throws significa que a classe gera uma exceção
    public static void main(String[] args) throws MyException{
        try{
            Scanner scanner = new Scanner(System.in);
            String myName = scanner.next();
            //cria um objeto da classe de exceção personalizada e gera ele
            if (myName.contains(".")){
                throw new MyException();
            }
        }catch (MyException error){
            System.out.println("ERROR" + error);
        }
    }
}
