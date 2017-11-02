package day2;
import java.util.*;
public class Average {
	int i,j;
int a[]=new int[20];
int num;
Scanner s =new Scanner(System.in);
void avg(){
	double sum=0,av;
while(num!=-1)
{
	System.out.println("enter number");
	num=s.nextInt();
	a[i]=num;
	i++;
}
for(j=0;j<i;j++)
{
	sum=sum+a[j];
}
av=sum/i;
System.out.println("average");
System.out.printf("%2f",av);
}
public static void main(String args[])
{
	Average obj = new Average();
	obj.avg();
}
}
