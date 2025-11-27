public class LinearSearch {
    static void main(String[] args) {
        int [] arr = {12,3,27,53,18,62,88,6,53};
        int target = -1;
        int found = -789; // -789 means targets array  me nhi hain
        for(int i =0; i<arr.length;i++){
            if(arr[i]==target){
                found = i; // any no. except -1 means targets array me h
                break;

            }
        }
        if (found!= -789) System.out.println("target exists in array at index" +found);
        else
            System.out.println("target missing in array");

    }
}
