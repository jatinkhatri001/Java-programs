class Person {
    int userId = 123;
    String fullName = "Jane Doe";
    String contactEmail = "janedoe123@gmail.com";
}

public class ObjectCreation {
    public static void main(String args[]) {
        // Create Object using new Keyword
        Person personObj = new Person();
        System.out.println(personObj.userId);
        System.out.println(personObj.fullName);
        System.out.println(personObj.contactEmail);

        // Create Object using newInstance() Method
        try {
            Person anotherPerson = (Person) Class.forName("Person").getDeclaredConstructor().newInstance();
            System.out.println(anotherPerson.fullName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
