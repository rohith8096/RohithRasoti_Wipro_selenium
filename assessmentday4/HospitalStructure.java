package assessmentday4;

//Base class
class Hospital {
	void welcome() {
		System.out.println("Welcome to the Hospital");
	}
}

//Doctor branch
class Doctor extends Hospital {
	void role() {
		System.out.println("Doctor's Role: Treating patients");
	}
}

class Gynac extends Doctor {
	void department() {
		System.out.println("Department: Gynecology");
	}
}

class Endo extends Doctor {
	void department() {
		System.out.println("Department: Endocrinology");
	}
}

class Cardiac extends Doctor {
	void department() {
		System.out.println("Department: Cardiology");
	}
}

class Operation extends Cardiac {
	void area() {
		System.out.println("Area: Cardiac Operations");
	}
}

class OPD extends Cardiac {
	void area() {
		System.out.println("Area: Cardiac OPD");
	}
}

//Nurse branch
class Nurse extends Hospital {
	void duty() {
		System.out.println("Nurse's Duty: Assist doctors and care for patients");
	}
}

//Accountant branch
class Accountant extends Hospital {
	void role() {
		System.out.println("Accountant's Role: Manage hospital finances");
	}
}

class Payments extends Accountant {
	void task() {
		System.out.println("Handles: Payments");
	}
}

class Documentation extends Accountant {
	void task() {
		System.out.println("Handles: Documentation");
	}
}

//Main class
public class HospitalStructure {
	public static void main(String[] args) {
		System.out.println("\n******Gynac Department******");
		Gynac g = new Gynac();
		g.welcome();
		g.role();
		g.department();

		System.out.println("\n*******Endocrinology Department*******");
		Endo e = new Endo();
		e.welcome();
		e.role();
		e.department();

		System.out.println("\n*******Cardiac OPD*******");
		OPD opd = new OPD();
		opd.welcome();
		opd.role();
		opd.department();
		opd.area();

		System.out.println("\n*******Cardiac Operation *******");
		Operation op = new Operation();
		op.welcome();
		op.role();
		op.department();
		op.area();

		System.out.println("\n*******Nurse*******");
		Nurse n = new Nurse();
		n.welcome();
		n.duty();

		System.out.println("\n*******Payments*******");
		Payments p = new Payments();
		p.welcome();
		p.role();
		p.task();

		System.out.println("\n*******Documentation*******");
		Documentation d = new Documentation();
		d.welcome();
		d.role();
		d.task();
		
		
	}
}
