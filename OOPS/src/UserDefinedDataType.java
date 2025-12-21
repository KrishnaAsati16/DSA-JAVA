
public class UserDefinedDataType {
    public static class student{      //class-> particular classification or blueprint
        String name;
        int rno;
        double cgpa;
    }

    static void main(String[] args) {    //s1,s2 object-> are real life entity
      student s1 = new student(); // declaration
        s1.name = "bkl";
        s1.rno=23;
        s1.cgpa = 8.1;

        student s2 = new student(); // declaration
        s2.name = "elvishbhai";
        s2.rno=28;
        s2.cgpa = 9.1;

        System.out.println(s2.name+" "+s2.cgpa+" "+s2.rno);
    }
}

// scanner is also a class
