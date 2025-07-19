public class Main {
    public static void main(String[] args) {

        Person person=new Person();
        person.fullName="Amin Agayev";
        person.age=20;
        person.printInfo();


        Member member=new Member();
        member.fullName="Amin Agayev";
        member.age=20;
        member.memberId="1";
        member.borrowBook("riyaziyyat");


        Book book=new Book();
        book.title="Clean Code";
        book.author="Robert C. Martin";
        book.isbn=9780132350884l;
        book.printBookDetails();

        Library library=new Library();
        Library.printWelcomeMessage();
        Library.printLibraryRules();




    }
}
