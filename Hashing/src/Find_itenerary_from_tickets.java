import java.util.HashMap;

public class Find_itenerary_from_tickets {
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String getstart = getStart(tickets);
        System.out.print(getstart);

        for(int i =0;i<tickets.size();i++) {
            System.out.print("->"+tickets.get(getstart)+" ");
            getstart = tickets.get(getstart);
        }


    }

    private static String getStart(HashMap<String, String> tickets) {
        HashMap<String,String> revticket = new HashMap<>();
        for(String key : tickets.keySet()) {
            revticket.put(tickets.get(key),key);
        }
        for(String key : tickets.keySet()) {
            if(!revticket.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
}
