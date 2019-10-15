package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
        // test your program here
        PersonalBoard board = new PersonalBoard(3, 3);

        board.turnToLiving(2,0);
        board.turnToLiving(3,0);
        board.turnToLiving(3,1);
        System.out.println(board.getNumberOfLivingNeighbours(1,1));
    }
        }
