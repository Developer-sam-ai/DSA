public class Smallest_Integer_Divisible_byK {
    // public static void main(String[] args) {
    //     int k=4;
    //     int min=1;
    //     String newer="";
    //     // ^  integer divisible by k 
    //     for(int i=0;i<=k;i++){
    //         newer+=1;
    //     }
    //     // System.out.println(newer);

    //     int ner=Integer.parseInt(newer);
    //     if(ner%ner.length){

    //     }
    //     for(int i=1;i<=k;i++){
    //         if(k%i==0){
    //             System.out.println(i);
    //         }
    //         if(min>i){
    //             min=i;
    //         }
    //     }
    //     System.out.println(min);
    // }
    
    //~ lets try to reconstruct things and make like things easy like we ddint need to make a 
    //~ string and then remake it as a int and then check we just need to save the rem 

    public static void main(String[] args) {
        int k=3;
        int rem=0;
        for(int i=0;i<=k;i++){
        rem=(rem*10+1)%k;
        // if(rem==0) System.out.println(i);
        }
        if(k%2==0 || k%5==0) System.out.println("-1");
        System.out.println("-1");
    }
}
