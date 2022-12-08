import java.util.HashSet;

public class Union_and_intersection_of_array {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};


        // for union
        HashSet<Integer> union = new HashSet<>();
        for (int k : arr1) {
            union.add(k);
        }
        for (int j : arr2) {
            union.add(j);
        }
        System.out.println("Union of arr1 and arr2 is: " + union);

        // for intersection
        HashSet<Integer> intersection = new HashSet<>();
        for(int i : arr1) {
            intersection.add(i);
        }
        System.out.print("Intersection of arr1 and  arr2 is : ");
        for(int j : arr2) {
            if(intersection.contains(j))  {
                System.out.print(j + " ");
                intersection.remove(j);
            }
        }
    }
}
