public class Head extends Lecturer{
    Float budget;

    public void setBudget(Float newBudget){
        budget = newBudget;
    }

    @Override
    public String toString(){
        return "Staff id: " + _staff_id + "\n" + "Name: " + _name + "\n" + "Salary: $" + _salary + "\n" + "School: " + school + "\n"
                + "Academic Level: " + academic_level + "\n" + "Budget: $" + budget + "\n";

    }
}
