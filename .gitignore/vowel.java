import java.util.*;
import java.io.*;
class vowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Char c=sc.nextChar().toLowerCase();
if(Character.isLetter(c))
{
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
System.out.print("Vowel");
}
else
System.out.print("Consonant");
}
}
else
System.out.print("invalid");
}
}
