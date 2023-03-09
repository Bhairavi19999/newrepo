package com.xworkz.associate.wednesday;

public class Engineer 
{
	public String name;
	public double salary;
	public String[] skill;
	public Degree[] degree;
	
	public void setName(String name)
	{
		this.name=name;
	}

	
	public void setsalary(double salary)
	{
		this.salary=salary;
	}
	
	public void setSkill(String[] skill)
	{
		this.skill=skill;
	}
	public void setDegree(Degree[] degree)
	{
		this.degree=degree;
	}
	
	public void display()
	{
		System.out.println("name is:"+this.name);
		System.out.println("salary is:"+this.salary);
		if(this.skill!=null)
		{
			for(int seq=0;seq<this.skill.length;seq++)
			{
				String element=this.skill[seq];
				System.out.println("skill is:"+element);
			}
		}
			else
            {
				System.err.println("this.skill is not pointing to any memory");
		    }
		System.out.println("            ");
		
		if(this.degree!=null)
		{
			for(int num=0;num<this.degree.length;num++)
			{
				Degree element=this.degree[num];
				element.show();
			}
		}


		
			
		
	}
}
