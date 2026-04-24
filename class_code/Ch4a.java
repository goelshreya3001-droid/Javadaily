import java.util.*;
public class Ch4a {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>(5);
        l2.add(54);
        l1.add(6);
        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.clear();
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
    
}
