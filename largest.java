import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
if(a>b && a>c)
System.out.println("the largest number is:"+a);
else if(b>c)
System.out.println("the largest number is:"+b);
else
System.out.println("the largest number is:"+c);
}
}
