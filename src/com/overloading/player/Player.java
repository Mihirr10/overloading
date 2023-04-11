package com.overloading.player;

public class Player {
  private String playerName;
  private String leagueName;
  private String teamName;
  private String position;

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public void playerDetails(String leagueName){
    System.out.println(playerName+" is Playing in the "+leagueName);
  }

  public void playerDetails(String leagueName,String teamName){
    System.out.println(playerName+" is Playing in the "+leagueName+" for "+teamName);
  }

  public void playerDetails(String leagueName,String teamName,String position){
    System.out.println(playerName+" is Playing in the "+leagueName+" for "+teamName+" as "+position);
    System.out.println("");
  }
}
