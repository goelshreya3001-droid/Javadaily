interface A {
    static void sayHello() {
        System.out.println("Hello!");
    }
}

public class staticexample implements A {
    public static void main(String[] args) {
        staticexample obj = new staticexample();

        // obj.sayHello(); ❌ not allowed
        // staticexample.sayHello(); ❌ not allowed

        A.sayHello(); // ✅ correct way
    }
}