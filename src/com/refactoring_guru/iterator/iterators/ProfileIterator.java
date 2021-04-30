package com.refactoring_guru.iterator.iterators;

import com.refactoring_guru.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();
    Profile getNext();
    void reset();
}
