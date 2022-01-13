package testStatic;

import java.time.LocalDate;

/**
 * @author �� ���
 * @date 2022/1/7 19:19
 */

public class Employee {

    /*
    �û�������������нˮ�����
    ��̬��������Ա�ܱ��
     */
    private static int nextID = 1;

    private String name;
    private double salary;
    private LocalDate hireDay;

    private int id;

    public Employee() {

    }

    /**
     * ���췽����ͨ��������н�ʳ�ʼ������
     *
     * @param name   Ա��������
     * @param salary Ա��нˮ
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        id = 0;
    }

    /**
     * ͨ��������н�ʡ���Ӷ���ڹ����¶���
     *
     * @param name   Ա������
     * @param salary Ա��нˮ
     * @param year   ��Ӷ��
     * @param month  ��Ӷ��
     * @param day    ��Ӷ��
     */
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    /**
     * ��ȡ��һ������ְ��Ա��Ӧ�е�Ա�����
     *
     * @return ����Ա�����
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
     * ���õ�ǰԱ�����
     */
    public void setId() {
        id = nextID;
        nextID++;
    }

    /**
     * ���н��
     *
     * @param byPercent ���н�ʱ���
     */
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}
