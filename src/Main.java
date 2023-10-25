public class Main
{
    public static void main(String[] args)
    {
        Prof omerProf = new Prof(25, "SE");
        Prof cerenProf = new Prof(45, "ASD");

        Student student1 = new Student(456845463, "Numan");
        Student student2 = new Student(684684, "Ceren");
        Student qdıohuqhu = new Student(879685485, "daıjwq");

        omerProf.Teaches();
        cerenProf.Teaches();

        student2.Learns();
        qdıohuqhu.Learns();
    }
}