import java.util.Scanner;

public class UserPWTester{
    public static void main(String[] args)
    {
        User fred = new User(1, "JW123");

        System.out.printf("hashed password: %s%n",fred.getHashedPW());

        Scanner keyboard = new Scanner(System.in);
        String pw=null;
        String hashedPW = null;
        do {
            System.out.print("Enter your password: ");
            pw=keyboard.nextLine();

            hashedPW=PasswordGenerator.getPassword(pw,fred.getSalt());

        } while (!hashedPW.equals(fred.getHashedPW()));

    }
}
