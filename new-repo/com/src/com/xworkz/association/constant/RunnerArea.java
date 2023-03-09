package com.xworkz.association.constant;

public class RunnerArea {
	public static void main(String[] args) {

		Area area = new Area("rajajinagar", 100, 2);
		area.show();

		City city = new City();
		city.setInfo("tumkur", "banglore", "manglore");
		city.setArea(area);
        city.display();
        
        
        State state=new State();
        state.setinfo("karnataka", "kumar","kannada");
        state.setCity(city);
        state.display();
        
        Country country=new Country();
        country.setinfo("india", "RR", true);
        country.setState(state);
        country.display();
        
        Company company=new Company();
        company.setinfo("TATA", "rathan", 1990);
        company.setCountry(country);
        company.display();
        
        
        Security security=new Security();
        security.setinfo("Gurads", 120, "majorram");
        security.setCompany(company);
        security.display();
        
        
        Mall mall=new Mall();
        mall.setinfo("lulu",true,10);
        mall.setSecurity(security);
        mall.display();
        
	}
}