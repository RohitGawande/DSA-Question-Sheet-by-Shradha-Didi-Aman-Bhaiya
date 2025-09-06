public class Basic {
    public  static void reverseAr(int ar[]){
        int left=0,right=ar.length-1;
        while (left<right) {
            int tem=ar[left];
            ar[left]=ar[right];
            ar[right]=tem;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        reverseAr(ar);
        for (int i : ar) {
            System.out.println(i);
        }
    }
}
