package testAbstract;

import java.util.Objects;

/**
 * @author Ðí¾¢ä¿
 * @date 2022/01/13 09:58
 **/

public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public boolean equals(Person p) {
        return Objects.equals(name, p.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getClass() + "[name = " + this.getName() + "]";
    }
}
