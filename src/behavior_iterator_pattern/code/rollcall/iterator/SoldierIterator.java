package behavior_iterator_pattern.code.rollcall.iterator;

import behavior_iterator_pattern.code.rollcall.collection.Soldier;
import behavior_iterator_pattern.code.rollcall.collection.SoldierCollection;

public class SoldierIterator implements Iterator<Soldier>{

    private final Soldier[] soldiers;

    private int cursor;

    private int size;

    public SoldierIterator(SoldierCollection soldierCollection) {
        this.soldiers = soldierCollection.getSoldiers();
        this.size = soldierCollection.size();
    }


    @Override
    public boolean hasNext() {
        return cursor < size;
    }

    @Override
    public Soldier getNext() {
        if (!hasNext()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Soldier soldier = soldiers[cursor];
        cursor++;
        return soldier;
    }
}
