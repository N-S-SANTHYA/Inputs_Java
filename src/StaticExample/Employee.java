package StaticExample;

class Employee {
    int employeeId;
    int salary;
    String employeeName;
    String ceoName;

    public Employee() {
        this.employeeId = 1;
        this.salary = 3000;
        this.employeeName = "sample";
        this.ceoName = "Jeff";
    }

    public Employee(final int employeeId,
                    final int salary,
                    final String employeeName,
                    final String ceoName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.ceoName = ceoName;
    }

    public void showDetails() {
        System.out.println("employeeId : " + this.employeeId + " employeeName : "
                + this.employeeName + " salary : " + this.salary + " ceoName : " + this.ceoName);
    }

}

class EmployeeExample {
    public static void main(String args[]) {
        // create an instance for Employee
        Employee sam = new Employee();
        sam.showDetails();

        System.out.println("\n");

        // Create another instance and call parameterised constructor
        Employee ram = new Employee(2, 5000, "ram", "Bezos");
        ram.showDetails();

        System.out.println("\n");

        // Create an instance and set the instance variables
        Employee tom = new Employee();
        tom.employeeId = 4;
        tom.employeeName = "tom";
        tom.salary = 6000;
        tom.ceoName = "B";
        tom.showDetails();
    }
}
