
public class StrStr {
	
	public int strStr(String source, String target) {
        //write your code here
		int i, j;
		
		if(source == null || target == null) {
			return -1;
		}
		
		if(source.length() == 0 && target.length() == 0) {
			return 0;
		}
		
		if(source.length() < target.length()) {
			return -1;
		}
		
		for(i = 0; i <= source.length() - target.length(); ++i) {
			for(j = 0; j < target.length(); ++j) {
				if(source.charAt(i + j) != target.charAt(j)) {
					break;
				}
			}
			
			if(j == target.length()) {
				return i;
			}
		}
        return -1;
    }
	
}
