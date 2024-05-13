package narendra.java.designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        //  Student student = new Student("Narendra", "2024", 80.79,28, 2024, "+91 9505515956");
        Student student = Student.getBuilder()
                .setName("Narendra")
                .setBatch("2024")
                .setPsp(80.79)
                .setAge(28)
                .setGradeYear(2024)
                .setPhone("+91 9505515956")
                .build();
        // Student student = builder.build();
        System.out.println("Debug");
    }
}
