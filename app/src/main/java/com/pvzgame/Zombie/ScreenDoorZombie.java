package com.pvzgame.Zombie;

public class ScreenDoorZombie extends Zombie{
    public ScreenDoorZombie(String name, int health, int attackDamage, int attackSpeed, int timeCreated, int currentCol, int zombieType, String zombieName, int moveSpeed, boolean isSlowed, boolean isHidden, boolean waterBased, boolean hasTool) {
        super(name, health, attackDamage, attackSpeed, timeCreated, currentCol, zombieType, zombieName, moveSpeed, isSlowed, isHidden, waterBased, hasTool);
    }

    @Override
    public void SlowZombie() {
        if (!hasTool()){
            this.moveSpeed = moveSpeed / 2;
            this.isSlowed = true;
        }
    }
}
