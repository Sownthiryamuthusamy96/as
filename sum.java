import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int i,sum=0;
for(i=0;i<n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
