public class Employee {
    private int department;
    private double salary;
    private static int count = 1;
    private final int id;
    private String fullName;
    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = count++;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public static int getCount() {
        return count;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return getId() + ". ФИО: " + fullName + ". Отдел: " +getDepartment() + ". Оклад: " +getSalary();
    }
}
