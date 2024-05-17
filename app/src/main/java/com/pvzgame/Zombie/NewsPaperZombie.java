package com.pvzgame.Zombie;

public class NewsPaperZombie extends Zombie{
    
    public NewsPaperZombie(String name, int health, int attackDamage, int attackSpeed, int timeCreated, int currentCol, int zombieType, String zombieName, int moveSpeed, boolean isSlowed, boolean isHidden, boolean waterBased, boolean hasTool) {
        super(name, health, attackDamage, attackSpeed, timeCreated, currentCol, zombieType, zombieName, moveSpeed, isSlowed, isHidden, waterBased, hasTool);
    }

    @Override
    public void destroyTool() {
        hasTool = false;
        this.moveSpeed = moveSpeed * 2;
    }
}
