package game;

import gameoflife.GameOfLifeBoard;

import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height){
        super(width,height);
    }

    public void turnToLiving(int x, int y){
        if(x>super.getWidth()-1 || y> super.getHeight()-1 || x<0 || y<0){

        }else{
            boolean [] [] board = getBoard();
            board[x] [y] = true;
        }
    }

    public void turnToDead(int x, int y){
        if(x>super.getWidth()-1 || y> super.getHeight()-1 || x<0
                || y<0){

        }else{
            boolean [] [] board = getBoard();
            board[x] [y] = false;
        }
    }

    public boolean isAlive(int x , int y){
        if(x>super.getWidth()-1 || y> super.getHeight()-1 || x<0
                || y<0){
            return false;
        }
        boolean [] [] board = getBoard();
        boolean value = board[x][y];
        if(value == true) {
            return true;
        }
        return false;
    }

    public void initiateRandomCells(double probabilityForEachCell){
        Random random = new Random();
        boolean [] [] board = getBoard();
            for(int y=0; y<=super.getHeight()-1; y++){
                for(int x = 0; x<= super.getWidth()-1; x++){
                    if(probabilityForEachCell == 1){
                    board [x] [y] = true;}
                    else if(probabilityForEachCell ==0 ){
                        board [x] [y] = false;
                    }
                double randomNum = random.nextDouble();
                    if(probabilityForEachCell>randomNum){
                        board[x] [y] = true;
                    }else{
                        board [x] [y] = false;
                    }
                    }
            }
        }


    public int getNumberOfLivingNeighbours(int x, int y) {
        int counter = 0;
        boolean[][] board = getBoard();
        //for (0,0)
        if (x == 0 && y == 0) {
            for (int xd = 1; xd > 0; xd--) {
                for (int yd = 0; yd < 2; yd++) {
                    if (isAlive(xd, yd)) {
                        counter++;
                    }
                }
                if (isAlive(0, 1)) {
                    counter++;
                }
            }
            return counter;
        }
        //left side (works!)
        if (x == 0 && y != 0) {
            for (int i = x + 1; i <= 1; i--) {
                for (int j = 0; j <= 3; j++) {
                    if (isAlive(i, j)) {
                        counter++;
                    }
                }
            }
            return counter;
        }
        //right side works!!
        if (x == super.getWidth() - 1 && y != super.getHeight() - 1) {
            if (isAlive(x, y + 1)) {
                counter++;
            }
            if (isAlive(x, y - 1)) {
                counter++;
            }
            for (int i = x - 1; i >= x - 2; i--) {
                for (int j = 0; j <= 4; j++) {
                    if (isAlive(i, j)) {
                        counter++;
                    }
                }
            }
            return counter;
        }

            //bottom right corner
            if (x == super.getWidth() - 1 && y == super.getHeight() - 1) {
                if (isAlive(x, y - 1)) {
                    counter++;
                }
                if (isAlive(x - 1, y)) {
                    counter++;
                }
                if (isAlive(x - 1, y - 1)) {
                    counter++;

                }
                return counter;
            }else {
                //Middle
                //leftSide(middle) Works
                for (int i = x - 1; i >= x - 2; i--) {
                    for (int j = y - 1; j <= y + 3; j++) {
                        if (isAlive(i, j)) {
                            counter++;
                        }
                    }
                }

                if (isAlive(x, y - 1)) {
                    counter++;
                }
                if (isAlive(x, y + 1)) {
                    counter++;

                }
                //rightSide(Middle) Not workingss
                for (int i = x + 1; i <=x+2; i++) {
                    for (int j = y - 1; j <= y + 2; j++) {
                        if (isAlive(i, j)) {
                            counter++;
                        }
                    }
                }
                return counter;
            }

        }
        public void manageCell ( int x, int y, int livingNeighbours){
        if(getNumberOfLivingNeighbours(x,y)<2 && isAlive(x,y)){
            turnToDead(x,y);
        }
        if(getNumberOfLivingNeighbours(x,y)>3 && isAlive(x,y)){
                turnToDead(x,y);
            }
        if(getNumberOfLivingNeighbours(x,y) == 3){
            turnToLiving(x,y);
        }
        if(getNumberOfLivingNeighbours(x,y)==3 && isAlive(x,y)==false){
            turnToLiving(x,y);
        }
        }
    }

