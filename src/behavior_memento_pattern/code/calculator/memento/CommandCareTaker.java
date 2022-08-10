package behavior_memento_pattern.code.calculator.memento;

import java.util.ArrayList;
import java.util.List;

public class CommandCareTaker {

    private final List<Memento> mementos = new ArrayList<>();

    public void saveMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento popMemento() {
        if (mementos.size() > 0) {
            return mementos.remove(mementos.size() -1);
        }
        return null;
    }
}
