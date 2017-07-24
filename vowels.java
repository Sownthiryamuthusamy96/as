import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char c=(char) br.read();
if(c=='a' || c=='e' || c=='i'||c=='o'||c=='u')
System.out.println("vowels",+c);
else
System.out.println("consonent",+c);
}
}
