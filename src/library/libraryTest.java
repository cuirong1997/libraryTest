package library;


public class libraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("201806221503","isbnforbookone","OOAD-HeadFirst");
		Book book2=new Book("201806221504","isbnforbooktwo","轻量级JavaEE应用");
		Book book3=new Book("201806221505","isbnforbookthree","系统分析与设计");
		Book book4=new Book("201806221506","isbnforbookfour","JspServlet设计与应用");
		Book book5=new Book("201806221507","isbnforbookfive","HTML+CSS+JS前端开发设计");
		
		Member member1=new Member("001","actorA");
		Member member2=new Member("002","actorB");
		
		
		
		member2.loanBook(book2);
		member2.loanBook(book3);
		member2.loanBook(book4);
		member2.loanBook(book5);
		member2.Return(book3);
		member2.loanBook(book5);
		
		
		
		
	}

}
