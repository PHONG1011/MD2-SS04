import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột: ");
        int cols = Integer.parseInt(sc.nextLine());
        int array[][] = new int[rows][cols];
        System.out.println("Nhập các phần tử của mảng (theo từng hàng):");
        for(int i = 0; i < rows; i++) {
            System.out.printf("Hàng %d: ", i + 1);
            for (int j = 0; j < cols; j++) {
                array[i][j]  = Integer.parseInt(sc.nextLine());
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(array[i][j] % 2 == 0){
                    sum1 += array[i][j];
                } else {
                    sum2 += array[i][j];
                }
            }
        }
        System.out.println("Tổng các số chẵn là: " + sum1);
        System.out.println("Tổng các số lẻ là: " + sum2);
    }
}