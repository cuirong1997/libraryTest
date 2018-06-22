package library;

import library.Member;
import library.ISpecification;

public class HasReachMaxSpecification implements ISpecification<Member>{
	
	@Override
	public boolean IsSatisfiedBy(Member member){
		boolean res=member.getLoans().stream().filter(Loan::HasNotBeenReturn).count()<3;
		return res;
	}

}
