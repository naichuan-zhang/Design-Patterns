package com.refactoring_guru.mediator.components;

import com.refactoring_guru.mediator.mediators.Mediator;

/**
 * Common component interface.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
