package exception_handling.trycatch;

import exception_handling.custom.MyCustomError;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MacDinh {
    public static void main(String[] args) throws MyCustomError {
        Date birthday = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ngay sinh cua ban: ");
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            birthday = sf.parse(scanner.nextLine());
        } catch (ParseException e) {
             //e.printStackTrace();
//            System.out.println(e.getMessage());
            throw new MyCustomError("Ngay thang khong dung dinh dang");
        }
        System.out.println("Ngay sinh cua ban: "+birthday);
    }
}
