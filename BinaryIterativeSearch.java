public class BinaryIterativeSearch implements Practice2Search {

    public String searchName(){
        return "Binary iterative search";
    }
    public int search(int [] arr, int target){
        int lower = 0;
        int upper = arr.length-1;
        int mid = (upper + lower)/2;
        while(lower<upper){
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                lower = mid+1;
                mid = (upper + lower)/2;
            }else if(arr[mid]>target){
                upper = mid-1;
                mid = (upper + lower)/2;
            }
        }
        return -1;
    }
}
