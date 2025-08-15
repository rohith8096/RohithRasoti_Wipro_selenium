package assessmentday4;


class BaseHospital {
	String hospitalName = "City Hospital";

	void displayHospital() {
		System.out.println("Hospital Name: " + hospitalName);
	}
}

class Patient extends BaseHospital {
	String patientName = "John Doe";

	void displayPatient() {
		System.out.println("Patient Name: " + patientName);
		super.displayHospital(); // call parent method
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		Patient p = new Patient();
		p.displayPatient();
	}
}
