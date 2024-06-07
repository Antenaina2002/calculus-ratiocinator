package com.std22073.calculusratiocinator.conjonctions;
import com.std22073.calculusratiocinator.model.Affirmation;
import com.std22073.calculusratiocinator.model.Conjonction;
import com.std22073.calculusratiocinator.model.TypeAffirmation;

public class Et extends Conjonction {

    public Et(Affirmation affirmation1, Affirmation affirmation2) {
        super(affirmation1, affirmation2);
    }

    @Override
    public boolean estVrai() {
        return evaluerVerite(getAffirmation1()) && evaluerVerite(getAffirmation2());
    }

    private boolean evaluerVerite(Affirmation affirmation) {
        TypeAffirmation type = affirmation.getType();
        if (type == TypeAffirmation.VERITE) {
            return true;
        } else if (type == TypeAffirmation.MENSONGE) {
            return false;
        }
        return false;
    }
}
