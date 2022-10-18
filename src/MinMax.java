//Question A[]={3,2,1,56,10000,157}; min=1,max=10000
public class MinMax {
    public static void main(String[] args) {
        int a[] = {3, 2, 1, 10000, 56, 167};
        // int[] a = new int[0];
        int min = a[0];
        int max = a[0];
        for (int i =0;i <a.length;i++){
            if (a[i]<min) {//1
                min = a[i];
            }
            if(a[i]>max){//10000
                max = a[i];
            }
        }
        System.out.println("Minimum" +min);
        System.out.println("Maximum" +max);
    }

}