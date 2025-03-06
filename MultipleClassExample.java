class Learner {
    int learnerId;
    String learnerName;
    String learnerEmail;

    Learner(int learnerId, String learnerName, String learnerEmail) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.learnerEmail = learnerEmail;
    }

    void getLearnerDetail() {
        System.out.println("Learner Details: ");
        System.out.println("ID: " + learnerId + " Name: " + learnerName + " E-Mail ID: " + learnerEmail);
    }
}

class Instructor {
    int instructorId;
    String instructorName;
    String instructorEmail;
    String specialization;

    Instructor(int instructorId, String instructorName, String instructorEmail, String specialization) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorEmail = instructorEmail;
        this.specialization = specialization;
    }

    void getInstructorDetail() {
        System.out.println("Instructor Details: ");
        System.out.println("ID: " + instructorId + " Name: " + instructorName + " E-Mail ID: " + instructorEmail + " Specialization: " + specialization);
    }
}

public class MultipleClassExample {
    public static void main(String args[]) {
        Learner[] learner = {
            new Learner(1, "Alice Walker", "alicewalker@gmail.com")
        };
        
        Instructor[] instructor = {
            new Instructor(1, "Dr. David Brown", "davidbrown@edu.com", "Computer Science")
        };
        
        for(Learner l : learner) l.getLearnerDetail();
        for(Instructor i : instructor) i.getInstructorDetail();
    }
}
