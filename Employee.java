package BSIT_2D_Activity1;

class Employee {
  private String name;
  private int age;
  private double salary;
    
    //constructor
    
    public Employee (String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        
    }


  // getters

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public double getSalary() {
    return this.salary;
  }
// setters

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}

