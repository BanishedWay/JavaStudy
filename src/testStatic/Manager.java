package testStatic;

/**
 * @author ���
 * @date 2022/01/10 20:13
 **/

public class Manager extends Employee {

    private double bonus;

    /**
     * @param name
     * @param salary
     */
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public Manager() {
        super();
    }

    /**
     * @param name
     * @param salary
     * @param year
     * @param month
     * @param day
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 0;
    }

    /**
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * ��дgetSalary������ʹ�þ���н��Ϊ����+����
     *
     * @return
     */
    @Override
    public double getSalary() {
        return super.getSalary() + this.bonus;
    }
}
