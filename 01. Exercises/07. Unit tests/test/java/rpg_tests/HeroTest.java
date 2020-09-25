package rpg_tests;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import rpg_lab.Hero;
import rpg_lab.Target;
import rpg_lab.Weapon;

public class HeroTest {
    private static final int DEFAULT_XP=10;
    private static final int DEFAULT_ATTACK_POINTS=10;
    private static final int DEFAULT_TARGET_HEALTH=0;
    private static final int DEFAULT_DURABILITY_POINTS=0;
    private static final boolean DEFAULT_IS_TARGET_DEAD=Boolean.TRUE;
    private static final String HERO_NAME="Stamat";

    @Test
    public void attackGainsExperienceIfTargetIsDead(){
        Target mockTarget= Mockito.mock(Target.class);
        Mockito.when(mockTarget.giveExperience()).thenReturn(10);
        Mockito.when(mockTarget.isDead()).thenReturn(true);
        Mockito.when(mockTarget.getHealth()).thenReturn(0);

        Weapon mockWeapon= Mockito.mock(Weapon.class);
        Mockito.when(mockWeapon.getAttackPoints()).thenReturn(10);
        Mockito.when(mockWeapon.getDurabilityPoints()).thenReturn(0);

        /*Target target=new Target() {
            @Override
            public int getHealth() {
                return DEFAULT_TARGET_HEALTH;
            }

            @Override
            public void takeAttack(int attackPoints) { }

            @Override
            public int giveExperience() {
                return DEFAULT_XP;
            }

            @Override
            public boolean isDead() {
                return DEFAULT_IS_TARGET_DEAD;
            }
        };

        Weapon weapon=new Weapon() {
            @Override
            public int getAttackPoints() {
                return DEFAULT_ATTACK_POINTS;
            }

            @Override
            public int getDurabilityPoints() {
                return DEFAULT_DURABILITY_POINTS;
            }

            @Override
            public void attack(Target target) { }
        };*/

        Hero hero=new Hero(mockWeapon,HERO_NAME);
        hero.attack(mockTarget);

        Assert.assertEquals(DEFAULT_XP,hero.getExperience());

    }
}
