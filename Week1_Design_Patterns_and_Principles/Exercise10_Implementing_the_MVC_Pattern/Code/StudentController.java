public class StudentController
{
    Student student;
    StudentView studentView;
    
    public StudentController(Student student, StudentView studentView)
    {
        this.student = student;
        this.studentView = studentView;
    }
    
    public void setName(String name)
    {
        student.name = name;
    }
    
    public void setId(int id)
    {
        student.id = id;
    }
    
    public void setGrade(float grade)
    {
        student.grade = grade;
    }
    
    public void checkStudent()
    {
        studentView.displayStudentDetails(student);
    }
}