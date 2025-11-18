public class O3_longest_odd_number {
    public static void main(String[] args) {
        String nums="35427";
        String odd="";
        boolean found=false;
        //~ we are going from right and finding 
        for(int i=nums.length()-1;i>=0;i--){

            if(nums.charAt(i)%2!=0){
                // add all to odd
                found=true;
                
            }
            if(found){
                
                odd=nums.substring(0,i+1);
            break;}
            
        }
        System.out.print(odd);

    }
}
