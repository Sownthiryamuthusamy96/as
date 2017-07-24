import java.util.*;
import java.io.*;
public class Main
{
public static void main(String[] args)
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
int i,j;
for(i=0;i<n;i++)
{
if(i>=0)
{
sum=sum+i;
j++;
}
System.out.println(i);
}
}
}

