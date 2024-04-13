public class Wrapper {
    public static void main(String args[])
    {
int a=10;
@SuppressWarnings("removal")
Integer aobj=new Integer(a);
@SuppressWarnings("unused")
Integer aa=Integer.valueOf(a);
@SuppressWarnings("unused")
Integer bobj=a; 
int b=aobj.intValue(); 
int c=aobj;
System.out.println(b);
System.out.println(c);

    }
    
}
