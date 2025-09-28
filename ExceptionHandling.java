package Exception;

public class ExceptionHandling {
    private int salary;
    protected void setSalary (int salary) throws IllegalArgumentException {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than zero");
        }
        this.salary = salary;
    }
    protected void details() {
        System.out.println("Salary is " + this.salary);
    }
}
