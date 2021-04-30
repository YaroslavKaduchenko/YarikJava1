package exeption;

import util.Countries;

public class TooMuchOfCO2Exception extends RuntimeException{

    public TooMuchOfCO2Exception(Countries country, int co2Sum) {

        //Too much of CO2 in the World. KNR stop producing CO2")
        super("Too much of CO2 in the World: " + co2Sum + ". " + country + " stop producing CO2!");
    }
}
