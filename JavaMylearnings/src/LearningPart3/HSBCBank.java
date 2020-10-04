package LearningPart3;

public class HSBCBank implements USBank , BrazilBank{//--multiple inheritance two parents of HSBCBank
	//Is-a relationship -- in case of class and interface 
	//USBank methods--overridding from USBank interface-
	@Override
	public void credit()
	{
		System.out.println("HSBC-- Credit");
	}
	@Override
	public void debit()
	{
		System.out.println("HSBC--Debit");
	}
	@Override
	public void transfer()
	{
		System.out.println("HSBC---tranfer");
	}
	//own method
	public void educationLoan()
	{
		System.out.println("HSBC education loan");
	}
	//Brazilbank methods--n overriding from BrazilBank Interface
	@Override
	public void mutualfund()
	{
		System.out.println("mutual fund");
	}
}
