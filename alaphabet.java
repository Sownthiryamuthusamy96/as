import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char c=(char) br.read();
if(c>='a' && c<='z'||c<='A' && c<='Z')
System.out.println("alphabet"+c);
else
System.out.println("not alphabet"+c);
}
}
