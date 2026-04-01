import java.util.Base64;

class Base64convert {
    public static void main(String[] args) {
        String str="Hell";
        byte[] b=str.getBytes();
        
        //converting to Base64(Encoding)
        String base64=Base64.getEncoder().encodeToString(b);
        System.out.println("Encoded String:"+base64);

        //converting to Base64 without padding(Enncoding)
        String base64withoutpadding=Base64.getEncoder().withoutPadding().encodeToString(b);
        System.out.println("Encoded String without padding:"+base64withoutpadding);

        //converting to binary(Decoding)
        byte[] decode=Base64.getDecoder().decode(base64);
        String s=new String(decode);
        System.out.println("Decoded String:"+s);

    }
}
