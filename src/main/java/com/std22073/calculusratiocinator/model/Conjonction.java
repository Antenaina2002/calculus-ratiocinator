package com.std22073.calculusratiocinator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class Conjonction {

    private final Affirmation affirmation1;
    private final Affirmation affirmation2;

    public abstract boolean estVrai();
}
