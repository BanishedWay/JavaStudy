package testArrayList;

/**
 * @author �� ���
 * @date 2022/01/13 14:19
 **/

import testAbstract.Employee;

public class testReflect {
    //�������ָ�ڳ������й����У����Ի�ȡ���������Ϣ
    public static void main(String[] args) throws ClassNotFoundException {
        Employee employee = new Employee("Harry", 10000, 1989, 10, 1);
//        Class<?> cl = Class.forName("Employee");
        System.out.println(employee.getClass() + " " + employee.getName());

       /* //ʹ�÷�����ƣ����Ի�ȡ�������ж϶�������
        if (employee.getClass() == Person.class) {
        }//�ж��Ƿ��Ǳ���
        if (employee instanceof Employee) {

        }//�ж��Ƿ��Ǳ����������*/
        /*System.out.println(employee instanceof Person);
        Person p = new Student("Mike", "Science");
        System.out.println(p instanceof Employee);*/
    }
}
