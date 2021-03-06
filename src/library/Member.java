package library;
/*
 * Coral
 * */
import java.util.ArrayList;
import java.util.List;

import library.Loan;

public class Member {
	private String id;
	private String name;
	private List<Loan> loans = new ArrayList<>(3);
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Loan> getLoans() {
		return loans;
	}
	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}
	
	public void Return(Book book){
		Loan loan=FindCurrentLoan(book);
		if (loan != null){
			loan.MarkAsReturn();
			System.out.println(getName()+"成功归还《"+book.getTitle()+"》");
			book.setLoanTo(null);
		}
	}
	
	
	public boolean canLoanBook(Book book){
		
		LoanOnlyOneSpecification only=new LoanOnlyOneSpecification(book);
		if(!only.IsSatisfiedBy(this)){
			return false;
		}
		
		if(book.getLoanTo()!=null){
			System.out.println("《"+book.getTitle()+"》已经借出"+getName()+"借书失败");
			return false;
		}
		
		HasReachMaxSpecification has=new HasReachMaxSpecification();
		if(!has.IsSatisfiedBy(this)){
			System.out.println(getName()+"已经达到借书上限，请归还在借书之后重试");
			return false;
		}
		
		
		return true;
		}
	
	public Loan loanBook(Book book){
		if(!canLoanBook(book)){
			System.out.println("书籍《"+book.getTitle()+"》不能被借");
			return null;
		}
		Loan loan=LoanFactory.CreateLoan(book, this);
		loans.add(loan);
		return loan;
		}
	
	public Loan FindCurrentLoan(Book book){
		Member record=book.getLoanTo();
		if(record==null||!record.getId().equals(this.getId())){
			return null;
		}
		for(Loan loan:loans){
			if(loan.getBook().getId().equals(book.getId())&&loan.HasNotBeenReturn()){
				System.out.println(getName()+"存在借阅编号为:"+book.getId()+"的《"+book.getTitle()+"》记录");
				return loan;
			}
		}
		System.out.println(getName()+"没有借过"+"《"+book.getTitle()+"》");
		return null;
		}
	
	public Member(String id,String name){
		this.id=id;
		this.name=name;
		
	}
}
