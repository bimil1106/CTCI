package cracking.chapter1;

public class Q1_4 {
	static char[] replaceSpace(char[] s, int length) {
		int count=0;
		for (int i=0; i<length; i++)
			if (s[i]==' ')
				count++;
		int i1=length;
		int i2=length+(count*2);
		while (i1>0) {
			i1--;
			System.out.println(String.format("i1=%d, s[%d]='%c'", i1, i1, s[i1]));
			if (s[i1]==' ') {
				i2-=3;
				s[i2]='%';
				s[i2+1]='2';
				s[i2+2]='0';
			} else {
				i2--;
				s[i2]=s[i1];
			}
			System.out.println(String.format("i2=%d", i2));
		}
			
		return s;
	}
}
