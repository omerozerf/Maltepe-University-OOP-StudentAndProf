public class Prof
{
    private int age;
    private String department;

    public Prof(int age, String department)
    {
        this.age = age;
        this.department = department;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public void Teaches(){



        System.out.println("Deparmant = " + getDepartment());
        System.out.println("Age = " + getAge());
    }
}
