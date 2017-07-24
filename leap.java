import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
if(n%4==0)
{
if(n%100==0)
{
if(n%400==0)
System.out.println("leapyear"+n);
else
System.out.println("not a leapyear"+n);
}
else
System.out.println("leapyear"+n);
}
else
System.out.println("not a leapyear"+n);
}
}
