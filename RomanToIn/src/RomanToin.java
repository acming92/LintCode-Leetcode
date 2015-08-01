
public class RomanToin {
	
	public int romanToInt(String s) {
		int lastNum = 1000;
		int curNum = 0;
		int sum = 0;
		int diff = 0;
		
		for(int i = 0; i < s.length(); ++i){
			curNum = getNum(s.charAt(i));
			diff = curNum - lastNum;
			if(diff <= 0){
				sum += curNum;
			} else {
				sum = sum + curNum - 2 * lastNum;
			}
			lastNum = curNum;
		}
		
        return sum;
    }
	
	private int getNum(char c){
		
		if(c == 'I'){
			return 1;
		} 
		else if(c == 'V'){
			return 5;
		}
		else if(c == 'X'){
			return 10;
		}
		else if(c == 'L'){
			return 50;
		}
		else if(c == 'C'){
			return 100;
		}
		else if(c == 'D'){
			return 500;
		}
		else if(c == 'M'){
			return 1000;
		}
		
		return 0;
	}
	public static void main(String[] args){
		RomanToin temp = new RomanToin();
		int a = temp.romanToInt("MMMCMXCIX");
		System.out.println(a);
	}
}
