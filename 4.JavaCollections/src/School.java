public class School {
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,5};
        System.out.println(getAverage(arr));
    }
    public static int getAverage(int[] marks) {
        int sum = 0;
        for (int i : marks) sum += i;
        return sum / marks.length;
    }
}