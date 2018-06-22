package library;
/*
 * Coral
 * */
import library.Member;

public class LoanOnlyOneSpecification implements ISpecification<Member>{
	private Book wantbook;

	
	
	public LoanOnlyOneSpecification(Book wantbook){
		this.wantbook=wantbook;
	}
	
	/*
	 *allMatch操作用于判断Stream中的元素是否全部满足指定条件。如果全部满足条件返回true，否则返回false。
	 *anyMatch操作用于判断Stream中的是否有满足指定条件的元素。如果最少有一个满足条件返回true，否则返回false。
	 *noneMatch方法将判断Stream中的所有元素是否满足指定的条件，如果所有元素都不满足条件，返回true；否则，返回false.
	 * 
	 * */

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
