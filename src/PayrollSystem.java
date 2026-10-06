import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private ArrayList <Employee> employeeList;

    PayrollSystem(){
        employeeList = new ArrayList <>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
        System.out.println("Employee added successfully "+"\n name of employee is  "+employee.getName());
    }

    public void removeEmployee(int id){
        Employee employeeToRemove=null;
        for (Employee emp : employeeList){
            if (emp.getId()==id){
                employeeList.remove(emp);
                break;
            }
        }
        if  (employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
            System.out.println("Employee removed successfully"+"name of removed employee is  "+employeeToRemove.getName());
        }
    }

    public void showEmployees() {
        System.out.println("Employee List"+" \n the list of employee contains these employees :");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

}
