import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PCTest {

    @Test
    public void constructerTest(){
        Dimension dimension1 = new Dimension(1,1,20);

        Case case1 = new Case("chromebook", "microsoft", "usc", dimension1);

        Motherboard motherboard1 = new Motherboard("dell",
                "microsoft",
                500,
                30,
                "best computer ever!"
        );

        Resolution resolution1 = new Resolution(50,50);

        Moniter moniter1 = new Moniter(resolution1,"microsoft",14);

        PC pc1 = new PC(case1,motherboard1, moniter1);

        assertEquals(case1, pc1.getCase1());

        assertEquals(motherboard1, pc1.getMotherboard());

        assertEquals(moniter1, pc1.getMoniter());

    }


}