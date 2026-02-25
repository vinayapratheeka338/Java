package practice;
class Pg1 
{
    public static void main(String args[]) 
    {
        int x;
        x = 5;
        {//standalone blocks are allowed in java (methods,constructors,static block,instance block)
        int y = 6;
        System.out.println(x + " " + y);
        System.out.println(x + " " + y);
        }
    } 
}
