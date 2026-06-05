public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Test case 1:");
        KidUser kidUser = new KidUser();
        
        kidUser.age = 10;
        kidUser.registerAccount();
        
        kidUser.age = 18;
        kidUser.registerAccount();
        
        kidUser.bookType = "Kids";
        kidUser.requestBook();
        
        kidUser.bookType = "Fiction";
        kidUser.requestBook();
        
        System.out.println("\nTest case 2:");
        AdultUser adultUser = new AdultUser();
        
        adultUser.age = 5;
        adultUser.registerAccount();
        
        adultUser.age = 23;
        adultUser.registerAccount();
        
        adultUser.bookType = "Kids";
        adultUser.requestBook();
        
        adultUser.bookType = "Fiction";
        adultUser.requestBook();
    }
}
