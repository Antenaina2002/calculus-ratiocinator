package com.std22073.calculusratiocinator.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString(of = "proposition")
public class Affirmation {

    private final String proposition;
    private final TypeAffirmation type;
    
    public void afficherValeurDeVerite() {
        System.out.println("Je ne sais pas comment calculer la valeur de vérité de cette affirmation.");
    }
}
