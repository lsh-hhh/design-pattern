package behavior_iterator_pattern.code.social.iterators;

import behavior_iterator_pattern.code.social.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
