public class StudentView
{
    public void displayStudentDetails(Student student)
    {
        System.out.println("Name: " + student.getName());
        System.out.println("Id: " + student.getId());
        System.out.println("Grade: " + student.getGrade());
    }
}