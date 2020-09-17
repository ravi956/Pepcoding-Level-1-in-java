package stringAndStringBuilder;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println("sb = " + sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(1)); 		// 0 to l-1
		System.out.println(sb.substring(1,4));
		
		sb.setCharAt(1, 'o');					// 0 to l-1
		System.out.println("sb = " + sb);

		sb.deleteCharAt(2);						// 0 to l-1
		System.out.println("sb = " + sb);
		
		sb.insert(2,'m');						// 0 to l (l for inserting at last)
		System.out.println("sb = " + sb);
		
		sb.append('d');
		System.out.println("sb = " + sb);
	}

}
