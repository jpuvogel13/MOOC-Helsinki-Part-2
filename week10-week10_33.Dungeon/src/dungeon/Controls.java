package dungeon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Controls {
    private String commandChoices;
    private int xBoundary;
    private int yBoundary;
    private int commandLength;
    private Random random;

    public Controls(Scanner scanner, int xBoundary, int yBoundary) {
        this.commandChoices = "wasd";
        this.yBoundary=yBoundary;
        this.xBoundary=xBoundary;



    }

    public void movePlayer(Characters characters,Scanner scanner) {
        String commands = getCommands(scanner);
        this.commandLength = commands.length()-1;
        for(int i = 0; i<=this.commandLength; i ++){
            char command = commands.charAt(i);
            if(command == 'w' && characters.getPlayer().getY()!=0){
                characters.getPlayer().moveUp();
            }else if(command == 'a' && characters.getPlayer().getX()!=0){
                characters.getPlayer().moveLeft();
            }else if(command== 's' && characters.getPlayer().getY()!=yBoundary){
                characters.getPlayer().moveDown();
            }else if(command == 'd' && characters.getPlayer().getX()!=xBoundary) {
                characters.getPlayer().moveRight();
            }
        }
    }

    public void moveVampire(Vampires vampires) {
            this.random = new Random();
            ArrayList<Vampires> list = vampires.getVampires();
        for (int i = 0; i <= this.commandLength; i++) {
            for(Vampires k : list) {

                    int number = random.nextInt(4);
                    char command = commandChoices.charAt(number);
                    if (command == 'w' && k.getY() != 0) {
                        k.moveUp();
                    } else if (command == 'a' && k.getX() != 0) {
                        k.moveLeft();
                    } else if (command == 's' && k.getY() != yBoundary) {
                        k.moveDown();
                    } else if (command == 'd' && k.getX() != xBoundary-1) {
                        k.moveRight();
                    }
                }
            }
    }


    public String getCommands(Scanner scanner){
        System.out.println("");
        return scanner.nextLine();
    }




}

