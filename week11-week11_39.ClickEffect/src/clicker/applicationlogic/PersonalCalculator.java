package clicker.applicationlogic;

public class PersonalCalculator implements Calculator {
        private int counter;

        public PersonalCalculator(){
            this.counter=0;
        }


        public int giveValue(){
            return counter;
        }

        public void increase(){
            this.counter++;
        }

        public String toString(){
            return ""+ this.counter;
        }

}
