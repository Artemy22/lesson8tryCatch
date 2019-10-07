public class lesson8 {
    public static void main(String[] args) {
        try {
            throw new Exception ();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
