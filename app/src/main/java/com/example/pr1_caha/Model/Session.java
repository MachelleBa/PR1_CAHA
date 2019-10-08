

public class Session {
    private  User user;

    public Session(User user) {
        this.user = user;
    }



    public User getUserID(int user){
        return user;
    }

    public void setUserID(User user) {
        this.user = user;
    }
}

