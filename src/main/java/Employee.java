public class Employee {

    private String fName;
    private String lName;
    private int age;
    private double salary;
    private int idUnique;
    private static int idCount = 0;


    public Employee(String fn, String ln, int a, double s) {
        this.fName = fn;
        this.lName = ln;
        this.age = a;
        this.salary = s;
        idCount += 1;
        this.idUnique = idCount;

    }

    public void setFirstName(String firstName) {
        fName = firstName;
    }

    public String getFirstName() {
        return this.fName;
    }

    public void setLastName(String lastName) {
        lName = lastName;
    }

    public String getLastName() {
        return this.lName;
    }

    public void setAge(int Age) {
        age = Age;
    }

    public int getAge() {
        return this.age;
    }

    public void setSalary(double Salary) {
        salary = Salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getIdUnique(){
        return idUnique;
    }

    public double newSalary(double a){
        if(a > 1 && a < 2) {
            this.salary = this.salary * a;
        }
        return this.salary;
    }

    public String toString(){
        return (idUnique + " First name: "+ fName + " Last name: " + lName + " Age: " + age + " Salary: " + salary);
    }
}
