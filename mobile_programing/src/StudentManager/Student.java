package StudentManager;

import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private int age;
    private String course;
    private String address;
    private float mediumscore;

    public Student() {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
        this.mediumscore = mediumscore;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getMediumscore() {
        return mediumscore;
    }

    public void setMediumscore(float mediumscore) {
        this.mediumscore = mediumscore;
    }



    public static void main(String[] args){
        Student myStudent=new Student();
        System.out.println(myStudent);



    }
}
