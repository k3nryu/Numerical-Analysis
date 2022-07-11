package sec04;

class Example02 {

	public static void main(String[] args) {
		String s = "abcdefabcdef";
		String t = s.replace("a","x");
		System.out.println("t="+t);
		t=t.replace("b","y");
		System.out.println("t="+t);
		int length = t.length();
		System.out.println("tの長さ、"+ length +"文字");
		String u = t.substring(3, 7);
		System.out.println("u="+u);

	}

}
