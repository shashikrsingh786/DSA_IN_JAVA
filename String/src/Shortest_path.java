public class Shortest_path {
    public static void main(String[] args) {
        String path = "EEEEN";
        System.out.println(shortestPath(path));
    }
    static float shortestPath(String  path) {
        int x=0,y=0;
        float minDis;
        for(int i =0;i<path.length();i++) {
            switch (path.charAt(i)) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'W' -> x--;
                case 'E' -> x++;
            }
        }
        minDis = (float) Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)));
        return minDis;
    }

}
