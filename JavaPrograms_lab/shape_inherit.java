package JavaPrograms_lab;
// write a  java program to find the area of a rectangle from shape,shape is a super class of square and rectangle.
class shape
{
    int x,y;
    shape(int x,int y)
    {
    this.x=x;
    this.y=y;   
    }
}

class Rectangle extends shape
{
    Rectangle(int x,int y)
    {
      super(x, y);
      System.out.println("Area of the rectangle is : " + (x*y));  
    }
}

class Square extends shape
{
    Square(int x,int area)
    {
        super(x, x);
        area=x*x;
      //System.out.println("Area of the Square is : " + (x*x));
    }
    return area;
}
void display(int area)
{
    System.out.println();
}
class shape_inherit {
    public static void main(String[] args) {
        shape  s = new shape(3, 4);
        Rectangle r = new Rectangle(5,6);
        Square q = new Square(7);
        
        System.out.println("\nValues of base class variables:");
        System.out.print("x = ");
        System.out.print(s.x + "\t");
        System.out.print("y = ");
        System.out.println(s.y);

        System.out.println("\nValues of derived classes variables:");
        System.out.print("Rectangle - x = ");
    }
}
