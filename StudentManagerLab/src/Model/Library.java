
package Model;


public class Library {
    
    private String name;
    private String course;
    private String id;
    private String semester;

    public Library(String name, String course, String id, String semester) {
        this.name = name;
        this.course = course;
        this.id = id;
        this.semester = semester;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
    
}
