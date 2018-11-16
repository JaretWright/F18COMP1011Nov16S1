import java.security.NoSuchAlgorithmException;

public class PWTester {
    public static void main(String[] args)
    {
        try {
            for(int i=1; i<=5; i++)
            {
                byte[] salt = PasswordGenerator.getSalt();
                System.out.printf("The password 'happy' hashes to: %s%n",
                        PasswordGenerator.getPassword("happy",salt));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
}
