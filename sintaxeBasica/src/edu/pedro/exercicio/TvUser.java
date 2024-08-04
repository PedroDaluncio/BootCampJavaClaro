package edu.pedro.exercicio;

public class TvUser {
    public static void main(String [] args){
        //cria um objeto da classe ExerciceTvRegister
        ExerciceTvRegister exerciceTvRegister = new ExerciceTvRegister();
        exerciceTvRegister.changeTvState();
        exerciceTvRegister.changeTvChannelDown();
        exerciceTvRegister.changeTvChannelUp();
        exerciceTvRegister.goToCertainChannel(25);
        exerciceTvRegister.turnTvVolumeDown();
        exerciceTvRegister.turnTvVolumeUp();
    }
}
