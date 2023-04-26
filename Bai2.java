package Bai2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bai2 {
    public static void main(String[] args) {
    	try {
			BufferedReader reader = new BufferedReader(new FileReader("E:\\LuuDuLieuSinhVien\\2001200266_DangTranKhoi_JAVA\\KTGK02-2001200266-DangTranKhoi\\src\\Bai2\\input.txt"));
            String[] line1 = reader.readLine().split(" ");
            int n = Integer.parseInt(line1[0]);
            int d = Integer.parseInt(line1[1]);
            String[] line2 = reader.readLine().split(" ");
            
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(line2[i]);
            }
            int moves = 0;
            for (int i = 1; i < n; i++) {
                while (b[i] <= b[i - 1]) {
                    b[i] += d;
                    moves++;
                }
            }
            reader.close();
            System.out.println(moves);
        } catch (IOException e) {
        	e.printStackTrace();
        }
    }
}