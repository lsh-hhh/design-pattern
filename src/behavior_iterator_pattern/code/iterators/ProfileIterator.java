package behavior_iterator_pattern.code.iterators;

import behavior_iterator_pattern.code.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
