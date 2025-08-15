package assessmentday3;

public class Employee {

	int empId, age;
	float salary;
	String name;
	static String companyName = "Wipro";

	void details(int empId1, int age1, String name1, float salary1) {
		empId = empId1;
		age = age1;
		name = name1;
		salary = salary1;

		System.out.println("Employee ID = " + empId);
		System.out.println("Age = " + age);
		System.out.println("Name = " + name);
		System.out.println("Salary = " + salary);
		System.out.println("Company Name = " + companyName);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		System.out.println("************1st Employee*************");
		emp1.details(201, 23, "Rohith", 30000.0f);

		System.out.println("************2nd Employee*************");
		Employee emp2 = new Employee();
		emp2.details(202, 25, "sai", 50000.0f);
	}
}




