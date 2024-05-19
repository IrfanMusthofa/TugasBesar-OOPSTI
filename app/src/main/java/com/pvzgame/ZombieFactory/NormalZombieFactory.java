package com.pvzgame.ZombieFactory;

import com.pvzgame.Zombie.NormalZombie;

public class NormalZombieFactory implements ZombieFactory<NormalZombie> {
    @Override
    public NormalZombie create(int birthTime, int currentRow) {
        return new NormalZombie(birthTime, currentRow);
    }
}
