public class MyPoint {

    private int xVal, yVal;

    public void  setXval(int xVal){
        this.xVal=xVal;
    }

    public void setYval(int yVal){
        this.yVal= yVal;
    }

    public int getXval(){
        return xVal;
    }

    public int getYval(){
        return yVal;
    }

    public String toString(){

        String pointString = "Value of X is :"+xVal+"\nValue of Y is :"+yVal;
        return pointString;
    }

    public MyPoint(int xVal,int yVal){

        setXval(xVal);
        setYval(yVal);

    }

    public MyPoint(){

        new MyPoint(0,0);
    }

    public int moveHorizontally(){
        this.xVal+=xVal;
        return xVal;
    }
    public int moveVertically(){
        this.yVal+=yVal;
        return yVal;
    }
}
