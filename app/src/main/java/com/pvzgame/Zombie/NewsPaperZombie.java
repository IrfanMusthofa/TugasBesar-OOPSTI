package com.pvzgame.Zombie;
import com.pvzgame.*;

public class NewsPaperZombie extends Zombie {
    
    // Constructor
    public NewsPaperZombie(int birthTime) {
        setBirthTime(birthTime);
        setZombieType(6);
        setZombieName("NewsPaperZombie");
        setZombieHealth(200);
        setZombieAttackDamage(100);
        setZombieAttackSpeed(1);
        setZombieMoveSpeed(2);

        setIsAquatic(false);
        setIsHidden(false);
        setIsSlowed(false);
        setHasTool(true);   
    }

    @Override
    public void zombieAction(Map map, int row, int col){
        if (getZombieHealth() <= 125){ // pengecekan tool dan mengubah status tool
            setHasTool(false);
            if (!getHasTool()){
                setZombieMoveSpeed(4);
                setZombieAttackSpeed(2);
            }
        }
        
        if (map.getTile(row, col).getPlant() != null){ // mengecek ada tanaman atau tidak
            map.getTile(row, col).getPlant().plantAttacked(getZombieAttackDamage()*getZombieAttackSpeed());
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
