package rpg_tests;

import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;


    public class AxeTests {

        @Test
        public void ifWeaponLosesDurabilityAfterEachAttack(){
            Axe axe=new Axe(10,10);
            Dummy dummy=new Dummy(20,10);

            axe.attack(dummy);

            Assert.assertEquals(9, axe.getDurabilityPoints());
        }

        @Test(expected = IllegalStateException.class)
        public void attackWithBrokenWeapongShouldThrowException(){
            Axe axe=new Axe(10,-1);
            Dummy dummy=new Dummy(20,10);
            axe.attack(dummy);

        }

        @Test
        public void deadDummyCanGiveXp(){
            Dummy dummy=new Dummy(20,10);
            dummy.takeAttack(25);

        }

    }


