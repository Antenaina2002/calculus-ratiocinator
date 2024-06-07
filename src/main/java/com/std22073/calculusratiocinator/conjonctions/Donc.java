package com.std22073.calculusratiocinator.conjonctions;

import com.std22073.calculusratiocinator.model.Affirmation;
import com.std22073.calculusratiocinator.model.Conjonction;
import com.std22073.calculusratiocinator.model.TypeAffirmation;

public class Donc extends Conjonction {

    public Donc(Affirmation affirmation1, Affirmation affirmation2) {
        super(affirmation1, affirmation2);
    }

    @Override
    public boolean estVrai() {
        return !evaluerVerite(getAffirmation1()) || evaluerVerite(getAffirmation2());
    }

    private boolean evaluerVerite(Affirmation affirmation) {
        TypeAffirmation type = affirmation.getType();
        return type == TypeAffirmation.VERITE;
    }
}