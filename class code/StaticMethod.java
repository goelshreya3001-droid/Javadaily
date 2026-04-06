interface Shreya{
    void say();
}
public class StaticMethod{
    public static void says(){
        System.out.println("This is example of static method refrence");
    }
    public static void main(String[] args) {
        Shreya s=StaticMethod::says;
        s.say();
    }
}