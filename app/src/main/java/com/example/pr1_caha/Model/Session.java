

public class Session {
    private  User user;

    public Session(User user) {
        this.user = user;
    }


    //TODO Generate a user ID
    public User getUserID(){
        return user;
    }

    public void setUserID(User user) {
        this.user = user;
    }
}

