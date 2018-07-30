import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Staff {
    String _name;
    Float _salary;
    LocalDate _hire_date;
    int _staff_id;
    private static int counter;

    public void Staff(String name, Float salary, LocalDate hire_date, int staff_id){
        _name = name;
        _salary = salary;
        _hire_date = hire_date;
        _staff_id = staff_id;
        counter++;
    }

    public void print_details(){
        System.out.println("Employee name: " + _name);
        System.out.println("Salary: $" + _salary);
        System.out.println("Hire Date: " + _hire_date);
        System.out.println("Staff ID: " + _staff_id);
    }

    public void set_name() throws IOException {
        System.out.println("Enter name: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        _name = name;
    }

    public void set_salary() throws IOException {
        System.out.println("Enter salary: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String salary = br.readLine();
        Float Salary = Float.valueOf(salary);
        _salary = Salary;
    }

    public void set_hire_date() throws IOException {
        System.out.println("Enter hire date (dd-mm-yyyy): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String salary = br.readLine();
        String Split[] = salary.split("-");
        int year = Integer.valueOf(Split[2]);
        int month = Integer.valueOf(Split[1]);
        int day = Integer.valueOf(Split[0]);
        LocalDate newDate = LocalDate.of(year, month, day);
        _hire_date = newDate;
    }

    public static int getStaffCount(){
        return counter;
    }

    public void raiseSalary(Float raise){
        Float newSalary = _salary * (1+raise);
        if (newSalary < 0){
            newSalary = Float.valueOf("0");
        }
        _salary = newSalary;
    }

    @Override
    public String toString(){
        return "Staff id: " + _staff_id + "\n" + "Name: " + _name + "\n" + "Salary: $" + _salary;
    }


}
