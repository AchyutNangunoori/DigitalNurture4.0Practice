public class Test
{
    public static void main(String[] args)
    {
        Student student = new Student("S1",62,8.0f);
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(student, studentView);
        
        System.out.println("Check Student Details using Student Controller");
        studentController.checkStudent();
        
        System.out.println("\nChange Student Data using Student Controller");
        studentController.setName("S2");
        studentController.setId(54);
        studentController.setGrade(8.50f);
        
        System.out.println("\nCheck Student Details using Student Controller");
        studentController.checkStudent();
    }
}