package Java_Miscellaneous;

public class prefixPostFixIncrement {
    public static void main(String[] args) {
        int a = 1;
        int b = a++;
        System.out.println(b);
        System.out.println(a);

        b = a++ + a;
        System.out.println(b);
    }
}
