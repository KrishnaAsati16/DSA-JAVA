import java.util.Arrays;

    class Student implements Comparable<Student>{
        String name;
        int rno;
        double cgpa;
        Student(String name, int rno, double cgpa){
            this.name = name;
            this.rno = rno;
            this.cgpa = cgpa;
        }

        public int compareTo(Student s){
            if(this.cgpa == s.cgpa)
                return this.rno - s.rno;
            return Double.compare(this.cgpa,s.cgpa);
        }
    }
    public class CustomComparators {
        public static void main(String[] args) {
            Student s1 = new Student("Go",200,8.3);
            Student s2 = new Student("Sha",49,8.9);
            Student s3 = new Student("An",90,8.5);
            Student s4 = new Student("Is",8,8.3);
            Student s5 = new Student("Ad",31,9.7);
            Student[] arr = {s1,s2,s3,s4,s5};
            Arrays.sort(arr);
            for(Student s : arr){
                System.out.println(s.name+" "+s.rno+" "+s.cgpa);
            }
        }
    }

