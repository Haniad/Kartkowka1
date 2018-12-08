import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {

        ArrayList<ChemicalFormula> compounds = new ArrayList<>();

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

        H2SO4.addComponent(H,"2");
        H2SO4.addComponent(S,"1");
        H2SO4.addComponent(O, "4");

        NH4NO3.addComponent(N, "2");
        NH4NO3.addComponent(H, "4");
        NH4NO3.addComponent(N, "1");
        NH4NO3.addComponent(O, "3");


        System.out.println(NaCl.toString());
        System.out.println(C17H19NO3.toString());
        System.out.println(H2SO4.toString());
        System.out.println(NH4NO3.toString());
    }
}
