
package learnaccessmodifier.student;


public class Student {
    
    private String name;
    private String email;
    private int id;

    public Student() {
    }

    public Student(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        
        if(name.length()>=6  && name.length() <=20){
            this.name = name;
        }
        else{
            System.out.println("Name must be between 6 to 20 char.");
        }   
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public  void printStudentDetails(){
    
        System.out.println("Name : "+name +"\n"
        +"Email : "+email+"\n"
        +"ID :"+ id);
    
    }
    
    
    
    
    
    
}
