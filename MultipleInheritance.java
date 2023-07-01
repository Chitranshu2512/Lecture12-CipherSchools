interface M{
    int x = 20;
    void fun();
}

interface N {
    int x = 10;
    void fun();
}

class c implements M,N{
    public void fun(){
        System.out.println("Hello i am function in C");
        System.out.println(M.x);
    }
}

interface o extends M,N {
    void fun();
}

class D implements o{
    public void fun(){
        System.out.println("Hello i am function in D");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        c C = new c();
        D d = new D();

        C.fun();
        d.fun();

    }
}
