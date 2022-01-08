package testStatic;

/**
 * @author 许劲淇
 * @date 2022/1/7 19:19
 */

public class Employee {
    /*
    用户变量：姓名、薪水、编号
    静态变量：雇员总编号
     */
    private static int nextID = 1;

    private String name;
    private double salary;

    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void main(String[] args) {
        var e = new Employee("X", 1000);
        e.setId();
        System.out.println(e.getName() + " " + e.getSalary() + " " + e.getId());
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setId() {
        id = nextID;
        nextID++;
    }
}
