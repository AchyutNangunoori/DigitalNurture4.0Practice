public class Student
{
    String name;
    int id;
    float grade;
    
    public Student(String name, int id, float grade)
    {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public float getGrade()
    {
        return this.grade;
    }
}