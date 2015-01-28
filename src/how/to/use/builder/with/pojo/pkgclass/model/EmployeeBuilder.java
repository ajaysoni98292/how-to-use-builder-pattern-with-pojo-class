package how.to.use.builder.with.pojo.pkgclass.model;

/**
 *
 * @author ajay
 */
public class EmployeeBuilder {
    private String firstName;
    private String lastName;
    private int employeeId;

    public EmployeeBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public EmployeeBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public EmployeeBuilder setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public Employee createEmployee() {
        return new Employee(firstName, lastName, employeeId);
    }
}