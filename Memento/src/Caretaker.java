import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<storedstate> statelist = new ArrayList<storedstate>();

    public void add(storedstate state){
        statelist.add(state);
    }

    public storedstate get(int index){
        return statelist.get(index);
    }
}