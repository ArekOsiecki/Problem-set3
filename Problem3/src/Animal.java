public class Animal {

    private String type;
    private String [] continents;
    private double weight;
    private int age;

    public void setType(String type){
        this.type = type;

    }

    public void setContinents(String[] continents){
        this.continents = continents;

    }

    public void setWeight(double weight){
        this.weight = weight;

    }

    public void setAge(int age){
        this.age = age;

    }

    public String getType(){
        return type;

    }
    public String[] getContinents(){
        return continents;

    }

    public double getWeight(){
        return weight;

    }

    public int getAge(){
        return age;

    }

    public String toString(){

        String conts="";

        if(continents!=null)
        {
            for(int i=0;i<continents.length;i++)
            {
                if(continents[i]!=null)
                    conts += continents[i] + " ";
            }
        }
        else
            conts = "No continents specified";

        String animalString = "Type :"+getType()+"\nContinents :"+conts+"\nWeight :"+getWeight()+"\nAge :"+getAge();
        return animalString;

    }

    public Animal(String type, String[] continents, double weight, int age){

        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public Animal(){

        new Animal("No Type Specified",null,0.0,0);

    }



}
