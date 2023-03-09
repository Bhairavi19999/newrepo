package com.xwrkz.inheritance.equals;

public class PoliceStation {
	private String location;
	private String name;
	private int noOfPolice;
	private int noOfLadiesStaff;
	private int noOfMaleStaff;
	private int noOfDoors;
	private int noofbenches;
	private String acpName;
	private int noOfCells;
	private int noOfJeep;

	public PoliceStation() {
		System.out.println("no arg const in policestation");
	}

	public PoliceStation(String location, String name, int noOfPolice, int noOfLadiesStaff, int noOfMaleStaff,
			int noOfDoors, int noofbenches, String acpName, int noOfCells, int noOfJeep) {
		this.location = location;
		this.name = name;
		this.noOfPolice = noOfPolice;
		this.noOfLadiesStaff = noOfLadiesStaff;
		this.noOfMaleStaff = noOfMaleStaff;
		this.noOfDoors = noOfDoors;
		this.noofbenches = noofbenches;
		this.acpName = acpName;
		this.noOfCells = noOfCells;
		this.noOfJeep = noOfJeep;
	}

	@Override
	public String toString() {
		return "location:" + this.location + "\nname:" + this.name + "\nnoofpolice:" + this.noOfPolice
				+ "\nnoofladiesstaff:" + this.noOfLadiesStaff + "\nnoOfMaleStaff:" + this.noOfMaleStaff + "\nnoOfDoors:"
				+ this.noOfDoors + "\nnoofbenches:" + this.noofbenches + "\nacpname:" + this.acpName + "\nnoofcells:"
				+ this.noOfCells + "\nnoofjeep:" + this.noOfJeep;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running obj in policestation");
		if (obj != null) {
			System.out.println("obj is not null");
			if (obj instanceof PoliceStation) {
				System.out.println("obj is PoliceStation");
				PoliceStation casted = (PoliceStation) obj;
				PoliceStation left = this;
				PoliceStation right = casted;
				if (left.location.equals(right.location) && left.name.equals(right.name)
						&& left.noOfPolice == right.noOfPolice && left.noOfLadiesStaff == right.noOfLadiesStaff
						&& left.noOfMaleStaff == right.noOfMaleStaff && left.noOfDoors == right.noOfDoors
						&& left.noofbenches == right.noofbenches && left.acpName.equals(right.acpName)
						&& left.noOfCells == right.noOfCells && left.noOfJeep == right.noOfJeep) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.err.println("left is not equal to right");
				}
			} else {
				System.err.println("obj is not PoliceStation");
			}
		} else {
			System.err.println("obj is null");
		}
		return super.equals(obj);
	}

}
