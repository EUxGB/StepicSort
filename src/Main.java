import java.util.*;

public class Main {

    public static int[] sort(int[] a1, int[] a2) {
        int L3 = a1.length + a2.length;
        int L1 = a1.length;
        int L2 = a2.length;
        int[] a3 = new int[L3];
        int j = 0;
        int i = 0;
        int m = 0;



            for (int k = 0; i < L3; k++) {
                for (m =0 ; i < L1&& j<L2; ) {
                    if (a1[i] < a2[j]) {
                        a3[k] = a1[i];
                        if (i< L1)i++;
                        break;
                    }
                    if (a1[i] > a2[j]) {
                        a3[k] = a2[j];
                        if (j< L1)j++;
                        break;
                    }
                    if (a1[i] == a2[j]) {
                        a3[k] = a1[i];
                        if (i< L1)i++;
                        a3[++k] = a2[j];
                        if (j< L2)j++;
                        break;

                    }
                }

                for (m =0 ; i >= L1|| j>=L2; ) {
                    if (i< L1)i++;
                    if (j< L2)j++;
                    if (k< L3)k++;
                    if (i >= L1 && j>=L2) break;
                    if (i >= L1 && j<L2){ a3[k] = a2[j];}
                    if (j >= L2 && i<L1){ a3[k] = a1[i];}


                }


//            for (int i = 0; i < L1; ) {
//
//            }
//            for (j = 0; j < L2; ) {
//
//            }


//        for (int k = 0; k<L3 ; k++){
//            for(int m=0; ; ){
//
//              if(i< L1 && j<L2 ){
//                if (a1[i]<a2[j]) {a3[k] = a1[i];i++;break;}
//                if (a1[i]>a2[j]) {a3[k] = a2[j];j++;break;};
//                if (a1[i]==a2[j]) {a3[k] = a1[i];k++; a3[k]=a2[j];i++;j++;break;}
//                }
//
//                while  (i>=L1&& j<L2) {  a3[k] = a2[j]; k++;j++;
//                }
//
//                while  (j>=L2&& i<L1) {  a3[k] = a1[i]; k++;i++;
//                }
//
//            }
//        }


//break;
        }
        return a3;
    }

    public static void main(String[] args) {


        int[] a1 = {1, 2};//new int [10];
        int[] a2 = {1, 3, 9};//new int [5];
        int[] a3 = sort(a1, a2);
        System.out.print(Arrays.toString(a3));


    }
}