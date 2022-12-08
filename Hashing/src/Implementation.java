import java.util.LinkedList;

public class Implementation {
    public static class HashMap<K,V> {  // generic type (when data type is not defined)

        private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    private int n;       // size of ll
    private int N;
    private LinkedList<Node>[] bucket;

     @SuppressWarnings("unchecked")
    public HashMap() {
        this.N = 4;
        this.bucket = new LinkedList[4];
        for(int i = 0; i<4;i++) {
            bucket[i] = new LinkedList<>();
        }
    }
    private int hashFunction(K key) {
        int hc = key.hashCode();
        return Math.abs(hc)%N;
    }
    private int searchInLL(K key, int bi) {
        LinkedList<Node> ll = bucket[bi];
        int di = 0;
        for(int i = 0;i<ll.size();i++) {
            if(key==ll.get(i).key) {
                return di;
            }
            di++;
        }
        return -1;

     }
     private void rehash() {
        LinkedList<Node>[] oldBucket = bucket;
        bucket = new LinkedList[2*N];
        N = 2*N;
        for(int i = 0;i<bucket.length;i++) {
            bucket[i] = new LinkedList<>();
        }
        // node -> old bucket to bucket
        for(int i = 0;i<oldBucket.length;i++) {
            LinkedList<Node> ll = oldBucket[i];
            for(int j = 0;j<ll.size();j++) {
                Node node = ll.remove();
                put(node.key, node.value);
            }
        }

     }

    public void put(K key, V value) {
        int bi = hashFunction(key); 
        int di = searchInLL(key,bi);    // return -1 (if not present) or 0 to size()-1 (if present)
        if(di!=-1) {
            Node node = bucket[bi].get(di);
            node.value = value;
        }
        else {
            bucket[bi].add(new Node(key, value));
            n++;
        }

        double lamda = (double)n/N;
        if(lamda>2.0) {
            rehash();
        }


    }

    public boolean containsKey(K key) {
        int bi = hashFunction(key); 
        int di = searchInLL(key,bi);
        if(di==-1) return false;
        return true;
    }

    public V get(K key) {
        int bi = hashFunction(key); 
        int di = searchInLL(key,bi);
        if(di==-1) {
            return null;
        }
        else {
            return bucket[bi].get(di).value;
        }
        
        

    }

    public void print() {
         for(int i = 0;i< bucket.length;i++) {
             LinkedList<Node> ll = bucket[i];
             for(int j = 0;j<ll.size();j++) {
                 System.out.println("Key: "+ll.get(j).key+","+" value: "+ll.get(j).value);
             }
         }
    }
    public K remove(K key) {
        int bi = hashFunction(key);
        int di = searchInLL(key,bi);
        if(di==-1) {
            return null;
        }
        else {
            return bucket[bi].remove(di).key;
        }
    }

    public boolean isEmpty() {
         return n==0;
    }

    
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Shashi", 20);
        hm.put("Tarun",27);
        hm.put("virat", 32);
        hm.put("Pillu", 5);
        System.out.println(hm.containsKey("Shashi"));
        System.out.println(hm.get("virat"));
        hm.print();
        System.out.println("Deleted element is: "+ hm.remove( "Pillu"));
        hm.print();
        System.out.println(hm.isEmpty());
        }
}
