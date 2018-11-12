public class QuickSort {
   
    public static void main(String[] args) {
        /**
         * 快速排序算法
         */
        int[] a = {10,34,23,45,1,40,11,3,13,4};
        
        quickSort_c(a,0,a.length-1);
        for (int i:a) {
            System.out.print(i+" ");
        }
    }

    private static void quickSort_c(int[] a, int left, int right) {
        if (left>=right){
            return;
        }
        int i = left;
        int j = right;
        int value = a[left];
        while (i<j){
            while(a[j]>=value&&i<j){
                j--;
            }
            while(a[i]<=value&&i<j){
                i++;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[left] = a[i];
        a[i] = value;
        quickSort_c(a,left,i-1);
        quickSort_c(a,i+1,right);
    }

}
