package studentlist;

public class StudentList {
    //hello this is commit
    public static void main(String[] args) {
        Student s1 = new Student("Taymour", "s1");

        Student[] studentList = new Student[3];
        studentList[0] =s1;
        studentList[1] = new Student("Hadi", "s2");
        studentList[2] = new Student("Stephanie", "s3");

        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getSname());
            System.out.println(studentList[i].getsID());
        }
    }
}
   

