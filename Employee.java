public class Employee {
    String employeeID;
    String fullName;
    String isActive;    

public Employee(String employeeID, String fullName, String isActive) {
    this.employeeID = employeeID;
    this.fullName = fullName;
    this.isActive = isActive;
    
    }
    public String getEmployeeID() {
        return employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getIsActive() {
        return isActive;
    }
}
