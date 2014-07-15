package domain;

/**
 * Created by dingcheng on 2014/7/15.
 */
public class Person {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "create a person named "+name+" and aged "+age;
    }
}
