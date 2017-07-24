import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int i;
for(i=0;i<n;i++)
{
if(i>0)
{
System.out.println("positive",+i);
}
else
System.out.println("negative",+i);
}
}
}
