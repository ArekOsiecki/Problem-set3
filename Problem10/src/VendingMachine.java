public class VendingMachine {

    private int tokenCount, canCount;

    public void setCanCount(int canCount){

        this.canCount=canCount;
    }

    public void setTokenCount(int tokenCount) {

        this.tokenCount = tokenCount;
    }

    public int getCanCount(){

        return canCount;

    }


    public int getTokenCount(){

        return tokenCount;

    }

    public VendingMachine(){

        new VendingMachine(canCount = 5, tokenCount = 0);

    }

    public VendingMachine(int canCount, int tokenCount){

        setCanCount(canCount);
        setTokenCount(tokenCount);
    }

    public int tokenInserted(){

        tokenCount++;
        return tokenCount;

    }

    public int buyCan(){


        if(canCount>0)
        {
            canCount--;

        }
        else{
            canCount=getCanCount();
        }

            return canCount;

    }


    public String toString(){

        String message;


        if(canCount==0)
        {
            message = "There is "+getCanCount()+" cans of soda in the machine.\nThere is "+getTokenCount()+" tokens in the machine.\nThe machine is empty - refill please";
            return message;
        }

        else
        {
            message = "There is "+getCanCount()+" cans of soda in the machine.\nThere is "+getTokenCount()+" tokens in the machine";
            return message;
        }


    }

    public int fillUp(){

        canCount = 10;
        return canCount;

    }



}




/*
* VendingMachine class
* VARIABLES
* INTEGER tokenCount,canCount
* METHODS
*
* Method buyCan{
* token count increases
* soda can count decreases
* Message - Can is ready to collect}
*
* Method fillUp{
* token count goes to 0
* soda can count goes to max
* Message - machine is refilled}
*
* Method getCanCount{
* Message - can count is }
*
* Method getTokenCount{
* Message - token count is }
*
* */