import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Tester  {
    public static void main(String[] args) {

        ChemicalComponent Na = new ChemicalComponent("Na");
        ChemicalComponent Cl = new ChemicalComponent("Cl");
        ChemicalComponent C = new ChemicalComponent("C");
        ChemicalComponent H = new ChemicalComponent("H");
        ChemicalComponent N = new ChemicalComponent("N");
        ChemicalComponent O = new ChemicalComponent("O");
        ChemicalComponent S = new ChemicalComponent("S");

        ChemicalFormula NaCl = new ChemicalFormula();
        ChemicalFormula C17H19NO3 = new ChemicalFormula();
        ChemicalFormula H2SO4 = new ChemicalFormula();
        ChemicalFormula NH4NO3 = new ChemicalFormula();

        NaCl.addComponent(Na, "1");
        NaCl.addComponent(Cl, "1");


        C17H19NO3.addComponent(C, "17");
        C17H19NO3.addComponent(H, "19");
        C17H19NO3.addComponent(N, "1");
        C17H19NO3.addComponent(O, "3");

        H = new ChemicalComponent("H");
        O = new ChemicalComponent("O");

        H2SO4.addComponent(H, "2");
        H2SO4.addComponent(S, "1");
        H2SO4.addComponent(O, "4");


        H = new ChemicalComponent("H");
        O = new ChemicalComponent("O");
        N = new ChemicalComponent("N");

        NH4NO3.addComponent(N, "2");
        NH4NO3.addComponent(H, "4");
        NH4NO3.addComponent(N, "1");
        NH4NO3.addComponent(O, "3");


        ArrayList<ChemicalFormula> compounds = new ArrayList<>();

        compounds.add(NaCl);
        compounds.add(C17H19NO3);
        compounds.add(H2SO4);
        compounds.add(NH4NO3);

        compounds.sort(new Comparator<ChemicalFormula>() {
            @Override
            public int compare(ChemicalFormula o1, ChemicalFormula o2) {
                return Integer.compare(o2.countAtoms(),o1.countAtoms());
            }
        });

        System.out.println(compounds);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File file = new File("compounds.json");
        try (FileWriter fileWriter = new FileWriter(file)){
            gson.toJson(compounds,fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//koniec maina

}
