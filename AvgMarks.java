import java.util.Scanner;
class AvgMarks {
    public static void main(String[] args){

        System.out.println("Enter number of sublike jects");
        Scanner sc = new Scanner(System.in);
        int i; // we are using i outside for-loop so it should be declared globally.
        int n = sc.nextInt(); // n = number of subjects
        int[] a = new int[n];
        double sum = 0;
        System.out.println("Enter marks:");
        for( i = 0;i<n;i++){ // i = current index
            a[i] = sc.nextInt(); // element at index 'i' in the array 'a'
        }
        for ( i = 0; i<n;i++){
            sum = sum + a[i];
        }
        // goal is to print marks in list format Avg of (99,89,93) :'avg'
        System.out.print("Avg of (");
        for ( i = 0;i<n-1;i++){ // this for-loop is to print comma
            // 'n-1' because we don't want comma after last element.
            System.out.print(a[i]+",");
        }
        System.out.println(a[i] +") :"+ sum/n); 
        // here a[i] prints the last index element which was skipped in for loop.
    }
}