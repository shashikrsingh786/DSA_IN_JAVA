public class First_occurence_element_in_Array {
    public static void main(String[] args) {
        int[] n = {2,4,2,4,5,7,2,6,7};
        int key = 7;
        System.out.println(firstOcurence(n,0,key));
    }
    public static int firstOcurence(int[] n,int i,int key) {
        if(i==n.length)   return -1;                      //process
        if(n[i]==key) return i;                          //algorithm
        return firstOcurence(n,i+1,key);              //calling inner function
    }
}
