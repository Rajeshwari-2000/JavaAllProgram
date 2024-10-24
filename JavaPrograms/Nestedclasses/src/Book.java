
public class Book {
	private int bookid;
	private String bookname;
	class Lesson{
		private int lessonid;
		private String lesonname;
		public void m2() {
			System.out.println("in m2");
			m1();
		}
	}
	Lesson lesson1;
	public void m1() {
		System.out.println("in m1");
	}
	
}
