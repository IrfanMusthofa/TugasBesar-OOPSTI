package com.pvzgame.Zombie;

public class PoleVaultingZombie extends Zombie{

    public PoleVaultingZombie(String name, int health, int attackDamage, int attackSpeed, int timeCreated, int currentCol, int zombieType, String zombieName, int moveSpeed, boolean isSlowed, boolean isHidden, boolean waterBased, boolean hasTool) {
        super(name, health, attackDamage, attackSpeed, timeCreated, currentCol, zombieType, zombieName, moveSpeed, isSlowed, isHidden, waterBased, hasTool);
    }

    public void jumpOver(){
        // jump over the plant
    }

    @Override
    public void destroyTool() {
        hasTool = false;
        this.moveSpeed = moveSpeed / 2;
    }
}
