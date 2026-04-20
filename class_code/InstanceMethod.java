interface Sayable{
    void say();
}
public class InstanceMethod {
    public void says(){
        System.out.println("this is an example of instance method");
    }
    public static void main(String[] args) {
        InstanceMethod a=new InstanceMethod();
        Sayable s=a::says;
        s.say();
        // by anonymous object 
        Sayable s2= new InstanceMethod()::says;
        s2.say();
    }
    
}
