public class subset{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        n = arr.length;
        //totalsubsets = 0--> 7
        int totalsubsets = (int)Math.pow(2,n);
        //number initialized from 0 to calculate the binary number.
        int st = 0;
        //calculate binary of st.
        while(st<totalsubsets){
            // System.out.print(st+" -> ");
            //store the number in a temp variable.
            int temp = st;

            //binary number
            int k = 0;
            String ans = "";
            //we want to give every element a choice

            //we initialized idx as last because when we find remainder, it is from the last.
            int idx = arr.length-1;
            while(k<n){
                //k controls the length of binary number (011)
                int rem = temp%2;
                temp/=2;
                //string is created to reverse the binary number.
                // so, as to prevent it from storing in a space.
                if(rem==0){
                    ans="_ "+ans;
                } else{
                    ans=arr[idx]+" "+ans;
                }
                // ans =rem+ ans;
                k++;
                idx--;
            }
            st++;
        }
    }
}


// for ( int i=0;i<Math.pow(2,n);i++ ) {
//     int maxNumberOfElements = (int) Math.pow(2,n);
//     for ( int j=0;j<n;j++ ) {
//     numberOfTimesRepition = maxNumberOfElements / 2;
//     if ( ( i/numberOfTimesRepition ) % 2 == 0) 
//     System.out.print("-\t");
//     else
//     System.out.print(arr[j]+"\t");
//     }
//     System.out.println();
//     } 