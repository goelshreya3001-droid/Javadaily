import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        String s = "Hello ";
        String encoded = Base64.getEncoder().encodeToString(s.getBytes());
        System.out.println("Encoded string: " + encoded);
        byte[]p=Base64.getDecoder().decode(encoded);
        System.out.println("Decoded String:"+new String(p));
    }
}