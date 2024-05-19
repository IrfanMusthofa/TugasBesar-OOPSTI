package com.pvzgame.Zombie;

public class DuckyTubeZombie extends Zombie{
        
        //constructor
        public DuckyTubeZombie(int birthTime, int currentRow) {
            setBirthTime(birthTime);
            setZombieName("DuckyTubeZombie");
    
            setZombieHealth(100);
            setZombieAttackDamage(100);
            setZombieAttackSpeed(1);
            setZombieMoveSpeed(4);
            setCurrentCol(11);
            setCurrentRow(currentRow);
    
            setIsAquatic(true);
            setIsHidden(false);
            setIsSlowed(false);
            setHasTool(false);   
        }
}
