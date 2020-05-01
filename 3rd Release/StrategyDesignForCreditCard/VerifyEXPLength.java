package standin;

public class VerifyEXPLength implements StrategyVerification {

	@Override
	public boolean Verify(String Num) {
	 if ((Num.length() ==4)) 
		 return true;
	 return false;
	}

}
