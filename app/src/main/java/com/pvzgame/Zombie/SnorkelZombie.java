package com.pvzgame.Zombie;
import com.pvzgame.*;

public class SnorkelZombie extends Zombie {
    
    // Constructor
    public SnorkelZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieType(9);
        setZombieName("SnorkelZombie");
        setZombieHealth(125);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(2);

        setIsAquatic(true);
        setIsHidden(true);
        setIsSlowed(false);
        setHasTool(true);   
    }

    @Override
    public void zombieAction(Map map, int row, int col){
        if (getZombieHealth() <= 125){ // pengecekan tool dan mengubah status tool
            setHasTool(false);
        }
        if (map.getTile(row, col).getPlant() != null){ // mengecek ada tanaman atau tidak
            setIsHidden(false);
            map.getTile(row, col).getPlant().plantAttacked(getZombieAttackDamage()*getZombieAttackSpeed());
        } 
        else {
            setIsHidden(true);
            addCurrentMovePoints(getZombieMoveSpeed()); // movemodifier defaultnya 2 jadinya movetime setiap detik nambah 2
            if (getCurrentMovePoints() <= getMovePoint()){ // apakah sudah waktunya bergerak
                moveForward(map, row, col);
                resetCurrentMovePoints();
            }
        }
    }
}
