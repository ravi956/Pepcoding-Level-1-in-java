package stringAndStringBuilder;

public class PrintSubSequences {
	public static void main(String []args) {
		String s = "abc";
		
		for(int i=0; i<(1<<s.length()); i++) {
			for(int j=s.length()-1; j>=0; j--) {
				int mask = 1<<j;
				if( (i & mask) != 0) {
					System.out.print(s.charAt(s.length()-j-1));
				}else {
					System.out.print('_');
				}
			}
			System.out.println();
		}
	}
}
