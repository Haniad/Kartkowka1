import java.util.ArrayList;
import java.util.Comparator;

public class ChemicalFormula  {

    private ArrayList<ChemicalComponent> components;


    public ChemicalFormula() {
        this.components = new ArrayList<>();
    }

    public ArrayList<ChemicalComponent> getComponents() {
        return components;
    }

    public void addComponent(ChemicalComponent component, String licznosc) {
        component.setLicznosc(licznosc);
        components.add(component);
    }

    @Override
    public String toString() {
        StringBuilder comp = new StringBuilder();
        String licz = "";

        for (int i = 0; i < components.size(); i++) {
            if (components.get(i).getLicznosc().length() < 2)
                licz = components.get(i).getLicznosc().replace("1", "");
            else licz = components.get(i).getLicznosc();

            comp.append(components.get(i).getSymbol() + licz);
        }
        return comp.toString();
    }

    public int countAtoms(){
        int atoms = 0;

        for (int i = 0; i<components.size(); i++)
            atoms += Integer.parseInt(components.get(i).getLicznosc());

        return atoms;
    }


}//koniec klasy
