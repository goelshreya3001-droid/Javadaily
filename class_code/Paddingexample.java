import java.util.Base64;
public class Paddingexample {
    public static void main(String[] args) {
        String org="Hello Shreya";
        String ed=Base64.getEncoder().withoutPadding().encodeToString(org.getBytes());
        System.out.println("encoded:"+ed);
        byte[]de=Base64.getDecoder().decode(ed);
        String c=new String(de);
        System.out.println("decoded:"+ c );
        
    }
    
}
