package education.dto;

public class Runner {

	public static void main(String[] args) {
		EducationDTO ref = new EducationDTO("hgfih", 60, "hghdf", 90);
		EducationRepo ref1 = new EducationRepoImp();
		EducationService ref2 = new EducationServiceImp(ref1);
		boolean save = ref2.saveAndValidate(ref);
		System.out.println("save:" + save);

		EducationDTO ref3 = new EducationDTO("hgyif", 20, "hjgfs", 30);
		boolean save1 = ref2.saveAndValidate(ref3);
		System.out.println("saved:" + save1);

		ref2.find(ref3);
		ref2.findByName("hgfih");
		System.out.println("total is:"+ref2.total());
	}

}
