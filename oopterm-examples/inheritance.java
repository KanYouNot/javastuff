class Worker{
	int yearly_salary;
	String date_of_birth;
	double hours_worked_per_week;

	public Worker(){
	}

	public Worker(int yearly_salary, String date_of_birth, double hours_worked_per_week){
		this.yearly_salary = yearly_salary;
		this.date_of_birth = date_of_birth;
		this.hours_worked_per_week = hours_worked_per_week;
	}
}
class Programmer extends Worker{
	int lines_of_code_written;
	public void work(){
		System.out.println("I am programming!");
	}
}

class Cleaner extends Worker{
	int rooms_cleaned;

	public void work(){
		System.out.println("I am cleaning!");
	}
}


public class inheritance{
	public static void main(String[] args){
		Programmer william = new Programmer();
		william.work();

		Cleaner john = new Cleaner();
		john.work();
	}
}
