package day2;
import java.util.*;
public class largestvalue {
public static void main(String args[])
{int count,i;
int largest=Integer.MIN_VALUE;
	System.out.println("enter total number of sales person");
 Scanner sc = new Scanner(System.in);
 count= sc.nextInt();
 System.out.println("units sell by the sales person");
 for(i=0;i<count;i++)
 {
	 int number = sc.nextInt();
	 if(number>largest)
	 {
		 largest=number;
	 }
 }
 System.out.println("largest number of units sell are "+ largest);
}
}
