package com.xworkz.batch.things;

import com.xwrkz.boot.monday.Fan;

public class RunnerFlight {
	public static void main(String[] args) {
		Flight Flight=new Flight();
		
		Flight.display();
		Flight.name="Air first";
		Flight.cost=2D;
		Flight.capacity=200;
		Flight.flightnumber=2490;
		Flight.airline="air india";
		Flight.distination="mumbi";
		Flight.belongsto="ballistic";
		Flight.pilot="nivedita bhasin";
		Flight.airhostess=5;
		Flight.seats=100;
		Flight.display();


	}
}
