package com.example.classwork6;

public class Students {

    private String studentName;
    private int studentAge;
    private int studentPhoto;
    private int studentGrade;



    public Students(String studentName, int studentAge, int studentGrade,int studentPhoto ){

        this.studentName = studentName;
        this.studentAge  = studentAge;
        this.studentPhoto= studentPhoto;
        this.studentGrade= studentGrade;


    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade) {
        this.studentGrade = studentGrade;
    }

    public int getStudentPhoto() {
        return studentPhoto;
    }

    public void setStudentPhoto(int studentPhoto) {
        this.studentPhoto = studentPhoto;
    }
}
