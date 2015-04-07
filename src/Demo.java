public class Demo{
    public static void main(String args[]){
        Person pObj = new Person("Aleksander", "Dmitrijev");
        Student sObj = new Student("Marten", "Rebane", 1, "Jaagup Kippar");
        Teacher tObj = new Teacher("Jaagup", "Kippar", "Programming", "3000 euros", "Primary Teacher");
        System.out.println("Person :");
        pObj.Display();
        System.out.println("");
        System.out.println("Student :");
        sObj.Display();
        System.out.println("");
        System.out.println("Teacher :");
        tObj.Display();
    }
}