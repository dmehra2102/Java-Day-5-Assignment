package question2;

public class Main {
    static public void main(String[] args){
        Employee myEmployee = new Employee(260, "Deepanshu",72_000);
        Product myProduct = new Product(8.21, 432, 2);

        // Income tax of Employee
        myEmployee.calcTax();

        // Total Tax on Product
        myProduct.calcTax();
    }
}
