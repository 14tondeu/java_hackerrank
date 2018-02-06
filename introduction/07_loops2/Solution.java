import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String res="";
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            
            int sauv=a;
            int puiss2=1;
            for (int j=0;j<n;j++){
                sauv = sauv+b*puiss2;
                puiss2=puiss2*2;
                res = res + sauv + " ";
            }
            res= res + "\n";
        }
        System.out.printf(res);
        in.close();
    }
}

