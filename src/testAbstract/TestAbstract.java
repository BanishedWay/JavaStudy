package testAbstract;

/**
 * 本项目用于测试抽象类
 *
 * @author 许劲淇
 * @date 2022/01/13 10:03
 **/

public class TestAbstract {
    public static void main(String[] args) {
        var people = new Person[2];

        people[0] = new Student("Maria", "Computer Science");
        people[1] = new Employee("Harry", 5000, 1989, 10, 1);

        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getDescription());
            System.out.println(person.getClass());
            System.out.println(person);
        }
        System.out.println(System.in);
    }
}
