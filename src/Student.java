public class Student
{
    private int id;
    private String name;

    public Student(int idStudent, String nameStudent){
        this.id = idStudent;
        this.name = nameStudent;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void Learns(){

        System.out.println("Name :" + getName() + "ID : " + id);
    }
}
