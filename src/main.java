public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("samarth",007,500000);
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("ram",2,180,1000);

        payrollSystem.addEmployee(fullTimeEmployee1);

        payrollSystem.addEmployee(partTimeEmployee1);

        payrollSystem.showEmployees();

        payrollSystem.removeEmployee(02);

        payrollSystem.showEmployees();



    }
}
