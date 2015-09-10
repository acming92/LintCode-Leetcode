class Solution {
    /**
     * @param key: A String you should hash
     * @param HASH_SIZE: An integer
     * @return an integer
     */
    public int hashCode(char[] key,int HASH_SIZE) {
        // write your code here
    	if(key == null || key.length == 0) {
    		return 0;
    	}
    	int magicNum = 1;
    	long hash = 0;
    	for(int i = key.length - 1; i >= 0; --i) {
    		int num = key[i] - '\0';
    		hash = (hash + ((long)num * magicNum) % HASH_SIZE) % HASH_SIZE;
    		magicNum = (magicNum * 33) % HASH_SIZE;
    	}
    	
    	return (int)hash;
    }
    
    public static void main(String[] args) {
    	Solution temp = new Solution();
    	char[] a = {'a', 'b', 'c', 'd'};
    	System.out.println(temp.hashCode(a, 100));
    }
};
