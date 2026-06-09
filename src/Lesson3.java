public class Lesson3 {
    public static void main(String[] args){
        int[] scores = {100,200,200,400,500,600,700,800,900};
        for (int score : scores)
            if (score>= 500)
            {
             System.out.println (score+ "--> Approved");
            }
        else
            {
                System.out.println (score+ "--> Rejected");
            }

    }
}
