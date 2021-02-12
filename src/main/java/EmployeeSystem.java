import java.util.ArrayList;

public class EmployeeSystem {

    public ArrayList<Employee> arr = new ArrayList<>();


    public void addEmployeeSystem(Employee person){
        arr.add(person);
    }

    public void removeEmployeeSystem(Employee individ){
        int index = arr.indexOf(individ);
        arr.remove(index);
    }


    public void increaseSalaryAll(double x){
       for(int i = 0; i < arr.size(); i++){
           arr.get(i).newSalary(x);
       }
    }



}











