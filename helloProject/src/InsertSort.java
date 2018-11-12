public class InsertSort {
    public static void main(String[] args) {
        /**
         * 插入排序算法
         */
        int[] a = {10,34,23,45,1,40,11,3,13,4};
        for(int i=1;i<a.length;i++){
            int j = i-1;
            int value = a[i];
            for (;j>=0;j--){
                if(a[j]>value){
                    a[j+1] = a[j];
                }else {
                    break;
                }
            }
            a[j+1] = value;
        }

        for (int i:a) {
            System.out.println(i+" ");
        }
    }
}
