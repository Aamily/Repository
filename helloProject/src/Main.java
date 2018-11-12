public class Main {

    public static void main(String[] args) {

        /**
         * 冒泡排序
         */
        int[] a = {10,34,23,45,1,40,11,3,13,4};

        for (int i=0;i<a.length;i++){
            boolean flag = false;
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }

        for (int i:a) {
            System.out.print(i+" ");
        }


    }
}
