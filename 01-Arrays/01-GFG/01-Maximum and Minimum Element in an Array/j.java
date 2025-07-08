public class j {
    public static int  maxNum(int ar[],int max){
         for (int i : ar) {
            if (max<i) {
                max=i;
            }
        }
        return max;
    }
     public static int  minNum(int ar[],int min){
         for (int i : ar) {
            if (min>i) {
                min=i;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        int max=Integer.MIN_VALUE;
          int min=Integer.MAX_VALUE;
        System.out.println(maxNum(ar,max));
        System.out.println(minNum(ar,min));
    }
}
