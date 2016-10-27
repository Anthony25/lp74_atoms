package utbm.tx52.atoms_visualiser;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by adah on 10/10/16.
 */
public class CHNO implements IPeriodicTable {
    private static CHNO instance = null;
    private String[] limitedAtomsSymbole = {"H", "C", "N", "O"};
    private short[] limitedAtomsNumber = {1, 6, 7, 8};
    private short[] limitedAtomsLiaison = {1, 4, 0, 2};//VERIFY
    private short[] limitedAtomsRayon = {25, 100, 10, 80};//TODO fix with correct values
    private Color[] limitedAtomsColor = {Color.BLACK, Color.WHITE, Color.BLUE, Color.RED};
    private String[] limitedUniqGroup = {"Hydrogene", "Element Nonmetal", "Element Nonmetal", "Nonmetal"};
    private String[] limitedGroup = {"Element Nonmetal", "Hydrogene"};

    protected CHNO() {
    }


    public static CHNO getInstance() {
        if (instance == null) instance = new CHNO();
        return instance;
    }


    public ArrayList<String> getSymbole() {
        return new ArrayList(Arrays.asList(this.limitedAtomsSymbole));
    }


    public ArrayList<Integer> getLiaisons() {
        return new ArrayList(Arrays.asList(this.limitedAtomsLiaison));
    }

    public ArrayList<Double> getRayons() {
        return new ArrayList(Arrays.asList(this.limitedAtomsRayon));
    }

    public ArrayList<String> getGroup() {
        return new ArrayList<String>(Arrays.asList(this.limitedGroup));
    }


    public ArrayList<String> getUniqGroup() {
        return new ArrayList<String>(Arrays.asList(this.limitedUniqGroup));
    }

    public Color[] getCouleurs() {
        return this.limitedAtomsColor;
    }

    public int getNumber(int a_number) {
        switch (a_number) {
            case 1:
                return 0;//H
            case 6:
                return 1;//C
            case 7:
                return 2;//N
            default:
                return 3;//O
        }
    }

    public int getANumber(int number) {
        if (number > 3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return limitedAtomsNumber[number];
    }

    public String[] getLimitedAtomsSymbole() {
        return limitedAtomsSymbole;
    }

    public void setLimitedAtomsSymbole(String[] limitedAtomsSymbole) {
        this.limitedAtomsSymbole = limitedAtomsSymbole;
    }

    public short[] getLimitedAtomsLiaison() {
        return limitedAtomsLiaison;
    }

    public void setLimitedAtomsLiaison(short[] limitedAtomsLiaison) {
        this.limitedAtomsLiaison = limitedAtomsLiaison;
    }

    public short[] getLimitedAtomsRayon() {
        return limitedAtomsRayon;
    }

    public void setLimitedAtomsRayon(short[] limitedAtomsRayon) {
        this.limitedAtomsRayon = limitedAtomsRayon;
    }

    public Color[] getLimitedAtomsColor() {
        return limitedAtomsColor;
    }

    public void setLimitedAtomsColor(Color[] limitedAtomsColor) {
        this.limitedAtomsColor = limitedAtomsColor;
    }
}