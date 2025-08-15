package assessmentday4;

class After12th {
	void showStreams() {
		System.out.println("Streams available after 12th:");
	}
}


class Engineering extends After12th {
	void engineeringCourses() {
		System.out.println("Engineering Courses: IT, Mechanical, CS");
	}
}

class Medical extends After12th {
	void medicalCourses() {
		System.out.println("Medical Courses: MBBS, BDS");
	}
}

class OtherCourses extends After12th {
	void otherCourses() {
		System.out.println("Other Courses: BBA, BCA");
	}
}

public class CareerOptions {
	public static void main(String[] args) {
		System.out.println("******Engineering Path******");
		Engineering eng = new Engineering();
		eng.showStreams();
		eng.engineeringCourses();

		System.out.println("\n******Medical Path******");
		Medical med = new Medical();
		med.showStreams();
		med.medicalCourses();

		System.out.println("\n******Other Courses Path******");
		OtherCourses oc = new OtherCourses();
		oc.showStreams();
		oc.otherCourses();
	}
}
