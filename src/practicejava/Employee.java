public class Employee implements Comparable<Employee> {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int value1 = this.name.charAt(0);
        int value2 = o.name.charAt(0);
        if (value1 > value2)
            return 1;
        else return -1;
    }
}
