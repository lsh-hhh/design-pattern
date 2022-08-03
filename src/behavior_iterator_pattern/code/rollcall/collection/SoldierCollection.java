package behavior_iterator_pattern.code.rollcall.collection;

import behavior_iterator_pattern.code.rollcall.iterator.Iterator;
import behavior_iterator_pattern.code.rollcall.iterator.SoldierIterator;

import java.util.Arrays;

public class SoldierCollection extends BaseCollection<Soldier>{

    private Soldier[] soldiers;

    private int length;

    /**
     * 指向下一个位置，并且也表明数组下标位置
     */
    private int size;


    public SoldierCollection(Soldier[] soldiers) {
        this.soldiers = soldiers;
        length = soldiers.length;
        size = soldiers.length;
    }

    @Override
    public Iterator<Soldier> createIterator() {
        return new SoldierIterator(this);
    }

    @Override
    public void add(Soldier soldier) {
        // 扩容
        if (size >= length) {
            length = length << 1;
            soldiers = Arrays.copyOf(soldiers, length);
        }
        soldiers[size] = soldier;
        size++;
    }

    @Override
    public void remove(Soldier soldier) {
        int temp = size;
        // 移除最后一个
        for (int i = size; i >= 0; i--) {
            if (soldiers[i] == soldier) {
                soldiers[i] = null;
                temp = i;
                break;
            }
        }

        // temp后面的元素向前进一位
        if (size - 1 >= temp) {
            System.arraycopy(soldiers, temp + 1, soldiers, temp, size - 1 - temp);
            size--;
        }
    }

    @Override
    public void addAll(Soldier... t) {
        int newLength = (t.length + size) << 1;

        Soldier[] soldiers1 = new Soldier[newLength];
        System.arraycopy(soldiers, 0, soldiers1, 0, size);
        System.arraycopy(t, 0, soldiers1, size, t.length);
        soldiers = soldiers1;
        size = t.length + size;
        length = newLength;
    }

    public Soldier[] getSoldiers() {
        return soldiers;
    }

    @Override
    public int size() {
        return size;
    }
}
