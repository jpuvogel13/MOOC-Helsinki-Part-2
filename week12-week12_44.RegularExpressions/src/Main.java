
public class Main {

    public static void main(String[] args) {
        // write test code here
        String k = "11:23:34";
        System.out.println(clockTime(k));

    }

    public static boolean isAWeekDay(String string){
       return string.matches("mon|tue|wed|thu|fri|sat|sun");

    }

    public static boolean allVowels(String string){
      return string.matches("[aoiueöäAOIUE]*");

    }

    public static boolean clockTime(String string){
        return string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}");
    }
}
