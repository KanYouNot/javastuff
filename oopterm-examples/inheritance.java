public class worker{
	int yearly_salary;
	String date_of_birth;
	double hours_worked_per_week;
}
public class programmer extends worker{
	int lines_of_code_written;
	public void work(){
		System.out.println("I am programming!");
	}
}

public class cleaner extends worker{
	int rooms_cleaned;

	public void work(){
		System.out.println("I am cleaning!");
	}
}


public class inheritance{
	public static void main(String []args){
		programmer william = new.programmer;
		william.work;

		cleaner john = new.cleaner;
		john.work;
	}
}
