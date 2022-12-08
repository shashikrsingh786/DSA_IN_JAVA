import java.util.Stack;
class Simplify_path {
    public static void main(String []args){
        String str = "/a/./b/../../c/";
        String res = simplify(str);
        System.out.println(res);
    }
    static String simplify(String A){
        Stack<String> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        res.append("/");
        int len_A = A.length();
        for (int i = 0; i < len_A; i++){
            StringBuilder dir = new StringBuilder();
            while (i < len_A && A.charAt(i) == '/')
                i++;
            while (i < len_A && A.charAt(i) != '/'){
                dir.append(A.charAt(i));
                i++;
            }
            if (dir.toString().equals("..")){
                if (!st.empty())
                    st.pop();
            }
            else if (dir.toString().equals(".")) {
                continue;
            }
            else if (dir.length() != 0)
                st.push(dir.toString());
        }
        Stack<String> st1 = new Stack<>();
        while (!st.empty()){
            st1.push(st.pop());
        }
        while (!st1.empty()){
            if (st1.size() != 1) {
                res.append(st1.pop()).append("/");
            }
            else  res.append(st1.pop());
        }
        return res.toString();
    }
}
