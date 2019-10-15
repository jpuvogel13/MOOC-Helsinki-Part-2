package dungeon;
import dungeon.GameGrid;

import java.util.Scanner;

public class Dungeon {
    private GameGrid gameGrid;
    private Player player;
    private Scanner scanner;
    private Controls controls;
    private Characters characters;
    private Vampires vampire;
    private int moves;

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove){
        this.player= new Player("@",length,height);
        this.vampire = new Vampires(vampires, height, length);//put if statement here if vampiresmove == true
        this.gameGrid= new GameGrid(length,height,player,vampire);
        this.scanner= new Scanner(System.in);
        this.controls = new Controls(scanner,length,height);
        this.characters = new Characters(player,vampire,length,height);
        this.vampire.createVampires();
        this.moves=moves;


    }

    public void run(){
        while(moves!=0) {
            System.out.println(moves);
            gameGrid.createGrid();
            gameGrid.printGrid();
            controls.movePlayer(characters, scanner);
            controls.moveVampire(vampire);
            moves--;
        }
    }


}
