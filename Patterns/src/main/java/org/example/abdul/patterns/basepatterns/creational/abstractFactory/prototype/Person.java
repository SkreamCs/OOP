package org.example.abdul.patterns.basepatterns.creational.abstractFactory.prototype;

public class Person implements Copyable<Person>{
    private int age;
    private String nameFirst;
    private String nameLast;
    public Person(int age, String nameFirst, String nameLast) {
        this.age = age;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNameFirst() {
        return nameFirst;
    }

    public void setNameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }


    @Override
    public Person copyObject() {
        return new Person(age, nameFirst, nameLast);
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", nameFirst='" + nameFirst + '\'' +
                ", nameLast='" + nameLast + '\'' +
                '}';
    }
}
