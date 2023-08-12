public class Main {
    public static void main(String[] args) {
        int []a={1, 3, 0, 3, 5, 0};
        System.out.println(railroadTie(a));
    }
   static int railroadTie (int []a){
     if (a.length<2||a[0]==0||a==null)return 0;
 else {
     int zeroIndex=2;
         for (int i = 1; i <a.length ; i++) {
             if (zeroIndex!=i && a[i]==0){
                 return 0;
                        }
             else if (i==zeroIndex) {
                 if (a[i-1]==0 ||a[i+1]==0){
                     return 0;
                 }

             }
          zeroIndex+=3;
         }
         return 1;
     }

   }
}