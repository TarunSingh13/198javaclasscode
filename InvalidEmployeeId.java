package Exception;

class InvalidEmployeeId extends Exception{
    InvalidEmployeeId (String message) {
        super(message);
    }
}
class Employee {
    private String name;
    private int emp_id;
    Employee (String name, int emp_id) throws InvalidEmployeeId{
     if (emp_id <= 0) {
         throw new InvalidEmployeeId("Emp id must be greater than zero");
     }
     this.name =  name;
     this.emp_id = emp_id;
    }
}
class TestClass {
    public static void main(String[] args) {
        try {
            Employee E1 = new Employee("XYZ", 0);
        } catch (InvalidEmployeeId e){
            System.out.println(e);
        }
    }
}