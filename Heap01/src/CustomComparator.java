import java.util.Arrays;

class student implements Comparable<student>{
    String name ;
    int rno;
    double cgpa;
    student(String name, int rno, double cgpa){
        this.name = name;
        this.rno = rno;
        this.cgpa = cgpa;
    }
    public int compareTo(student s){
        return this.rno -s.rno;
    }
}

public class CustomComparator {
    static void main(String[] args) {
        student s1 = new student("krishna",174,8);
        student s2 = new student("fahhhh",05,12);
        student s3 = new student("gheeee",22,9);
        student s4 = new student("ghar",56,7);
        student s5 = new student("mohit",12,5);
        student[] arr = {s1,s2,s3,s4,s5};
        Arrays.sort(arr);
        for(student s : arr){
            System.out.print(s.name+ " ");
        }
    }
}
