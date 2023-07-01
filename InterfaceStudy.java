interface shape{
    double pi = 3.14;
    double getSquare(double r);
}

class circle implements shape{

    public double getSquare(double r) {
        return r*r;
    }
    void fun(){
        System.out.println("Hey I am implementing a Interface named shape");
    }
}
public class InterfaceStudy {
    public static void main(String[] args) {
    circle c = new circle();
    System.out.println(c.getSquare(5));
    c.fun();
    }
}
