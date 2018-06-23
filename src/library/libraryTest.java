package library;
/*
 * Coral
 * */
public class libraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//添加书籍
		Book book1=new Book("201806221503","isbnforbookone","OOAD-HeadFirst");
		Book book2=new Book("201806221504","isbnforbooktwo","轻量级JavaEE应用");
		Book book3=new Book("201806221505","isbnforbookthree","系统分析与设计");
		Book book4=new Book("201806221506","isbnforbookfour","JspServlet设计与应用");
		Book book5=new Book("201806221507","isbnforbookfive","HTML+CSS+JS前端开发设计");
		
		//添加用户
		Member member1=new Member("001","actorA");
		Member member2=new Member("002","actorB");
		
		/*
		 * 测试相同用户借同一本书
		 *
		System.out.println("测试相同用户借同一本书");
		System.out.println("------------------------");
		System.out.println("用户借书结果：");
		member1.loanBook(book1);
		
		System.out.println("用户借书结果：");
		member1.loanBook(book1);
		
		System.out.println("------------------------");
		*/
		
		
		
		
		/*
		 * 测试借书最大上限
		 * 
		System.out.println("测试借书最大上限");
		System.out.println("------------------------");
		System.out.println("用户借book2结果：");
		member1.loanBook(book2);
		
		System.out.println("用户借book3结果：");
		member1.loanBook(book3);
		
		System.out.println("用户借book4结果：");
		member1.loanBook(book4);
		
		System.out.println("用户借book5结果：");
		member1.loanBook(book5);
		System.out.println("------------------------");
		*/
		
		
		/*测试书籍归还
		System.out.println("测试书籍归还");
		System.out.println("------------------------");
		System.out.println("用户借书结果：");
		member2.loanBook(book1);
		
		System.out.println("用户还书结果：");
		member2.Return(book1);
		System.out.println("------------------------");
		*/
		
		/*
		 * 测试两个用户借阅同一本书
		 * 
		System.out.println("测试两个用户借阅同一本书");
		System.out.println("------------------------");
		member1.loanBook(book2);
		member1.loanBook(book2);
		System.out.println("------------------------");
		*/
		
		/*
		 * 测试达到上限归还后继续借书
		 * */
		System.out.println("测试达到上限归还后继续借书");
		System.out.println("------------------------");
		System.out.println("用户借书结果：");
		member2.loanBook(book2);
		member2.loanBook(book3);
		member2.loanBook(book4);
		member2.loanBook(book5);
		
		System.out.println("用户还书结果：");
		member2.Return(book3);
		
		System.out.println("用户达到上限后还书再借结果：");
		member2.loanBook(book5);
		System.out.println("------------------------");
		
		
		
	}

}
