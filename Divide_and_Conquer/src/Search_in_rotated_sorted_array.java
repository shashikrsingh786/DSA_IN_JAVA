public class Search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] n = {4,5,6,7,0,1,2};
        int key = 6;
        System.out.println(search(n,0,n.length-1,key));
    }

    private static int search(int[] n,int si, int ei, int key) {
        if(si>ei) return -1;                    //BASE CASE (ELEMENT DO NOT EXIST)
        int mid = si+(ei-si)/2;
        if(key==n[mid]) return mid;                   //CASE FOUND

         if(n[si]<=n[mid]) {                          //LIE ON L1
             //CASE A:
             if(n[si]<=key && key<=n[mid]) {
              return   search(n,si,mid-1,key);
             }
             //CASE B:
            else {
               return search(n,mid+1,ei,key);
             }
         }
        else   {                                       //LIE ON L2
            //CASE C:
            if(n[mid]<=key && key<=n[ei]) {
              return  search(n,mid+1,ei,key);
            }
            //CASE D:
             else {
               return  search(n,si,mid-1,key);
            }
         }
    }

}
