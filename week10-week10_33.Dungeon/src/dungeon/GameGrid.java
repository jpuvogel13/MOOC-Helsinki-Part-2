package dungeon;

import java.util.ArrayList;

public class GameGrid {
    private int x;
    private int y;
    private ArrayList<String> grid;
    private Characters characters;
    private Player player;
    private Vampires vampires;


    public GameGrid(int x, int y,Player player,Vampires vampires) {
        this.grid = new ArrayList<String>();
        this.x = x;
        this.y = y;
        this.player = player;
        this.vampires = vampires;
        this.characters= new Characters(player,vampires,x,y);
    }

    public void createGrid() {
        this.grid.clear();
        for (int y = 0; y <= this.y; y++) {
            String line = "";
            for (int x = 0; x <= this.x; x++) {
                    line = characters.putPlayerOnGrid(y, x, line);
                }
            this.grid.add(line);
        }
    }

    public void printGrid() {
        System.out.println("");
        ArrayList<Vampires> vampiresList = vampires.getVampires();
        System.out.println("@ " + player.getX() + " " + player.getY());
        for(Vampires l : vampiresList){
            System.out.println("v " + l.getX() + " " + l.getY());
        }
        System.out.println();
        for (String l : this.grid) {
            System.out.println(l);
        }
    }


}