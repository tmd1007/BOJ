import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(cal(A, B));
        
    }

    public static int cal(int A, int B){
        return (A+B)*(A-B);
    }
}