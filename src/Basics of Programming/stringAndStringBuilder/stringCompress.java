package stringAndStringBuilder;

public class stringCompress {

	public static void main(String[] args) {
		String str = "aaabbcaaaddeefff";
		compress1(str);
		System.out.println();
		compress2(str);
	}

	public static void compress1(String str) {
		for(int i=0; i<str.length()-1; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			
			if(ch1!=ch2) {
				System.out.print(ch1);
			}
		}
		System.out.println(str.charAt(str.length()-1));
	}
	
	public static void compress2(String str) {
		int counter = 1;
		for(int i=0; i<str.length()-1; i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			
			if(ch1!=ch2) {
				System.out.print(ch1);
				if(counter>1) {
					System.out.print(counter);
					counter=1;
				}
			}else
				counter++;
		}
		System.out.print(str.charAt(str.length()-1));
		if(counter>1)
			System.out.print(counter);
	}
}
