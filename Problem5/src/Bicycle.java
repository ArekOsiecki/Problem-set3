public class Bicycle {

    private String owner, make;
    private double price;

    public void setOwner(String owner){
        this.owner= owner;
    }

    public void setMake(String make){
        this.make= make;
    }

    public void setPrice(double price){
        this.price= price;
    }

    public String getOwner(){
        return owner;
    }

    public String getMake(){
        return make;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){

        String bikeToString = "\nOwner name : "+getOwner()+"\nBike make : "+getMake()+"\nBike price : "+getPrice()+" Euro";
        return bikeToString;
    }

    public Bicycle(){

        new Bicycle(owner,make,price);

    }

    public Bicycle(String owner, String make, double price){

        setOwner(owner);
        setMake(make);
        setPrice(price);

    }


}
