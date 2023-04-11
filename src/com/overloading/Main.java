package com.overloading;
import com.overloading.player.*;


public class Main {
  public static void main(String[] args) {
    Player player1=new Player();
    player1.setPlayerName("Cristiano Ronaldo");

    player1.playerDetails("English Premier League");
    player1.playerDetails("English Premier League","Manchester United");
    player1.playerDetails("English Premier League","Manchester United","Centre Forward");

    Player player2=new Player();
    player2.setPlayerName("Lionel Messi");

    player2.playerDetails("La Liga");
    player2.playerDetails("La Liga","Barcelona");
    player2.playerDetails("La Liga","Barcelona","Left Winger");

    Player player3=new Player();
    player3.setPlayerName("Sergio Ramos");
    player3.playerDetails("Ligue 1");
    player3.playerDetails("Ligue 1","Paris-saint-german");
    player3.playerDetails("Ligue 1","Paris-saint-german","Defender");
  }
}