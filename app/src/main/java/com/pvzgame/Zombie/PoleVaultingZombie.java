package com.pvzgame.Zombie;

public class PoleVaultingZombie extends Zombie{

    // Constructor
    public PoleVaultingZombie(int birthTime, int currentRow) {
        setBirthTime(birthTime);
        setZombieName("PoleVaultingZombie");

        setZombieHealth(175);
        setZombieAttackDamage(75);
        setZombieAttackSpeed(2);
        setZombieMoveSpeed(3);
        setCurrentCol(11);
        setCurrentRow(currentRow);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }

    @Override
    public void zombieAction() {
        if (getZombieHealth() <= 125){ // pengecekan tool dan mengubah status tool
            setHasTool(false);
            if (getIsSlowed()){
                setZombieMoveSpeed(8);
            }
            else {
                setZombieMoveSpeed(4);
            }
        }
        if (getCurrentTile().getPlant() != null){
            if (getHasTool()){// hasTool()
                moveForward();
                setHasTool(false);
            } 
            else {
                // attack
                // getCurrentTile().getPlant().attack();
            }
        } 
        else {
            if (true){ // (currenttime - birthtime) % movespeed >= 1
                moveForward();
            }
        }
    }
}
