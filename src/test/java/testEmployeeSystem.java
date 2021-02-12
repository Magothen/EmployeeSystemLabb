import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class testEmployeeSystem {

    @Test
    @DisplayName("Test av konstruktor i Employee-klassen")
    void testConstructor(){
        Employee testPerson = new Employee("Maria", "Shishkina", 25, 45000);
        Assertions.assertEquals("Maria", testPerson.getFirstName());
        Assertions.assertEquals("Shishkina", testPerson.getLastName());
        Assertions.assertEquals(25, testPerson.getAge());
        Assertions.assertEquals(45000, testPerson.getSalary());
        Assertions.assertEquals(9, testPerson.getIdUnique());
        System.out.println(testPerson.getIdUnique());
        System.out.println(testPerson.getFirstName());
        System.out.println(testPerson.getLastName());
        System.out.println(testPerson.getAge());
        System.out.println(testPerson.getSalary());
    }

    @Test
    @DisplayName("Test av att lägga till  anställda")
    void testEmployeeClass() {
        Employee testPerson = new Employee("M", "S", 20, 1000);
        String expected1 = "Maria";
        testPerson.setFirstName("Maria");
        String expected2 = "Shishkina";
        testPerson.setLastName("Shishkina");
        int expected3 = 35;
        testPerson.setAge(35);
        int expected4 = 45000;
        testPerson.setSalary(45000);
        Assertions.assertEquals(expected1, testPerson.getFirstName());
        Assertions.assertEquals(expected2, testPerson.getLastName());
        Assertions.assertEquals(expected3, testPerson.getAge());
        Assertions.assertEquals(expected4, testPerson.getSalary());
        System.out.println(testPerson.getIdUnique());
        System.out.println(testPerson.getFirstName());
        System.out.println(testPerson.getLastName());
        System.out.println(testPerson.getAge());
        System.out.println(testPerson.getSalary());
    }

    @Test
    @DisplayName("Test av att lägga till  anställda i systemet")
    void testEmployeeSystemAdd(){
        EmployeeSystem e1 = new EmployeeSystem();
        Employee testPerson1 = new Employee("Maria", "Shishkina", 35, 45000);
        e1.addEmployeeSystem(testPerson1);
        Assertions.assertEquals(e1.arr.get(0), testPerson1);
        System.out.println(e1.arr.get(0).toString());

        Employee testPerson2 = new Employee("Vincent", "Adler", 28, 46000);
        e1.addEmployeeSystem(testPerson2);
        Assertions.assertEquals(e1.arr.get(1), testPerson2);
        System.out.println(e1.arr.get(1).toString());

        Employee testPerson3 = new Employee("Alexéy", "Shishkin", 11, 1000);
        e1.addEmployeeSystem(testPerson3);
        Assertions.assertEquals(e1.arr.get(2), testPerson3);
        System.out.println(e1.arr.get(2).toString());
    }

    @Test
    @DisplayName("Test av att lägga till och ta bort  en anställd från systemet")
    void testEmployeeSystemRemove(){
        EmployeeSystem e = new EmployeeSystem();
        Employee testPerson = new Employee("Alexéy", "Shishkin", 11, 1000);
        e.addEmployeeSystem(testPerson);
        Assertions.assertEquals(e.arr.get(0), testPerson);
        System.out.println(e.arr.get(0).toString());

        e.removeEmployeeSystem(testPerson);
        Assertions.assertEquals(e.arr.size(), 0);
        System.out.println(e.arr.size());
    }

    @Test
    @DisplayName("Test att öka lön för en specifik anställd")
    void testNewSalaryOne(){
        Employee testPerson = new Employee("Alexéy", "Shishkin", 11, 1000);
        int expected = 1100;
        double actual = testPerson.newSalary(1.1);
        Assertions.assertEquals(expected, actual);
        System.out.println("Den nya lönen för " + testPerson.getFirstName() + " är " + actual);
    }

    @Test
    @DisplayName("Test att öka lön för alla anställda")
    void testNewSalaryAll(){
        EmployeeSystem Person = new EmployeeSystem();
        Employee testPerson1 = new Employee("Maria", "Shishkina", 35, 45000);
        Employee testPerson2 = new Employee("Alexéy", "Shishkin", 11, 1000);
        Person.addEmployeeSystem(testPerson1);
        Person.addEmployeeSystem(testPerson2);
        double expected1 = 54000;
        Person.increaseSalaryAll(1.2);
        double expected2 = 1200;
        Assertions.assertEquals(expected1, Person.arr.get(0).getSalary());
        Assertions.assertEquals(expected2, Person.arr.get(1).getSalary());
        System.out.println("Den nya lönen för " + testPerson1.getFirstName() + " är " + Person.arr.get(0).getSalary() + " och de nya uppgifterna nu är " + Person.arr.get(0).toString());
        System.out.println("Den nya lönen för " + testPerson2.getFirstName() + " är " + Person.arr.get(1).getSalary() + " och de nya uppgifterna nu är " + Person.arr.get(1).toString());
    }
}
