import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class PasswordGenerator {

    /**
     * This returns an array with 16 bytes with random #'s in it
     */
    public static byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom sr = new SecureRandom().getInstanceStrong();

        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }

    /**
     * This method accepts a String for a password and a byte[] as a salt
     * and returns a hashed password
     */
    public static String getPassword(String pwToHash, byte[] salt)
    {
        StringBuilder sb = new StringBuilder();
        try
        {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt);

            byte[] pwAsBytes = md.digest(pwToHash.getBytes());

            //This will convert the byte array into a String

            for (int i=0; i<pwAsBytes.length; i++)
            {
                sb.append(Integer.toString(
                        (pwAsBytes[i] & 0xff)+0x100, 16).substring(1));
            }
        }
        catch (NoSuchAlgorithmException e)
        {
            System.err.println(e);
        }
        return sb.toString();
    }
}
