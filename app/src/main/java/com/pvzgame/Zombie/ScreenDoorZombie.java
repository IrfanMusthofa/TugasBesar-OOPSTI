package com.pvzgame.Zombie;

public class ScreenDoorZombie extends Zombie {
   
    // Constructor
    public ScreenDoorZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieType(8);
        setZombieName("ScreenDoorZombie");
        setZombieHealth(400);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(2);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }

    @Override
    public void slowZombie() {
        if (!getHasTool()){
            setZombieMoveSpeed(getZombieMoveSpeed()/2);
            setZombieAttackSpeed(getZombieAttackDamage()/2);
        }
    }
}
