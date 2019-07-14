public class ProcessDemo1 {
    public static void main(String[] args) {
        while (true)
        {
            int a = (int) (Math.random()*100);
            System.out.println("main thread is runing "+a);
            try {
                Thread.sleep(5000);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
