public class Game{
  public static void main(String[] args){
    Troll troll = new Troll("Lillfjant", new Club());
    Knight sirJames = new Knight("Sir James", new Sword());
    System.out.println("<event>" + sirJames 
                       + " runs into the troll " 
                       + troll);
    System.out.println("<event>The troll attacks");
    troll.fight(sirJames);
    System.out.println();
    System.out.println("<event>The knight returns the favor");
    sirJames.fight(troll);
    System.out.println();
    System.out.println("<event>The knight realizes that the sword isn't enough");
    System.out.println("<event>The knight finds a shotgun, drops the sword and picks the shotgun up");
    sirJames.changeWeapon(new Shotgun());
    System.out.println("<event>The troll attacks again");
    troll.fight(sirJames);
    System.out.println();
    System.out.println("<event>The knight fires the shotgun");
    sirJames.fight(troll);
    System.out.println();
    System.out.println("<event>The knight shoots again");
    sirJames.fight(troll);
    System.out.println();
    //System.out.println("Game over");
    //System.out.println("Score: " + sirJames + " - " + troll);
    Knight blackKnight = new Knight("Fistfighting Black Knight");
    System.out.println("<event>The evil, but unarmed Black Knight shows up and attacks Sir James");
    blackKnight.fight(sirJames);
    System.out.println();
    System.out.println("<event>Sir James gets tired of this bad day and fires three rounds against Black Knight");
    sirJames.fight(blackKnight);
    sirJames.fight(blackKnight);
    sirJames.fight(blackKnight);
  }
}
