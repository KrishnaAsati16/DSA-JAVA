//There is a robot on an m*n grid.hThe robot is initially located at the top left corner the robot tried to move to the bottom right corner the robot can either down or right at any point in time
// UNIQUE PATHS

public class Question4 {
    public int paths(int cr, int cc, int lr,int lc){
        if(cr==lr && cc==lc) return 1;
        if(cr>lr &&cc>lc) return 0; // important
        int right = paths(cr,cc+1,lr,lc);
        int down =  paths(cr+1,cc,lr,lc);
        return right +down;
    }
    public int uniquepaths(int m , int n) {
         return  paths(0,0,m-1,n-1);
    }

    static void main(String[] args) {
        int n = 5;
        System.out.println();
    }


}
