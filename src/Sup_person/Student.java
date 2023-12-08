
package Sup_person;

class Student {
             private String name;
             private int YearBirth;
             private String major;

    // Constructor
    public Student(String name, int YearBirth , String major) {
             this.name = name;
             this.YearBirth = YearBirth;
             this.major = major;
    }

    // Getters and Setters
    public String getName() {
             return name;
    }

    public void setName(String name) {
             this.name = name;
    }

    public int getYearBirth() {
             return YearBirth;
    }

    public void setYearBirth(int YearBirth) {
             this.YearBirth = YearBirth;
    }

    public String getMajor() {
             return major;
    }

    public void setMajor(String major) {
             this.major = major;
    }

   
    public String toString() {
             return "Name: " + name + "\nYearBirth: " + YearBirth + "\nMajor: " + major ;
    }
}