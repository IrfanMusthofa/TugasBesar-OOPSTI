package com.pvzgame.ZombieFactory;

import com.pvzgame.Zombie.ConeHeadZombie;

public class ConeHeadZombieFactory implements ZombieFactory<ConeHeadZombie> {
    @Override
    public ConeHeadZombie create(int birthTime, int currentRow) {
        return new ConeHeadZombie(birthTime, currentRow);
    }
}