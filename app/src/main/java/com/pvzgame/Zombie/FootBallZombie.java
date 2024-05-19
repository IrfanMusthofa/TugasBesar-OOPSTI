package com.pvzgame.Zombie;

public class FootBallZombie extends Zombie {
    
    // Constructor
    public FootBallZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieName("FootballZombie");
        setZombieHealth(500);
        setZombieAttackDamage(75);
        setZombieAttackSpeed(2);
        setZombieMoveSpeed(3);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }
}