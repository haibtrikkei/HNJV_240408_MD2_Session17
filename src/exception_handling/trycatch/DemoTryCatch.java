package exception_handling.trycatch;

public class DemoTryCatch {
    public static void main(String[] args) {
        try{
            int[] arr = new int[0];          

            arr[5] = 100;
            System.out.println("Phan tu cua mang: "+arr);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
