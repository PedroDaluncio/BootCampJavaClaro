package edu.pedro.exercicio;

public class ExerciceTvRegister{
    /*
     * cadastro de TV Smart, onde:
     * 1- tenhas características: ligada(boolean), canal(int), volume(int);
     * 2- deve ser possível ligar e desligar ela, mudando o estado ligada;
     * 3- o volume deve aumentar ou diminuir em 1;
     * 4- o canal deve mudar de 1 em 1, ou um número definido
     */
    boolean isTurnedOn = false;
    int volume = 50;
    int channel = 5;

    public void changeTvState(){
        isTurnedOn = !isTurnedOn;
    }
    public void turnTvVolumeUp(){
        ++volume;
    }
    public void turnTvVolumeDown(){
        --volume;
    }
    public void changeTvChannelUp(){
        ++channel;
    }
    public void changeTvChannelDown(){
        --channel;
    }
    public void goToCertainChannel(int newChannel){
        channel = newChannel;
    }
}