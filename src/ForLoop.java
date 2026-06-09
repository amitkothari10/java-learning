public class ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loop Lesson");

        int i;
        int j;
        int p;

        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 30; j++) {
                p = i * j;
//                System.out.print(p + "\t" );
                System.out.printf("%5d", p );
            }
            System.out.println();
        }
    }
}
