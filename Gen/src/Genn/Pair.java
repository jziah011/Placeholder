package Genn;
public class Pair <T>{
	private T first;
	private T second;
	
	public Pair(T first, T second) {
		this.first = first;
		this.second  = second;
	}
		
	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
	
	public void swap() {
		T temp = first;
		first = second;
		second = temp;
	}

	@Override
	public String toString() {
		return first + ", " + second;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer> pair  = new Pair<>(1,2);
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
		System.out.println(pair);
		pair.setFirst(6);
		pair.setSecond(7);
		System.out.println(pair);
		pair.swap();
		System.out.println(pair);
		Integer i = pair.getFirst();
		int j = pair.getSecond(); //generica plus autounboxxing
		System.out.printf("%d %d\n", i, j);
		
	}

}
