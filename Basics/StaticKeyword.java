// STATIC KEYWORD : mianly used for memory management

// 1} Static Variable : (makes program memory efficient)
// The static variable can be used to refer to the common property of all objects (which is not unique for each object).
// Ex:- college name of students can be static as it would be same for every student object.
// Static variable will get the memory only once, if any object will change the value of static variable
// it will retain(not loose) its value.

class StaticKeyword{

    public static void main(String args[]){
        Student s1 = new Student(61,"Aditya Patil");
        Student s2 = new Student(37,"Vinayak Yeole");

        s1.show();
        s2.show();
    }

}

class Student{
    //int count = 0;                         //will get memory each time when the instance(object) is created
    static int count = 0;                    //will get memory only once and retain(stores) its value after update
    int rollNo;
    String name;
    static String collegeName = "MET Institute of Engineering";            // Static variable

    Student(int r,String name){
        count++;
        rollNo = r;
        this.name = name;
    }

    public void show(){
        System.out.println("Object is created "+ count +" Times..!");
        System.out.println("Name : "+ name + " roll no : "+ rollNo +" from college :- "+ collegeName);
    }
}