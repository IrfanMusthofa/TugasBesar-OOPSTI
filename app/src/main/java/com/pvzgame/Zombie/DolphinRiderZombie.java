package com.pvzgame.Zombie;
import com.pvzgame.*;

public class DolphinRiderZombie extends Zombie {
    
    // Constructor
    public DolphinRiderZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieType(3);
        setZombieName("DolphinRiderZombie");
        setZombieHealth(175);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(4);

        setIsAquatic(true);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }

    @Override
    public void zombieAction(Map map, int row, int col){
        if (getZombieHealth() <= 125){ // pengecekan tool dan mengubah status tool
            setHasTool(false);
            if (!getHasTool()){
                setZombieMoveSpeed(2);
            }
        }
        
        if (map.getTile(row, col).getPlant() != null){ // mengecek ada tanaman atau tidak
            if (getHasTool()){ // jika punya tool
                moveForward(map, row, col);
                setHasTool(false);
                resetCurrentMovePoints();
                map.getTile(row, col).removePlant();
            } 
            else {
                map.getTile(row, col).getPlant().plantAttacked(getZombieAttackDamage()*getZombieAttackSpeed());
            }
        } 
        else {
            addCurrentMovePoints(getZombieMoveSpeed()); // movemodifier defaultnya 2 jadinya movetime setiap detik nambah 2
            if (getCurrentMovePoints() <= getMovePoint()){ // apakah sudah waktunya bergerak
                moveForward(map, row, col);
                resetCurrentMovePoints();
            }
        }
    }
}
