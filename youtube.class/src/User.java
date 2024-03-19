public class User {

    public User(int id, String userName, String firstName, String surName) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.surName = surName;
    }

    public User(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public User(int id, String userName, String firstName, String surName, String email, String password, int age, String profileImg) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.password = password;
        this.age = age;
        this.profileImg = profileImg;
    }
    public User(){

    }

    private int id;
    private String userName;
    private String firstName;
    private String surName;
    private String email;
    private String password;
    private int age;
    private String profileImg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }
}
