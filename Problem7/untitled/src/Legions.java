public class Legions {

    private String name, type;
    private int size;

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public int getSize(){
        return size;
    }

    public Legions(){

        new Legions(name="I", type="Citizen's", size=6000);


    }

    public Legions(String name,String type, int size){

        setName(name);
        setType(type);
        setSize(size);

    }

    public String toString(){

        String legionToString = "Legion name: "+getName()+"\nLegion type: "+getType()+ "\nLegion size: "+getSize();
        return legionToString;
    }
}
