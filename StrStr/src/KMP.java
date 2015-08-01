
public class KMP {
	
	public int strStr(String source, String target) {
        //write your code here
		int i, j;
		
		if(source == null || target == null) {
			return -1;
		}
		
		if(target.length() == 0) {
			return 0;
		}
		
		if(source.length() < target.length()) {
			return -1;
		}
		
		int[] next = new int[target.length()];
		calculateNext(target, next);
		return KMP(source, target, next);
    }
	
	private void calculateNext(String target, int[] next){
		
		for(int i = 0; i < target.length(); ++i){
			if(i == 0) {
				next[i] = -1;
			} else {
				int k = next[i - 1];
				while(k != -1 && target.charAt(i - 1) != target.charAt(k)){
					k = next[k];
				}
				if(k != -1) {
					next[i] = k + 1;
				} else {
					next[i] = 0;
				}
			}
		}
	}
	
	private int KMP(String source, String target, int[] next) {
		
		int j = -1;
		for(int i = 0; i < source.length();) {
			if(j == -1 || source.charAt(i) == target.charAt(j)) {
				++i;
				++j;
				if(j == target.length()) {
					return i - j;
				}		
			} else {
				j = next[j];
			}
		}	
		
		return -1;
	}
	
	public static void main(String[] args){
		KMP temp = new KMP();
		System.out.println(temp.strStr("abcdabcdefg", "bcd"));
	}
}
