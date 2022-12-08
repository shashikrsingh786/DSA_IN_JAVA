import java.util.PriorityQueue;

public class Weakest_soldier {
    public static void main(String[] args) {
        PriorityQueue<Soldier> pq = new PriorityQueue<>();
        int[][] arr  = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;
        for(int i = 0;i< arr.length;i++) {
            int number=0;
            for(int j = 0;j<arr[0].length;j++) {            // calculate number of soldier
                if(arr[i][j]==1) number++;
            }
            pq.add(new Soldier(number,i));
        }

        for(int i = 0;i<k;i++) {
            System.out.println("R"+pq.remove().index);
        }


    }
    static  class Soldier implements Comparable<Soldier> {
        int number;
        int index;

        Soldier(int number,int index) {
            this.number = number;
            this.index = index;
        }


        @Override
        public int compareTo(Soldier o) {
            if(this.number == o.number) {
                return this.index-o.index;
            }
            else  return  this.number-o.number;

        }
    }
}
