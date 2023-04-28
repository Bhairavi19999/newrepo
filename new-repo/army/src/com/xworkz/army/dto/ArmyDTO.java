package com.xworkz.army.dto;

public class ArmyDTO {

	@Override
	public String toString() {
		return "ArmyDTO [headName=" + headName + ", totalMembers=" + totalMembers + ", salary=" + salary
				+ ", operationName=" + operationName + ", memberInOper=" + memberInOper + "]";
	}

	public String getHeadName() {
		return headName;
	}

	public void setHeadName(String headName) {
		this.headName = headName;
	}

	public int getTotalMembers() {
		return totalMembers;
	}

	public void setTotalMembers(int totalMembers) {
		this.totalMembers = totalMembers;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public int getMemberInOper() {
		return memberInOper;
	}

	public void setMemberInOper(int memberInOper) {
		this.memberInOper = memberInOper;
	}

	private String headName;
	private int totalMembers;
	private double salary;
	private String operationName;
	private int memberInOper;

	public ArmyDTO(String headName, int totalMembers, double salary, String operationName, int memberInOper) {
		this.headName = headName;
		this.totalMembers = totalMembers;
		this.salary = salary;
		this.operationName = operationName;
		this.memberInOper = memberInOper;
	}

}
