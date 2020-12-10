package technoStudy.proje10.User;




public abstract class User {


    private String name;
    private String lastname;
    private  int userID;

    public User(String name, String lastname, int userID) {
        this.name = name;
        this.lastname = lastname;
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "\n" + "User Name: " + name
                + "\n"+ "User lastname: " + lastname
                 + "\n"+ "User ID=" + userID;
    }
}