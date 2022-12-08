public class Cost_with_gst {
    public static void main(String[] args) {
        float pen = 10;
        float pencil = 5;
        float eraser = 3;
        float sum = pen+pencil+eraser;
        System.out.println("Your bill with (18%)GST: " +(sum+((0.18f)*sum)));
    }
}
