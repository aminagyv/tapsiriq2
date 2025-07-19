public class Member extends Person{
    String memberId;

    public Member(){

    }

    public Member(String fullname,int age,String memberId){
        super(fullname,age);
        this.memberId=memberId;
    }
    public void borrowBook(String bookTitle){
        System.out.println("Member "+fullName+" borrowed "+bookTitle);
    }

}
