/*1. Create a class named Rectangle with two data members- length and breadth and a
function to calculate the area which is length*breadth. The class has three
constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and
breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that
number.
Now, create objects of the Rectangle class having none, one and two parameters
and print their areas.
*/


class Rectangle{
    int length;
    int breadth;

    public Rectangle()
    { 
        int length = 0;
        int breadth = 0;

    }

    public Rectangle (int length)
    {
         this.length = length ;
         this.breadth = length;

    }
    public Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public int Area()
    { 	
	return length*breadth;
    }
    public static void main(String args[]) {

        Rectangle obj = new Rectangle ();
        System.out.println("Area with no parameter : "+obj.Area());
        Rectangle obj1= new Rectangle(10);
        System.out.println("Area with One parameter:"+obj1.Area());
        Rectangle  obj2 = new Rectangle (6,12);
        System.out.println("Area with Two parameter:"+obj2.Area());
    }
}