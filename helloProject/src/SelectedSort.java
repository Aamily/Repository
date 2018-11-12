public class SelectedSort {
    public static void main(String[] args) {
        /**
         * 选择排序算法
         */
        int[] a = {10,34,23,45,1,40,11,3,13,4};
        for (int i=0;i<a.length-1;i++){
            int min = i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    int temp = a[min];
                    a[min] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}
