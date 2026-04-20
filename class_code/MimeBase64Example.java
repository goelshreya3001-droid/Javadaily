import java.util.Base64;

public class MimeBase64Example {
    public static void main(String[] args) throws Exception {

        String text = "Hello Shreya! This is a MIME Base64 encoding example in Java.";

        // MIME Encoder (adds line breaks after 76 characters)
        String encoded = Base64.getMimeEncoder().encodeToString(text.getBytes("UTF-8"));

        // MIME Decoder
        byte[] decodedBytes = Base64.getMimeDecoder().decode(encoded);
        String decoded = new String(decodedBytes, "UTF-8");

        System.out.println("Encoded (MIME):\n" + encoded);
        System.out.println("\nDecoded:\n" + decoded);
    }
}
