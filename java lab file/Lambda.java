 interface Employee{
   public String getName(String str);
}
public class Lambda {
    public static void main(String[] args) {
    //   // ithout lambda
    //   Employee emp =new Employee(){
    //   public String getName(String str){
    //     return str;
    //   }
    // };
    // System.out.println(emp.getName("softwareengineer"));
    // with lambda 
    Employee emp=()->(String str){
        System.out.println(emp.getName("softwareenginner"));
    }
}
}
