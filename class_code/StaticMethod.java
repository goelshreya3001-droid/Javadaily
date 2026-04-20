// interface Shreya{
//     void say();
// }
// public class StaticMethod{
//     public static void says(){
//         System.out.println("This is example of static method refrence");
//     }
//     public static void main(String[] args) {
//         Shreya s=StaticMethod::says;
//         s.say();
//     }
// }
interface A {
     public void getName(String Name);
}
public class StaticMethod{
        public static void getinfo(String Info ){
            System.out.println(Info);
        }
         public static void main(String[] args) {
            A a1= StaticMethod::getinfo;
            a1.getName("Shreya");
    }
}