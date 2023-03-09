package com.xworkz.associate.tuesday;

public class Wallet {
public int cost;
public String type;
public Cards cards;
public Wallet wallet;
public Wallet()
{
	System.out.println("no argu const");
}
public Wallet(int cost,String type)
{
	this.cost=cost;
	this.type=type;
}
public void init(Cards cards)
{
	this.cards=cards;
}
public void display()
{
	System.out.println("cost of wallet is:"+this.cost);
	System.out.println("type of wallet is:"+this.type);
	if(cards!=null) {
		this.cards.show();
	}else{
	System.err.println("crads is not pointing any address");
	

}
}
}
