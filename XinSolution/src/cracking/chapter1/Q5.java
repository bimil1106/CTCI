package cracking.chapter1;

public class Q5 {

	public static void main(String[] args) {
		System.out.println(strCompression("aaabbbcaaa"));
		System.out.println(strCompression(null));
		System.out.println(strCompression("null"));

	}

	public static String strCompression(String str){
		if(str==null) 
			return null;

		StringBuilder result = new StringBuilder();
		char[] chars = str.toCharArray();

		char currentChar = chars[0];
		int count = 1;

		for(int i=1; i<chars.length; i++){
			if(currentChar==chars[i]){
				count++;
			}else{
				result.append(Character.toString(currentChar)+count);
				currentChar = chars[i];
				count = 1;
			}
		}
		result.append(Character.toString(currentChar)+count);

		return result.toString().length()>=str.length()?str:result.toString();
	}

}