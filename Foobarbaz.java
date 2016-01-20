
/**
 *
 * @author melenemeech
 */
public class Foobarbaz {

    public static void main(String[] args) {
        for(int i=1; i<51; i++) {
            System.out.println(foobarbaz(i));
        }
    }
    
    public static String foobarbaz(int num) {
        if(num%3==0 && num%5==0) {
            return "Foo Bar";
        }
        else if (num%5==0) {
            return "Bar";
        }
        else if (num%3==0) {
            return "Foo";
        }
        else {
            return Integer.toString(num);
        }
    }
}
