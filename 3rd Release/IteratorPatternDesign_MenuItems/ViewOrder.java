package Food.Delivery;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ViewOrder {
	 public void Vieworder(String fileName) throws IOException {
	        Path path = Paths.get(fileName);
	        Scanner scanner = new Scanner(path);
	        while(scanner.hasNextLine()){
	            String line = scanner.nextLine();
	            System.out.println(line);
	        }
	        scanner.close();
	 }
}



