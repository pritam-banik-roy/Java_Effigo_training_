public class RecursionIsCool {


    public static void main(String[] args) {
        countBackwards(14);
    }

    public static void countBackwards(int n) {
        if (n <= 0) { // Base case
            System.out.println("Done!");
            return;
        }
        System.out.println(n);
        countBackwards(n - 1); // Recursive call with decremented value
    }
}
