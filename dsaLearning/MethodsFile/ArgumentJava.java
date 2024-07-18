package dsaLearning.MethodsFile;

public class ArgumentJava {
    public static void UsersDetails(String name, String dob, long acc) {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Account: " + acc);
    }
    
    public static void main(String[] args) {
        UsersDetails("Abhishek Manjhi", "12/15/2021", 154875464L);
        UsersDetails("Prerana Kadam", "22/05/2002", 15487546464L);
    }
}
