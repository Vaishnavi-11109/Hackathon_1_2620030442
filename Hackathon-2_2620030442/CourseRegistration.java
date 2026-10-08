import java.util.*;
class Student{
    String studentName;
    String rollNumber;
    double marks;
    String courseName;
    int courseCredits;
    Student(String studentName,String rollNumber,double marks,String courseName,int courseCredits){
        this.studentName=studentName;
        this.rollNumber=rollNumber;
        this.marks=marks;
        this.courseName=courseName;
        this.courseCredits=courseCredits;
    }
    double calculateFee(){
        return 1500*courseCredits;
    }
    Boolean checkEligibility(){
        return marks>=50;
    }
    double calculateScholarship(){
        if (marks>=85) {
            return calculateFee()*0.20;
            }else if(marks>=70){
                return calculateFee()*0.10;
            }else{
                return 0;
            } 
    }        
    double calculateFinalFee(){
        return calculateFee()-calculateScholarship() ;
    }        
    void displayDetails(){
        System.out.println("Student Course Registration System");
        System.out.println("Student Name:"+ studentName);
        System.out.println("Student Roll Number:"+ rollNumber);
        System.out.println("Marks:"+marks);
        System.out.println("Course Name:"+courseName);
        System.out.println("Course Credits:"+ courseCredits);
        System.out.println("Eligibility: Eligible");
        System.out.println("Total Fee: Rs. " + calculateFee());
        System.out.println("Scholarship: Rs. " + calculateScholarship());
        System.out.println("Final Fee: Rs. " + calculateFinalFee());
    }
}    
    public class CourseRegistration{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name");
            String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
            String roll = sc.nextLine();
        System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();
        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();
        Student s = new Student(name,roll, marks, course, credits);
        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("Student is not eligible for course registration.");
        }
        sc.close();
        }
    }
