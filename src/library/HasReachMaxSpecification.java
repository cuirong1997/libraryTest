package library;
/*
 * Coral
 * */
import library.Member;
import library.ISpecification;

public class HasReachMaxSpecification implements ISpecification<Member>{
	
	@Override
	public boolean IsSatisfiedBy(Member member){
		//判断未还的书籍数量
		boolean res=member.getLoans().stream().filter(Loan::HasNotBeenReturn).count()<3;
		return res;
	}

}
