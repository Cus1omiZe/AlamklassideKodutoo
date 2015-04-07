class Student extends Person{
    int id;
    String teacher;
 
    Student(String fName, String lName, int nId, String techr){
        super(fName,lName);
        id = nId;
        teacher = techr;         
    }
    void Display(){
        super.Display();

        System.out.println("ID : " + id);
        System.out.println("Teacher: " + teacher);
    }
}