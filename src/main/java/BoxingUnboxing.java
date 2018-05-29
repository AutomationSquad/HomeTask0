public class BoxingUnboxing {
    public static void main (String[] args){
        // create an Integer object
        Integer n = new Integer(10);

        // unboxing
        int n1 = n;

        System.out.println("value of n: " + n);
        System.out.println("value of n1: " + n1);

        //autoboxing
        Character ch = 'a';

        // Auto-unboxing of Character
        char ch1 = ch;
        System.out.println("Value of ch1: " + ch1);
        System.out.println("Value of ch: " + ch);
    }
}
