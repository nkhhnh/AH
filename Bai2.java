
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bai2 {
    public static void main(String[] args) {
    	try {
		url = new java.net.URL("https://raw.githubusercontent.com/nkhhnh/AH/main/input.txt");
		java.net.URLConnection uc;
		uc = url.openConnection(); 
		reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
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
