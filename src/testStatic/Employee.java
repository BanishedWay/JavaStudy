package testStatic;

import java.time.LocalDate;

/**
 * @author 许 劲淇
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
    private LocalDate hireDay;

    private int id;

    public Employee() {

    }

    /**
     * 构造方法，通过姓名和薪资初始化对象
     *
     * @param name   员工的姓名
     * @param salary 员工薪水
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    /**
     * 通过姓名、薪资、雇佣日期构建新对象
     *
     * @param name   员工姓名
     * @param salary 员工薪水
     * @param year   雇佣年
     * @param month  雇佣月
     * @param day    雇佣日
     */
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    /**
     * 获取下一个新入职的员工应有的员工编号
     *
     * @return 返回员工编号
     */
    public static int getNextID() {
        return nextID;
    }

    public static void main(String[] args) {
        var e = new Employee("X", 1000);
        e.setId();
        System.out.println(e.getName() + " " + e.getSalary() + " " + e.getId());
    }

    public LocalDate getHireDay() {
        return hireDay;
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

    /**
     * 设置当前员工编号
     */
    public void setId() {
        id = nextID;
        nextID++;
    }

    /**
     * 提高薪资
     *
     * @param byPercent 提高薪资比例
     */
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
