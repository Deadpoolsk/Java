class EducationalInstitute{
	
	void admitStudnets() {
		System.out.println("Educational Institute takes  admission...");		
	}
	void conductExams() {
		System.out.println("Educational Institute conducts exams...");
	}
}

class School extends EducationalInstitute{
	
	void conductExams() {
		System.out.println("School conducts unit test, mid term, final exams...");
	}
	void  conductFieldTrips(){
		System.out.println("School conducts field trips...");		
	}
}

class College extends EducationalInstitute {
	
	void conductExams() {
		System.out.println("College conducts internals...");
	}
	void conductInternships() {		
		System.out.println("College conducts internships...");
	}
}

class University extends EducationalInstitute {
	
	void conductExams() {
		System.out.println("University conducts final exams...");
	}
	void conductReserch() {
		System.out.println("University conducts reserch...");		
	}
}

public class Inheritance02 {

	public static void main(String[] args) {

		School s = new School();
		s.admitStudnets();
		s.conductExams();
		s.conductFieldTrips();
		System.out.println();
		
		College c = new College();
		c.admitStudnets();
		c.conductExams();
		c.conductInternships();
		System.out.println();
		
		University u = new University();
		u.admitStudnets();
		u.conductExams();
		u.conductReserch();
		System.out.println();
	}

}
