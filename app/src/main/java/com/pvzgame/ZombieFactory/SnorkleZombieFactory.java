package com.pvzgame.ZombieFactory;
import com.pvzgame.Zombie.SnorkleZombie;

public class SnorkleZombieFactory implements ZombieFactory<SnorkleZombie> {
    public SnorkleZombie create(int birthTime) {
        return new SnorkleZombie(birthTime);
    }
}

