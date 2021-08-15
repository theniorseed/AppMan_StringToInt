import java.util.Scanner;

public class String2Int_Inputdata {
	public static void main(String[] args) {
		// Add data for Test
		Scanner myObj = new Scanner(System.in);
		String Data = myObj.nextLine();
		// Implement the String2Int class.
		String2Int object = new String2Int();
		// Show answer
		System.out.println(object.getString2Int(Data));
	}

}
