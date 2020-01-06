package StaticExample;

class StaticEmployee {
    int employeeId;
    int salary;
    String employeeName;
    static String ceoName;

    // Static block is called once when the class is being loaded to the memory
    static {
        System.out.println("Inside static block");
        ceoName = "Jeff B";
    }

    // Constructor is called during every object creation
    public StaticEmployee() {
        System.out.println("Inside default constructor");
        this.employeeId = 1;
        this.salary = 3000;
        this.employeeName = "sample";
    }

    public StaticEmployee(final int employeeId,
                    final int salary,
                    final String employeeName) {
        System.out.println("Inside parameterized constructor");
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void showDetails() {
        System.out.println("employeeId : " + this.employeeId + " employeeName : "
                + this.employeeName + " salary : " + this.salary + " ceoName : " + this.ceoName);
    }

}

class StaticEmployeeExample {
    public static void main(String args[]) {
        // create an instance for Employee
        StaticEmployee sam = new StaticEmployee();
        sam.showDetails();

        System.out.println("\n");

        // Create another instance and call parameterised constructor
        StaticEmployee ram = new StaticEmployee(2, 5000, "ram");
        StaticEmployee.ceoName = "Jeff";
        ram.showDetails();

        System.out.println("\n");

        // Create an instance and set the instance variables
        StaticEmployee tom = new StaticEmployee();
        tom.employeeId = 4;
        tom.employeeName = "tom";
        tom.salary = 6000;
        tom.showDetails();
    }
}
