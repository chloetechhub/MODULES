package usermanagement;

public class User {
    String Name;
    int ID;

    public User(String name, int ID) {
        Name = name;
        this.ID = ID;
    }

    public void DisplayUserInfo(){
        System.out.println("Name " + Name);
        System.out.println("ID " + ID);
    }

    public String getName() {
        return Name;
    }

    public int getID() {
        return ID;
    }
}
