
public class StringCompression {
	
	static String stringCompression(String s) {
		String temp = "";
		int sum = 1;
		for(int i = 0 ;i < s.length()-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				 sum++;
			}else {
			temp = temp + s.charAt(i) + sum;
			sum = 1;
		}
		}
		temp = temp + s.charAt(s.length() -1) + sum ;
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = stringCompression("aaa");
		System.out.println(abc);
	}

}
