package ContactManagement;

public class Contact {
    private String name;
    private String phNo;
    private String email;

    public Contact(String name, String phNo, String email){
        this.name = name;
        this.phNo = phNo;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public String getPhNo() {
        return phNo;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Phone: " + phNo + ", Email: " + email;
    }
}
