package standin;

public class VerifyCCLength implements StrategyVerification {

	@Override
	public boolean Verify(String Num) {
	 if ((Num.length() < 17) && ( Num.length() > 14)) 
		 return true;
	 return false;
	}

}
