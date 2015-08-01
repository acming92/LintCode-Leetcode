
public class Palindrome {
	
	public int reverse(int num){
		int target = 0;
		int curNum = num;
		while(curNum != 0){
			target = target * 10 + curNum % 10;
			curNum /= 10;
		}
		return target;
	}
	
	public boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x == reverse(x)) return true;
		return false;
    }
	
	public static void main(String[] args){
		Palindrome temp = new Palindrome();
		System.out.println(temp.isPalindrome(12321));												
	}

}
