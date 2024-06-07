package com.std22073.calculusratiocinator.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public abstract class Conjonction {

    private final Affirmation affirmation1;
    private final Affirmation affirmation2;

    public abstract boolean estVrai();
}
