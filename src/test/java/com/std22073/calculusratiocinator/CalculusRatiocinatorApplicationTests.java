package com.std22073.calculusratiocinator;

import com.std22073.calculusratiocinator.model.Affirmation;
import com.std22073.calculusratiocinator.conjonctions.Et;
import com.std22073.calculusratiocinator.conjonctions.Donc;
import com.std22073.calculusratiocinator.conjonctions.Ou;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculusRatiocinatorApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testCalculerValeurDeVerite() {
        Affirmation louBeau = new Affirmation("Lou est beau.", Affirmation.TypeAffirmation.VERITE);
        Affirmation louPauvre = new Affirmation("Lou est pauvre.", Affirmation.TypeAffirmation.MENSONGE);
        Affirmation louGenereux = new Affirmation("Lou est généreux.", Affirmation.TypeAffirmation.SIMPLE);

        Et louPauvreEtLouGenereux = new Et(louPauvre, louGenereux);
        Donc louBeauDoncLouPauvre = new Donc(louBeau, louPauvre);
        Donc louPauvreDoncLouGenereux = new Donc(louPauvre, louGenereux);
        Ou louBeauOuLouGenereux = new Ou(louBeau, louGenereux);

        System.out.println("Lou est pauvre et Lou est généreux? " + louPauvreEtLouGenereux.estVrai());
        System.out.println("Si Lou est beau alors Lou est pauvre? " + louBeauDoncLouPauvre.estVrai());
        System.out.println("Si Lou est pauvre alors Lou est généreux? " + louPauvreDoncLouGenereux.estVrai()); 
        System.out.println("Lou est beau ou Lou est généreux? " + louBeauOuLouGenereux.estVrai()); 
    }
}
