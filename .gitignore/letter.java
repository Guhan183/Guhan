import java.util.*;
import java.io.*;
class letter
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Char c=sc.nextChar().toLowerCase();
if(Character.isLetter(c))
{
System.out.print("Yes");
}
else
System.out.print("No");
}
}
