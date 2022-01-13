package testAbstract;

import java.util.Objects;

/**
 * @author Ðí¾¢ä¿
 * @date 2022/01/13 10:01
 **/

public class Student extends Person {
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "A student majors in " + major;
    }

    public String getMajor() {
        return major;
    }

    public boolean equals(Student s) {
        return Objects.equals(this.getName(), s.getName()) && Objects.equals(this.getMajor(), s.getMajor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getMajor());
    }

    @Override
    public String toString() {
        return this.getClass() + "[name = " + this.getName() + ", major = " + this.getMajor() + "]";
    }
}
