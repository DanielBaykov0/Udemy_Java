package finalstatement;

public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storedPassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
