package Food.Delivery;

//The implementation of Collection interface; create Fooditems class
public class FoodItems implements Collection{
	public String items[]={"Pizza", "burger", "burrito", "pudding", "nachos"};
	
	public Iterator1 getIterator(){
		return new FoodItemIterator();
	}
	

	private class FoodItemIterator implements Iterator1 {
		int j;
		
		public boolean hasNext(){
			if(j<items.length){
				return true;
			}
			return false;
		}
		
		public Object next(){
			if(this.hasNext()){
				return items[j++];
			}
			return 0;
		}
	}

}