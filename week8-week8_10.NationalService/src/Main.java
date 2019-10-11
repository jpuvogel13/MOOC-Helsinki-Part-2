public class Main {
    public static void main(String[] args) {
        // Test your code here!
        MilitaryService one = new MilitaryService(365);
        int two= one.getDaysLeft();
        System.out.println(two);
        one.work();
        two=one.getDaysLeft();
        System.out.println(two);
        one.work();
        one.work();
        System.out.println(one.getDaysLeft());

    }
}
