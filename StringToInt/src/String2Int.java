public class String2Int {
	public String getString2Int(String Data) {
		String ans = "";
		// Count data input for loop
    	int check = Data.length();
    		// Loop to check each string for a number.
    		for (int i=0; i < check; i++){
    			//If data input equals string, skip.
    			if (Data.charAt(i) < '0' || Data.charAt(i) > '9') {
    			}
    			//If the data input is not equal to the string, add it to the answer.
    			else {
    				ans += Data.charAt(i);
    			}
    	}
    	// Return answer
		return ans;
	}

}
