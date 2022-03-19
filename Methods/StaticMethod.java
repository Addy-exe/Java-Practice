// STATIC METHOD :
// A static method belongs to the class, rather than the object of the class. It can be call directly with class name
// A static method can access static data member and can change it.
// Object is not required to call static method
// The static method cannot use non-static member or call non-static method directly.
// this and super cannot be used in static context.

// Static methods belongs to the class , and instance(non-static) belongs to the instance(object) of the class.

class StaticMethod{
    // This is a static block
    static {
        System.out.println("This is static block...");
    }

    public static void main(String args[]){
        Employee.switchTo();                        //calling static method by class name
        Employee e1 = new Employee(007,"Bond");
        e1.display();
        
    }

}

class Employee{
    int id;
    String name;
    // Static variable
    static String company = "IBM";

    //static method to change the value of static variable
    static void switchTo(){
        company = "PERSISTENT";
    }
    Employee(int n,String a){
        id = n;
        name = a;   
    }

    public void display(){
        System.out.println("Employee "+name+" with id "+id+" switch to "+company);
    }

}