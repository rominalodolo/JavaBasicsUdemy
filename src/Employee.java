public class Employee {
    String EmployeeName;
    int age;
    float salary;
    String Dept;

    public void grossSalary(){
        salary = 8000;
        System.out.println("Total salary = " + salary);
    }

    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.grossSalary();
    }
}
