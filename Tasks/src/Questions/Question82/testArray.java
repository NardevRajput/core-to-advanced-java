package Questions.Question82;

public class testArray {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,2,3,4,5});
        ArrayOperations.Statistics statistics = opr.new Statistics();
        System.out.println(statistics.mean());
    }
}
