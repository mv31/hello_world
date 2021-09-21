package sample_practicetest;

public class palindromee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ispalindromee("madam"));
		int x = 100;
		System.out.println(ispali(x+""));
		System.out.println(ispali("madam"));
		int x1 = 101;
		System.out.println(ispali(x1+""));
	}
	public static boolean ispalindromee(String s){
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String s1 = sb.toString();
		return s.equals(s1);
	}
	public static boolean ispali(String s) {
		return  new StringBuilder(s).reverse().toString().equals(s);
		}
	
	

}
