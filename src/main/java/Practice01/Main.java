package Practice01;

public class Main {
    public static void main(String[] args) {
        try {
            Practice01 test01 = new Practice01("Guande Pang", "Guande2001!@#");
            Validator.validate(test01);
            System.out.println("test01 is valid");

            Practice01 test02 = new Practice01("invalidusernameivalidusername", "invalidpassword");
            Validator.validate(test02);
            System.out.println("test02 is valid");
        } catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
