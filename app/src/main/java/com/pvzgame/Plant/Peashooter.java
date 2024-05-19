package com.pvzgame.Plant;
import com.pvzgame.Zombie;

public class Peashooter extends Plant {
    
    public void attack(Zombie zombie){
        zombie.attacked(this.getAttackDamage());
    }

}
