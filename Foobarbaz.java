
/**
 *
 * @author melenemeech
 */
public class Foobarbaz {

    public static void main(String[] args) {
        // for(int i=1; i<51; i++) {
        //     System.out.println(foobarbaz(i));
        // }
        
        for(int i=1; i<111; i++) {
            System.out.println(foobarbaz(i));
        }
    }
    
    public static String foobarbaz(int num) {
        // a number like 105 is divisible by 3, 5, and 7,
        // I want to skip the first if since the new rule requires 
        // 'baz' to be returned when the number is div. by 7.  
        // Therefore the num%7!=0 was added.
        if(num%3==0 && num%5==0 && num%7!=0) { 
            return "Foo Bar";
        }
        else id (num%7==0) {
            return "Baz";
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
