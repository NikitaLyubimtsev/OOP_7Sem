package jobagency;

public class Teacher implements Observer{
    String name;

    public Teacher(String name) { this.name = name; }
    @Override
    public void receiveOffer(String nameCompany, int salary) {
       if (salary < 40) {
           System.out.println(String.format("Teacher %s: I am waiting for the better job! (company, salary) = %s, %d", name, nameCompany, salary));
       } else {
           System.out.println(String.format("Teacher %s: Ok. I am ready for this job! (company, salary) = %s, %d", name, nameCompany, salary));
       }
    }
}
