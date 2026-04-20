interface Messageable {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.println(msg);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {

        Messageable hello = Message::new;  // constructor reference

        hello.getMessage("Hello Constructor Reference");
    }
}//class code/ConstructorReference.java
