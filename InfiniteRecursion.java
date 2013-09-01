package strings;

public class InfiniteRecursion {
	public String toString(){
		return "a" + super.toString() +"\n";
	}
	public static void main(String[] args) {
		System.out.println(new Object());
	}
}
