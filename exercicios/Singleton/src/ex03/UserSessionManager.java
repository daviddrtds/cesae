package ex03;

import java.time.LocalDateTime;
import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private int sessionToken;
    private String lastAccess;

    Random random = new Random();
    LocalDateTime currentDateTime = LocalDateTime.now();

    private UserSessionManager() {
        this.sessionToken = random.nextInt();
        this.lastAccess = String.valueOf(currentDateTime);
    }

    public static UserSessionManager getInstance(){
        if(instance == null){
            instance = new UserSessionManager();
        }
        return instance;
    }


    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public void updateLastAccess(){
        this.lastAccess = String.valueOf(LocalDateTime.now());
    }

}
