import java.util.Arrays;

public class O2_reverse_words {
//     public static void main(String[] args) {
//         String s="    the sky is blue  ";
//         String here=s.trim();
//         String []stri=new String[10];
//         String save=" ";
//         int p=0;
//         for(int i=0;i<=here.length()-1;i++){
//             if(here.charAt(i)!=' '){
//                 save=save+here.charAt(i);
//             }
//             else{
//                 stri[p]=save;
//                 p++;
//                 save=" ";
//             }
//             stri[p]=save;
//         }
//         System.out.println(Arrays.toString(stri));

//         String finale="";
//         String sachhi="";
//         for (int i=stri.length-1;i>=0;i--){
//             if(stri[i]!=null){
//             finale=finale+stri[i];
//             sachhi=finale.trim();
//             }
//         }
//         System.out.println(sachhi);
//     }

//! even it is the hardest or slowest its my try and it works  bro 


public static void main(String[] args) {
    String s1=" i am the best  ";
    String hell[]=s1.trim().split(" ");
    String finale="";
    System.out.println(Arrays.toString(hell));
    for(int i=hell.length-1;i>=0;i--){
        finale=finale+hell[i]+" ";
    }
    System.out.println(finale+" ");
}

}



