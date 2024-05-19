package com.pvzgame.ZombieFactory;

import com.pvzgame.Zombie.ScreenDoorZombie;

public class ScreenDoorZombieFactory implements ZombieFactory<ScreenDoorZombie> {
    @Override
    public ScreenDoorZombie create(int birthTime, int currentRow) {
        return new ScreenDoorZombie(birthTime, currentRow);
    }
}
