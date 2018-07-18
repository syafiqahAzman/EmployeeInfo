package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 16046491 on 18/7/2018.
 */

public class EmployeeItem {
    private String employeeName;
    private String title;
    private double salary;

    public EmployeeItem(String employeeName, String title, double salary) {
        this.employeeName = employeeName;
        this.title = title;
        this.salary = salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String  toString() {
        return "EmployeeItem{" +
                "employeeName='" + employeeName + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
