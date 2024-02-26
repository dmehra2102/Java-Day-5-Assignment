package question2;

public class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary){
        this.salary = salary;
        this.empId = empId;
        this.name = name;
    }

    public void calcTax() {
        double taxableAmount =  (salary * (incomeTax / 100))*12;
        System.out.println("Income tax (p.a) : "+ taxableAmount);
    }
}
