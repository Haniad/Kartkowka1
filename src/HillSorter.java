import java.util.ArrayList;
import java.util.Comparator;

public class HillSorter implements Comparator<ChemicalComponent> {

    private ArrayList<ChemicalComponent> components;

    public HillSorter(ArrayList<ChemicalComponent> components) {
        this.components = components;
    }

    private ArrayList<ChemicalComponent> carbon() {

        ArrayList<ChemicalComponent> list = new ArrayList<>();

        for (int i = 0; i < components.size(); i++) {

            if (components.get(i).getSymbol().equals("C")) {
                list.add(components.get(i));
                components.remove(i);
            }
        }

        for (int i = 0; i < components.size(); i++) {

            if (components.get(i).getSymbol().equals("H")) {
                list.add(components.get(i));
                components.remove(i);
            }
        }

        return list;
    }

    public ArrayList<ChemicalComponent> sortComponents() {
ArrayList<ChemicalComponent> list = null;
      return list;
    }


    @Override
    public int compare(ChemicalComponent o1, ChemicalComponent o2) {
        return o1.getSymbol().compareTo(o2.getSymbol());
    }
}
