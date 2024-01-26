package Model;

import java.util.Date;

public class Experience extends Candidate {
    
    private int ExpInYear;
    private String ProSkill;

    public Experience(int ExpInYear, String ProSkill, String firstname, String lastname, Date dob, String address, long phone,String email, String type, String candidateID) {
        super(candidateID, firstname, lastname, dob, address, phone,email,type);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }
    
    

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
    
    
       
}
