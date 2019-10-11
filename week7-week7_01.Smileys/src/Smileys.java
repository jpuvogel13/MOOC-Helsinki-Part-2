
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("m");
        printWithSmileys("12");
        printWithSmileys("Mik");
        printWithSmileys("1234");
        printWithSmileys("12345");


    }

    private static void printWithSmileys(String characterString) {
        //5 smiles per line
        //odds i=0, length+1
        //even i=1,length
        //3 vertical, 1 each side of smiley
        //if characterstring length is odd, blank space goes to the right of string
        int length=characterString.length();
        int topBottom= (length+6)/2;
        int topBottomOdd=(length+8)/2;

        for(int i=1; i<3; i++){
            if(length%2==1) {
                //**ODD**
                if (i == 2) {
                    System.out.print(":) ");
                    System.out.print(characterString + "  ");
                    System.out.print(":)");
                    System.out.println("");
                }
                for(int j=0; j<topBottomOdd;j++){
                    System.out.print(":)");
                }
            }
            //EVEN***
            if(length%2==0){
                if(i==2){
                    System.out.print(":) ");
                    System.out.print(characterString+ " ");
                    System.out.print(":)");
                    System.out.println("");
                }
                for(int m= 0; m<topBottom;m++){
                    System.out.print(":)");
                }
                }
                System.out.println("");
            }
        }

    }



