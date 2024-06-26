package exception_handling.throwss;

import java.util.Scanner;

public class SuDungThrow {
    public static void main(String[] args) throws Exception {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen n: ");
        while(true) {
            scanner = new Scanner(System.in);
            try {
                n = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception ex) {
                System.out.println("Phai nhap vao so nguyen");
            }
        }
        if(n<0)
            throw new Exception("Khong xu ly voi so am");

        System.out.println("So ban can xu ly la: "+n);
    }
}
