public class Person {
    String fullName;
    int age;

    public Person(String fullName,int age){
        this.fullName=fullName;
        this.age=age;
    }
    public Person(){

    }
    public void printInfo(){
        System.out.println("fullName: "+fullName);
        System.out.println("age: "+age);
    }


}
