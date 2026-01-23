
package nhieubailec6;

import java.util.Scanner;
import java.util.Arrays;

public class Nhieubailec6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\n--- KET QUA ---");

        System.out.print("a. Mang vua nhap: ");
        hienThiMang(arr);

        int[] mangDaoNguoc = daoNguocMang(arr);
        System.out.print("b. Mang sau khi dao nguoc: ");
        hienThiMang(mangDaoNguoc);

        System.out.print("c. Cac so chan trong mang: ");
        hienThiSoChan(arr);

        int tong = tinhTongChiaHet3va5(arr);
        System.out.println("d. Tong ca so chia het cho 3 va 5: " + tong);

        int[] mangTangDan = arr.clone();
        Arrays.sort(mangTangDan); // Đã có thư viện Arrays ở trên nên sẽ chạy được
        System.out.print("e. Mang sap xep tang dan: ");
        hienThiMang(mangTangDan);

        int[] mangGiamDan = sapXepGiamDan(arr);
        System.out.print("f. Mang sap xep giam dan: ");
        hienThiMang(mangGiamDan);
    }

    public static void hienThiMang(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] daoNguocMang(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }

    public static void hienThiSoChan(int[] arr) {
        for (int x : arr) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
    }

    public static int tinhTongChiaHet3va5(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            if (x % 3 == 0 && x % 5 == 0) {
                sum += x;
            }
        }
        return sum;
    }

    public static int[] sapXepGiamDan(int[] arr) {
        int[] res = arr.clone();
        for (int i = 0; i < res.length - 1; i++) {
            for (int j = i + 1; j < res.length; j++) {
                if (res[i] < res[j]) {
                    int temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        return res;
    }
}

