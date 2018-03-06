package greenfox;

public class Sponsor extends Person{
  private String company;
  private Integer hiredStudents;

  public Sponsor(String name, Integer age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public void introduce() {
    System.out.println("Hi, I'm " + this.getName() + ", a " + this.getAge() + " year old " + this.getGender()
            + " who represents " + company + "and hired " + hiredStudents +  "students so far.");
  }
  public void hire() {
    hiredStudents++;
  }
  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }
  public Sponsor(String company) {
    this.company = company;
  }

  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
