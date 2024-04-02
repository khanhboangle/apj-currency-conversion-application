import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
        double tiGia = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quyDoi = usd * tiGia;
        System.out.print("Giá trị VND: " + quyDoi);
    }
}