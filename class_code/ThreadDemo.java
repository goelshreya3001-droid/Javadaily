class NumberThread extends Thread { 
 
    public void run() { 
 
        for(int i=1;i<=5;i++) { 
            System.out.println(i); 
        } 
    } 
} 
 
class CharThread extends Thread { 
 
    public void run() { 
 
        for(char c='A'; c<='E'; c++) { 
            System.out.println(c); 
        } 
    } 
} 
 
public class ThreadDemo { 
 
    public static void main(String args[]) throws Exception { 
 
        NumberThread t1 = new NumberThread(); 
        CharThread t2 = new CharThread(); 
 
        t1.setPriority(Thread.MAX_PRIORITY); 
        t2.setPriority(Thread.MIN_PRIORITY); 
 
        t1.start(); 
        t1.join(); 
 
        t2.start(); 
    } 
}
