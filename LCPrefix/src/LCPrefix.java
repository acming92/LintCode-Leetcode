
public class LCPrefix {
	
	public int findIndex(String[] strs){
		int i = 0, j = 0;
		if(strs.length <= 1){
			return strs[0].length();
		}
		if(strs[0] == null){
			return 0;
		}
        for(i = 0; i < strs[0].length(); ++i){
        	char a = strs[0].charAt(i);
        	for(j = 1; j < strs.length; ++j){
        		if(strs[j] == null){
        			return 0;
        		}
        		if(i >= strs[j].length()){
        			return i;
        		} 
        		else if(strs[j].charAt(i) != a){
        			return i;
        		}
        	}
        }
        
        return i;
	}
	
	public String longestCommonPrefix(String[] strs) {
        if(strs == null) return "";
        if(strs.length == 0) return "";
        if(strs[0] == null) return "";
        return strs[0].substring(0, findIndex(strs));
    }
	
	public static void main(String[] args){
		LCPrefix temp = new LCPrefix();
		String[] strs = {};
		System.out.println(temp.longestCommonPrefix(strs));
	}
}
