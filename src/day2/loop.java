package day2;
import java.util.*;
public class loop {
Scanner ob = new Scanner(System.in); 
int N;
int getnum(){
	System.out.println("enter");
	N=ob.nextInt();
	return N;
}
void table(int a){
	int i;
	System.out.println("N   N*10   N*100   N*1000");
	for(i=1;i<=a;i++)
	{
		System.out.println(i+"    "+i*10+"     "+i*100+"     "+i*1000);
	}
}

public static void main(String args[]){
	int a;
	loop obj = new loop();
  a=obj.getnum();
  obj.table(a);
}

}
