package Lesson_5;

import java.text.MessageFormat;

public class User {

    private long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String position;
    private String email;
    private long telephone;
    private float salary;
    private int age;

    public User() {
        this.lastName = "Н/Д";
        this.firstName = "Н/Д";
        this.middleName = "Н/Д";
        this.position = "Н/Д";
        this.email = "Н/Д";
        this.telephone = 0;
        this.salary = 0.0F;
        this.age = 0;
    }

    public void printUser() {
        System.out.println(MessageFormat.format(
                " ФИО: {0} {1} {2}," +
                        " Должность: {3}," +
                        " mail: {4}," +
                        " Телефон: {5}," +
                        " Зарплата: {6}," +
                        " Возраст: {7},", lastName, firstName, middleName, position, email, telephone, salary, age
        ));
    }

    public boolean ageLimit(int ageMin) {
        if (this.age > ageMin) {
            return true;
        } else {
            return false;
        }

    }

    public User(String lastName, String firstName, String middleName, String position, String email, long telephone, float salary, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }


}
