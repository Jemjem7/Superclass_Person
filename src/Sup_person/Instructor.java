package Sup_person;

class Instructor {
             private String name;
             private int YearBirth;
             private double salary;

       public Instructor(String name, int YearBirth, double salary) {
             this.name = name;
             this.YearBirth = YearBirth;
             this.salary = salary;
    }
    
       public String getName() {
             return name;
    }
       public void setName(String name) {
             this.name = name;
    }
       public int getBirthYear() {
             return YearBirth;
    }

       public void setYearBirth(int YearBirth) {
             this.YearBirth= YearBirth;
    }

       public double getSalary() {
             return salary;
    }

       public void setSalary(double salary) {
             this.salary = salary;
    }
    

      public String toString() {
            return "Name: " + name + "\nBirth Year: " +YearBirth;
    }
}

