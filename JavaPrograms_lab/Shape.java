package JavaPrograms_lab;

public class Shape {
    void square(double a)
    {
        double area=a*a;
        System.out.print("Area of Square is "+area);
    }

    void rectangle(double l,double h)
    {
        double area=l*h;
        System.out.println("Area of Rectangle is "+area);
    }

    public static void main(String[] args) {
        Shape sh1=new Shape();
        Shape sh2=new Shape();
        sh1.square(3);
        sh2.rectangle(4,5);
    }
}
