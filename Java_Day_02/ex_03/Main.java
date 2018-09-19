public class Main {

    public static void main(String[] args) {
        Duet<Integer, Integer> test1 = new Duet<Integer, Integer>(3, 4);
        System.out.println(test1.min(1,5));
        System.out.println(test1.max(100,5));

        Duet<String, String> test2 = new Duet<String, String>("hello", "bonjour");
        System.out.println(test2.min("testing","test"));
        System.out.println(test2.max("testing","test"));
    }
}