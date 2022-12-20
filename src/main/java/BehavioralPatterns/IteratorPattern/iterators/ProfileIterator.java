package BehavioralPatterns.IteratorPattern.iterators;

import BehavioralPatterns.IteratorPattern.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
