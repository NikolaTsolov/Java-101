package wednesday_friday;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ConvertToGrayscale {
	
	public static ArrayList<Integer> convertToGrayscale(String imgPath) {
		Path filePath = Paths.get("/home/nikola/hah.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Integer> integers = new ArrayList<>();
		while (scanner.hasNext()) {
		    if (scanner.hasNextInt()) {
		        integers.add(scanner.nextInt());
		    } else {
		        scanner.next();
		    }
		}
		return integers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = convertToGrayscale("hah");
		for (Integer integer : arr) {
			System.out.println(integer);
		}
			
	}

}
