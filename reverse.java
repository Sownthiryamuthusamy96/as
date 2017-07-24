import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
int n=str.length();
String str1=str.reverse();
System.out.println("reverse string is:"+str1);
}
}
