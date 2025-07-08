public class ReverseArray {
    public static void reverseArray(int ar[]){
        int n=ar.length;
        int tem[]=new int[n];
        for (int i : ar) {
            tem[i]=ar[n-1-i];
        }
        for (int i : tem) {
            ar[i]=tem;
        }
    }
    public static void main(String[] args) {
        int ar[] ={1,2,3,4,5,6,7,8,9};
System.out.println(reverseArray(ar));
    }
}
