public class O2_Count_odd_numbers_in_an_interval {
    public static void main(String[] args) {
        long low=3;
        int count=0;
        long high=7;
        long counts_odd_high=(high+1)/2;
        long counts_odd_low=(low+1)/2;
        System.out.println(counts_odd_high-counts_odd_low);
    }
}
