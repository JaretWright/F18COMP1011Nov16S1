import java.security.NoSuchAlgorithmException;

public class User {
    private int userID;
    private String hashedPW;
    private byte[] salt;

    public User(int userID, String password) {
        setUserID(userID);
        setHashedPW(password);
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getHashedPW() {
        return hashedPW;
    }

    public void setHashedPW(String password) {
        try {
            salt = PasswordGenerator.getSalt();
            hashedPW = PasswordGenerator.getPassword(password, salt);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public byte[] getSalt() {
        return salt;
    }
}
