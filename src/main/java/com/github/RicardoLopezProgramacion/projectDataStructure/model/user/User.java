package com.github.RicardoLopezProgramacion.projectDataStructure.model.user;

import java.time.LocalDate;

public class User {

    // <data for user profile> {

    // < data for login>

    private String user;
    private String password;

    // </data for login>

    private String name;
    private String lastName;
    private String cellphone;
    private String studentCode;
    private int age;
    private String description;
    private LocalDate dayOfBirth;
    private String email;

    // </data for user profile>

    // constructor overloading
    // constructor for login
    public User(String name, String lastName, String cellphone, String studentCode) {
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.studentCode = studentCode;
    }
    // constructor for register user
    public User(String password, String user, String name, String lastName, String cellphone, String studentCode, int age, String description, LocalDate dayOfBirth, String email) {
        this.password = password;
        this.user = user;
        this.name = name;
        this.lastName = lastName;
        this.cellphone = cellphone;
        this.studentCode = studentCode;
        this.age = age;
        this.description = description;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
    }

    // getters and setters

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public String getUser() { return user; }

    public void setUser(String user) { this.user = user; }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User = {" +
                "name: '" + name + '\n' +
                ",lastName : " + lastName + '\n' +
                ",cellphone : " + cellphone + '\n' +
                ",studentCode : " + studentCode + '\n' +
                ",age : " + age + '\n' +
                ",description : " + description + '\n' +
                ",dayOfBirth : " + dayOfBirth + '\n' +
                ",email : " + email + '\n' +
                '}';
    }
}
