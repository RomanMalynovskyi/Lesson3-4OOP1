package com.rmal.javaOOP.students;

// 2)На его основе создайте класс студент (переопределите метод вывода информации).

class Student extends Human {
    private String faculty;
    private int numberOfTestBook;

    public Student(String name, String surname, String gender, int age, String faculty, int numberOfTestBook) {
        super(name, surname, gender, age);
        this.faculty = faculty;
        this.numberOfTestBook = numberOfTestBook;
    }

    public Student() {
        super();
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getNumberOfTestBook() {
        return numberOfTestBook;
    }

    public void setNumberOfTestBook(int numberOfTestBook) {
        this.numberOfTestBook = numberOfTestBook;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Student temp = (Student) obj;
        return (this.getSurname() == temp.getSurname());
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + getSurname().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{name: " + getName() + ", surname: " + getSurname() + "\n" +
                " gender: " + getGender() + ", age: " + getAge() + "\n" +
                " faculty: " + getFaculty() + ", numberOfTestBook: " + getNumberOfTestBook() + '}' + "\n" +
                "----------------------------------------" + "\n";

    }
}
