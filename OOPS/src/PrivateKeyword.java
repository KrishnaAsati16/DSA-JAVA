public class PrivateKeyword { // private-> private chij ko print nhi kar va sakte or sath me changes bhi nhi kara sakte
    public static class students{
        String name; // null
         private int rno; //0
        double cgpa; // 0.0
    }

    static void main(String[] args) {
        students s = new students();
        //System.out.println(s.rno);
        s.cgpa = 8.1;
        s.name = "lion";
        //s.rno = 74;

    }
}
