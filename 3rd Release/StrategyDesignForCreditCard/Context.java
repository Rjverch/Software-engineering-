package standin;

public class Context {
	   private StrategyVerification strategy;

	   public Context(StrategyVerification strategy){
	      this.strategy = strategy;
	   }

	   public boolean executeStrategy(String Num){
	      return strategy.Verify(Num);
	   }
	}