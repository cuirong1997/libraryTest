package library;

import library.Member;

public class LoanOnlyOneSpecification implements ISpecification<Member>{
	private Book wantbook;

	
	
	public LoanOnlyOneSpecification(Book wantbook){
		this.wantbook=wantbook;
	}
	
	
	@Override
	public boolean IsSatisfiedBy(Member member){
		boolean res=member.getLoans()
	            .stream()
	            .noneMatch(loan -> loan.HasNotBeenReturn() && loan.getBook().getISBN().equals(wantbook.getISBN()));
		if(!res){
			System.out.println(member.getName()+"还未归还"+"《"+wantbook.getTitle()+"》，无法再借");
		}
		return res;
	}

	public Book getWantbook() {
		return wantbook;
	}

	public void setWantbook(Book wantbook) {
		this.wantbook = wantbook;
	}

	
	
}
