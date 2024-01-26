package Model;

import java.util.Date;

public class Fresher extends Candidate {
    
    private Date Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher(Date Graduation_date, String Graduation_rank, String Education, String firstname, String lastname, Date dob, String address, long phone,String email, String type, String candidateID) {
        super(candidateID, firstname, lastname, dob, address, phone,email, type );
        this.Graduation_date = Graduation_date;
        this.Graduation_rank = Graduation_rank;
        this.Education = Education;
    }

    public Date getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(Date Graduation_date) {
        this.Graduation_date = Graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String Graduation_rank) {
        this.Graduation_rank = Graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }
    
    
}
