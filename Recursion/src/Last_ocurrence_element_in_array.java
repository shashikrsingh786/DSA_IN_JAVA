public class Last_ocurrence_element_in_array {
    public static void main(String[] args) {
        int[] n = {5,5,5,5};
        int key = 5;
        System.out.println(lastOccurence(n,n.length-1,key));
    }
    public static int lastOccurence(int[] n,int i, int key) {
        if(i==0)   return -1;                      //process
        if(n[i]==key) return i;                          //algorithm
        return lastOccurence(n,i-1,key);              //calling inner function

    }
}
