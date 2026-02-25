package practice;
class box 
{
    int width;
    int height;
    int length;
} 
public class Pg6
{
    public static void main(String args[]) 
    {        
         box obj = new box();
         System.out.println(obj.width);
         System.out.println(obj.height);
         System.out.println(obj.length);
         obj.width = 10;
         obj.height = 2;
         obj.length = 10;
         int y = obj.width * obj.height * obj.length; 
         System.out.print(y);
    } 
}