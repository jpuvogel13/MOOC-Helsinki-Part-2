package dungeon;

import java.util.ArrayList;

public class Characters {
    private Player player;
    private Vampires vampires;
    private int xBoundary;
    private int yBoundary;


    public Characters(Player player, Vampires vampires,int xBoundary,int yBoundary){
            this.player=player;
            this.vampires = vampires;
            this.xBoundary = xBoundary;
            this.yBoundary= yBoundary;
        }

    public String putPlayerOnGrid(int y, int x,String line) {
        char playerChar = '@';
        char vampireChar = 'v';
        ArrayList<Vampires> vampiresList = vampires.getVampires();
            if (x == player.getX() && y==player.getY()) {
                line+=playerChar;
            }
                for (Vampires k : vampiresList) {
                    if (k.getY()==y && k.getX()==x) {
                    line += vampireChar;
                }
                if(line.length()<x){
                    line+=".";
                }
            }
        return line;
    }


    public Player getPlayer(){
            return this.player;
    }

    public boolean isOccupiedByVampire(int length, String line) {
            if(line.charAt(length)=='v'){
                return true;
            }
            return false;
    }

    public boolean isOccupiedByPlayer(int length, String line){
        if(line.charAt(length)=='@'){
            return true;
        }
        else return false;
    }

}
