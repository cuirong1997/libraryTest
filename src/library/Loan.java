package library;

import java.time.LocalDateTime;

public class Loan {
	private String id;
	private LocalDateTime LoanDate;
	private LocalDateTime DateForReturn;
	private LocalDateTime ReturnDate;
	private Book book;
	private Member member;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDateTime getLoanDate() {
		return LoanDate;
	}
	public void setLoanDate(LocalDateTime loanDate) {
		LoanDate = loanDate;
	}
	public LocalDateTime getDateForReturn() {
		return DateForReturn;
	}
	public void setDateForReturn(LocalDateTime dateForReturn) {
		DateForReturn = dateForReturn;
	}
	public LocalDateTime getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(LocalDateTime returnDate) {
		ReturnDate = returnDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	public boolean HasNotBeenReturn(){
		return ReturnDate==null;
	}
	
	public void MarkAsReturn(){
		this.ReturnDate=LocalDateTime.now();
	}

}
