package com.pvzgame.Zombie;

public class NewsPaperZombie extends Zombie{
    
    //constructor
    public NewsPaperZombie(int birthTime, int currentRow) {
        setBirthTime(birthTime);
        setZombieName("NewsPaperZombie");

        setZombieHealth(200);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);
        setCurrentCol(currentCol);
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
                setZombieMoveSpeed(4);
            }
            else {
                setZombieMoveSpeed(2);
            }
        }
        if (getCurrentTile().getPlant() != null){// tile.getPlant() != null
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
