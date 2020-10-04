package Learning4AbstractConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HDFCBank hb= new HDFCBank();
      hb.loan();// method overriding
      hb.credit();
      hb.debit(); 
      hb.fund();
      
      Bank b= new HDFCBank();//dynamic polymerphism
      b.loan();
      b.credit();
      b.debit();
      //b.fund();//bank reference cannot refer the HDFC own defined method
      //Bank b1=new bank();
      
	}

}
