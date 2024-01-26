package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate {
    
    private String candidateID;
    private String firstname;
    private String lastname;
    private Date dob;
    private String email;
    private String address;
    private long phone;
    private String type;

    public Candidate(String candidateID, String firstname, String lastname, Date dob, String address, long phone,String email,String type) {
        this.candidateID = candidateID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.type = type;
    }
    


    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }   
 @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return firstname+" "+lastname+" | "+dateFormat.format(dob)+" | "+address+" | 0"+phone+" | "+email+" | "+type ;
    }

}
