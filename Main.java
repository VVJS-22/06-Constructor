class A {
    String name;
    int age;
   
    protected A(String fullname) {
        name = fullname;
    }

    public A(int num) {
        age = num;
    }

    void printName () {
        String a = this.name;
        System.out.println(a);
    }
}

class B extends A {

    protected B(String fullname) {
        super(fullname);
    }

    public B(int age) {
        super(age);
    }

    public void greet() {
        System.out.println("Hello!"+ this.age);
    }
    
}

public class Main {

    private Main () {
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        A abi = new A("abi");
        abi.printName(); // private constructor not visible.
        B jai = new B(23);
        jai.greet();

        Main main = new Main();
    }
}
