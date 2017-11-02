package day2;
 class Invoice{
	 String number;
	 String description;
	 int quantity;
	 double price;
	 Invoice(String n,String d,int q, double p)
	 {
		 number=n;
		 description=d;
		 quantity=q;
		 price= p;
	 }
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		if(quantity<0)
			quantity=0;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		if(price<0)
		price=0.0;
	}
	double getInvoiceAmount()
	{
		return price*quantity;
	}
 }

public class Invoicetest {

	public static void main(String[] args) {
	double a,b;
    int c;
    String d,e;
		Invoice obj =new Invoice("opp","book",3,100);
        
         obj.setDescription("book");
         obj.setNumber("oop");
         obj.setQuantity(-3);
         obj.setPrice(100);
         d=obj.getDescription();
         System.out.println("description"+d);
         e=obj.getNumber();
         System.out.println("Number "+e);
         b=obj.getPrice();
         System.out.println("Price "+b);
         c=obj.getQuantity();
         System.out.println("Quantity "+c);
         a=obj.getInvoiceAmount();
         System.out.println("total amount "+a);
         // TODO Auto-generated method stub

	}

}
