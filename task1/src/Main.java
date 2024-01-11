import java.util.ArrayList;
public class Main {
    static class Employee{
        String empName;
        float sickLeave;
        Employee(String empName, float sickLeave){
            this.empName=empName;
            this.sickLeave=sickLeave;
        }
    }

    public static void printEmployeesWithBonus(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            if (employee.sickLeave == 0) {
                System.out.println(employee.empName + " have bonus");
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> emp =new ArrayList<>();
        emp.add(new Employee("SreeLakshmi",4));
        emp.add(new Employee("Maneesha",0));
        emp.add(new Employee("rumaisa",0));
        emp.add(new Employee("safar",4));

        printEmployeesWithBonus(emp);
    }
}