class Teacher extends Person{
    String mainSubject;
    String salary;
    String type; // What type of a teacher he/she is
 
    Teacher(String fName, String lName, String sub, String slry, String sType){
        super(fName,lName);
        mainSubject = sub;
        salary = slry;
        type = sType;         
    }
    void Display(){
        super.Display();

        System.out.println("Main Subject : " + mainSubject);
        System.out.println("Salary : " + salary);
        System.out.println("Type : " + type);
    }
}