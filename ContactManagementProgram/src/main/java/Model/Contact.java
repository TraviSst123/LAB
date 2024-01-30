package Model;

public class Contact {
    private int id;
    private String fullname;
    private String group;
    private String address;
    private String phone;

    public Contact(int id, String fullname, String group, String address, String phone) {
        this.id = id;
        this.fullname = fullname;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getGroup() {
        return group;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
}