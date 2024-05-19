package com.pvzgame.Zombie;

public class ScreenDoorZombie extends Zombie {
   
    // Constructor
    public ScreenDoorZombie(int birthTime, int currentRow) {
        setBirthTime(birthTime);
        setZombieName("ScreenDoorZombie");

        setZombieHealth(400);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);
        setCurrentCol(11);
        setCurrentRow(currentRow);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }

    @Override
    public void SlowZombie() {
        if (!getHasTool()){
            setZombieMoveSpeed(getZombieMoveSpeed()*2);
        }
    }
}
