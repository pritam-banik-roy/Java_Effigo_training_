public class Example5 {
    //public method
    public void fruits() {
        String fruits[] = {"Apple", "Banana", "Mango", "Strawberry"};
        System.out.println("Fruits:");
        for (int i=0; i<fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
    
    //static method
    static void vegetables() {
        String vegies[] = {"Onion", "Potato", "Carrot", "Raddish"};
        System.out.println("Vegetables:");
        for (int i=0; i<vegies.length; i++) {
            System.out.println(vegies[i]);
        }
    }
    
    public static void main(String[] args) {
        Example5 ex5 = new Example5();        //need to create object
        ex5.fruits();
        System.out.println();
        
        vegetables();                        // no need to create object
    }
}