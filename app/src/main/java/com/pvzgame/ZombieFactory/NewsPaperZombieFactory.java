package com.pvzgame.ZombieFactory;
import com.pvzgame.Zombie.NewspaperZombie;

public class NewspaperZombieFactory implements ZombieFactory<NewspaperZombie> {
    public NewspaperZombie create(int birthTime) {
        return new NewspaperZombie(birthTime);
    }
}

