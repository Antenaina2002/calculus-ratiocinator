package com.std22073.calculusratiocinator.conjonctions;
import com.std22073.calculusratiocinator.model.Affirmation;
import com.std22073.calculusratiocinator.model.Conjonction;

public class Et extends Conjonction {

    public Et(Affirmation affirmation1, Affirmation affirmation2) {
        super(affirmation1, affirmation2);
    }

    @Override
    public boolean estVrai() {
        return evaluerVerite(getAffirmation1()) && evaluerVerite(getAffirmation2());
    }

    private boolean evaluerVerite(Affirmation affirmation) {
        switch (affirmation.getType()) {
            case SIMPLE:
                return false;
            case VERITE:
                return true;
            case MENSONGE:
                return false;
            default:
                throw new IllegalArgumentException("Type d'affirmation inattendu");
        }
    }
}
