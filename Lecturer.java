public class Lecturer extends Staff {
    String school;
    String academic_level;

    public void setSchool(String school_name){
        school = school_name;
    }

    public void setAcademic_level(String level){
        academic_level = level;
    }

    @Override
    public String toString(){
        return "Staff id: " + _staff_id + "\n" + "Name: " + _name + "\n" + "Salary: $" + _salary + "\n" + "School: " + school + "\n" + "Academic Level: " + academic_level;
    }
}
