//Edit only code in this file

class Stapler{
    //Data
    private int staples;
    private boolean isOpen;
	private int capacity;
    
    //Methods (Behaviors)
    public Stapler(){
        staples = 0;
        isOpen = false;
        capacity = 500;
    }
    public Stapler(int numStaples){
        staples = numStaples;
        isOpen = false;
        capacity = 500;
    }
    public Stapler(Stapler stapleGuy){
        staples = stapleGuy.getStaples();
        isOpen = !stapleGuy.isClosed();
        capacity = 500;
    }
    
    public void loadStaples(int s){
        //Update staples variable to be s more, but no more than the total capacity (default is 500).
        //If s is not positive, ignore the value
        if(s>=0){
            //System.out.println(staples+s + "before cap check");
            if((staples + s) <= capacity){
                //System.out.println(staples+s + "after cap check");
                staples += s;
            }
            else{
                staples=500;
            }
        }
        //System.out.println(getStaples());
        
        
    }
    
    public boolean staple(){
        //1.  If the stapler is closed and not out of staples, staple!
        //2.  Reduce the number of staples by 1 & return true.
        //If there was a problem stapling (not closed, out of staples) return false;
        if(isOpen!=true && staples>0){
            staples-=1;
            return true;
        }
        return false;
    }
    
    public void open(){
        isOpen=true;
    }
    
    public void close(){
        isOpen=false;        
    }
    
    public int getStaples(){
        return staples;
    }
    
    public boolean isClosed(){
        return !isOpen;
    }
		/** Method to get print information about the Stapler
	@return returns a phrase like "This stapler has room for x staples" where x is the remaining capacity after accounting for staples in the Stapler
	**/
		public String toString(){
			return "This stapler has room for " + (500-staples) + " staples";
		}
}
