import packagesFolder.college.College;
import packagesFolder.school.School;
//if you want to access the class of another package then you have to import that package and class in your main class. we can also use wild card * to import all the classes of a package but it is not recommended because it can lead to naming conflicts if there are multiple classes with the same name in different packages. It is better to import only the specific classes that you need to use in your code.  
//if same class is present in two different packages then we have to use fully qualified name to access that class. for example if we have two classes with the same name in two different packages then we can access them by using their fully qualified name like this packagesFolder.college.College and packagesFolder.school.School.    


//inbuilt packages in java are java.lang, java.util, java.io, java.net, java.sql, java.awt, java.swing etc. these packages contain classes and interfaces that are used for various purposes like input/output operations, networking, database connectivity, graphical user interface etc. we can also create our own packages to organize our classes and interfaces in a logical manner. to create a package we have to use the package keyword followed by the name of the package at the top of the java file. for example if we want to create a package named com.example then we have to write package com.example; at the top of our java file. after creating a package we can place our classes and interfaces inside that package and access them from other classes by importing that package.         

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.getBalance();
        account.deposit(1000);
        System.out.println(account.getBalance());
        School school = new School();
        school.display();
        College college = new College();
        college.display();
    }
}

// Encapsulation is the process of wrapping data and code together as a single
// unit. It is one of the fundamental principles of object-oriented programming
// (OOP). The main idea behind encapsulation is to hide the internal details of
// an object and only expose a public interface for interacting with that
// object. This helps to protect the integrity of the data and prevents
// unauthorized access or modification.
class Animal {
  private  int noOfLegs;
   private String color;

  public  void eat() {
        System.out.println("Animal is eating");
    }

   public void sleep() {
        System.out.println("Animal is sleeping");
    }

    Animal(int noOfLegs, String color) {
        this.noOfLegs = noOfLegs;
        this.color = color;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
    public String getColor() {
        return color;
    }
    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
    public void setColor(String color) {
        this.color = color;
    }

}

class BankAccount {
    int accountNumber;
    private double balance;
    String accountHoldername;

    public void deposit(double amount) {
        balance = balance + amount;

    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
// access modifiers are used to set the access level for classes, variables,
// methods and constructors. There are four types of access modifiers in Java:
// public, private, protected and default. Public members can be accessed from
// anywhere, private members can only be accessed within the same class,
// protected members can be accessed within the same package and by subclasses,
// and default members can only be accessed within the same package.
// public,default,protected,private
// default access modifier is used when no access modifier is specified. It
// allows access to members within the same package but not from outside the
// package.
// protected access modifier allows access to members within the same package
// and by subclasses, but not from outside the package. It is more restrictive
// than public but less restrictive than private.
// private access modifier is the most restrictive access level. It allows
// access to members only within the same class. Private members cannot be
// accessed from outside the class, including subclasses. This is useful for
// encapsulating data and ensuring that it can only be modified through
// controlled methods within the class.\
// public access modifier allows access to members from anywhere, both within
// the same package and from outside the package. It is the least restrictive
// access level and is often used for methods and variables that need to be
// accessed by other classes or packages.