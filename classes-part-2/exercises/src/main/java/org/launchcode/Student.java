package org.launchcode;

import org.w3c.dom.ls.LSOutput;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
//    public String getGradeLevel() {
//        // Determine the grade level of the student based on numberOfCredits
//        String gradeLevel = "";
//        if (numberOfCredits >= 0 && numberOfCredits <= 29) {
//            gradeLevel = "Freshman";
//        }
//        else if (numberOfCredits >= 30 && numberOfCredits<= 59) {
//            gradeLevel = "Sophomore";
//        }
//        else if (numberOfCredits >= 60 && numberOfCredits <= 89) {
//            gradeLevel = "Junior";
//        }
//        else if (numberOfCredits >= 90) {
//            gradeLevel = "Senior";
//        }
//        return gradeLevel;
//    }

    public static String getGradeLevel(int credits) {
        // Determine the grade level of the student based on numberOfCredits

        if (credits >= 0 && credits <= 29) {
            return "Freshman";
        }
        else if (credits >= 30 && credits<= 59) {
            return "Sophomore";
        }
        else if (credits >= 60 && credits <= 89) {
            return  "Junior";
        }
        else {
            return  "Senior";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        // Set qualityScore FIRST, then update or grades will be screwed up
        // because uses gpa and numberOfCredits which are about to have values changed
        // otherwise all students will fail except that one person who got "Infinity"
        double qualityScore = this.gpa * this.numberOfCredits;
        qualityScore += courseCredits * grade;

        this.numberOfCredits += courseCredits;
        this.gpa = qualityScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    public String toString() {
        String report = "";
        if (this.gpa == 4.0) {
            report = String.format("Student#%d: %s is a %s and currently has %d credits with a GPA of %.1f",this.studentId, this.name, this.getGradeLevel(this.numberOfCredits), this.numberOfCredits, this.gpa);
        } else {
            report = String.format("Student#%d: %s is a %s and currently has %d credits, but with a GPA of %.1f, %s is no longer considered a perfect student",this.studentId, this.name, this.getGradeLevel(this.numberOfCredits), this.numberOfCredits, this.gpa, this.name);
        }

        return report;
    }
    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);

        Student test = new Student("Test", 34342, 0, 0);
        System.out.println(test.getGradeLevel(35));
        test.addGrade(3, 4.0);
        test.addGrade(4, 3.0);
        System.out.println(test.gpa);
        System.out.println(test.numberOfCredits);

    }
}