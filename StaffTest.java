import java.io.IOException;
import java.time.LocalDate;

public class StaffTest {
    public static void main(String[] args) throws IOException {
        Staff s = new Staff();
        int staff_id = 1;
        String name = "Jane Mary";
        Float salary = Float.valueOf("40000");
        LocalDate hire_date = LocalDate.of(2018, 1, 12);
        s.Staff(name, salary, hire_date, staff_id);
        printStaffDetails(s);

        System.out.println("\n");

        Lecturer l = new Lecturer();
        int staff_id2 = 2;
        String name2 = "Andrew Scott";
        Float salary2 = Float.valueOf("110000");
        LocalDate hire_date2 = LocalDate.of(2010, 1, 10);
        l.Staff(name2, salary2, hire_date2, staff_id2);
        l.setSchool("Business School");
        l.setAcademic_level("C");
        printStaffDetails(l);

        System.out.println("\n");

        Head h = new Head();
        int staff_id3 = 3;
        String name3 = "Peat Wilson";
        Float salary3 = Float.valueOf("140000");
        LocalDate hire_date3 = LocalDate.of(2017, 3, 10);
        h.Staff(name3, salary3, hire_date3, staff_id3);
        h.setSchool("Business School");
        h.setAcademic_level("C");
        h.setBudget(Float.valueOf("500000"));
        printStaffDetails(h);

        System.out.println("\n");

        l.raiseSalary(Float.valueOf("0.1"));
        printStaffDetails(l);
    }

    private static void printStaffDetails(Staff staff){
        String details = staff.toString();
        System.out.println(details);
    }
}
