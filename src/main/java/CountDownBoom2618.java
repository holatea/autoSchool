public class CountDownBoom2618 {
    public static void main(String[] args) {

        for (int i = 30; i >= 0; i--) {
            if (i != 0) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            else {
                System.out.println(i);
                System.out.println("Boom!");
            }
        }
    }
}
