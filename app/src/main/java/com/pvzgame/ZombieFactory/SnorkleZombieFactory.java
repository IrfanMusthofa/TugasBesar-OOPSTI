package com.pvzgame.ZombieFactory;

import com.pvzgame.Zombie.SnorkleZombie;

public class SnorkleZombieFactory implements ZombieFactory<SnorkleZombie> {
    @Override
    public SnorkleZombie create(int birthTime, int currentRow) {
        return new SnorkleZombie(birthTime, currentRow);
    }
}