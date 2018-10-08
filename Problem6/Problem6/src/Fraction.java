public class Fraction {

    private int nominator, denominator;


    public void setNominator(int nominator){

        this.nominator= nominator;
    }

    public void setDenominator(int denominator){

        this.denominator= denominator;
    }

    public int getNominator(){

        return nominator;
    }

    public int getDenominator(){

        return denominator;
    }

    public Fraction(int nominator,int denominator){

        setNominator(nominator);
        setDenominator(denominator);

    }

    public Fraction(){

         new Fraction(nominator=0,denominator=1);

    }

    public String toString(){

        String fractionString= getNominator()+"/"+getDenominator();
        return fractionString;
    }

    public Fraction addFraction(Fraction otherFraction){


        int fractionNominator = getNominator();
        int fractionDenominator = getDenominator();


        int fractionNominator2 = otherFraction.getNominator();
        int fractionDenominator2 = otherFraction.getDenominator();


        int newNominator= (fractionNominator*fractionDenominator2)+(fractionNominator2*fractionDenominator);
        int newDenominator= (fractionDenominator*fractionDenominator2);


        return new Fraction(newNominator,newDenominator);

    }

    public Fraction subFraction(Fraction otherFraction){




        int fractionNominator = getNominator();
        int fractionDenominator = getDenominator();


        int fractionNominator2 = otherFraction.getNominator();
        int fractionDenominator2 = otherFraction.getDenominator();

        int newNominator= (fractionNominator*fractionDenominator2)-(fractionNominator2*fractionDenominator);
        int newDenominator= (fractionDenominator*fractionDenominator2);

        return new Fraction(newNominator,newDenominator);

    }

    public Fraction multiplyFraction(Fraction otherFraction){


        int fractionNominator = getNominator();
        int fractionDenominator = getDenominator();


        int fractionNominator2 = otherFraction.getNominator();
        int fractionDenominator2 = otherFraction.getDenominator();

        int newNominator= fractionNominator*fractionNominator2;
        int newDenominator= fractionDenominator*fractionDenominator2;

        return new Fraction(newNominator,newDenominator);

    }

    public Fraction divideFraction(Fraction otherFraction){


        int fractionNominator = getNominator();
        int fractionDenominator = getDenominator();


        int fractionNominator2 = otherFraction.getNominator();
        int fractionDenominator2 = otherFraction.getDenominator();

        int newNominator= fractionNominator*fractionDenominator2;
        int newDenominator= fractionDenominator*fractionNominator2;


        return new Fraction(newNominator,newDenominator);

    }
}
