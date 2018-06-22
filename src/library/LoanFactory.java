package library;

import java.time.LocalDateTime;
import java.util.UUID;

public class LoanFactory {
	public static Loan CreateLoan(Book book,Member member){
		book.setLoanTo(member);
		Loan loan = new Loan();
		loan.setId(UUID.randomUUID().toString());
		loan.setBook(book);
		loan.setLoanDate(LocalDateTime.now());
		loan.setMember(member);
		System.out.println("借书成功");
		return loan;
		
	}

}
