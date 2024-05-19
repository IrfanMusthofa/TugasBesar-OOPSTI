package com.pvzgame.ZombieFactory;

import com.pvzgame.Zombie.NewsPaperZombie;

public class NewsPaperZombieFactory implements ZombieFactory<NewsPaperZombie> {
    @Override
    public NewsPaperZombie create(int birthTime, int currentRow) {
        return new NewsPaperZombie(birthTime, currentRow);
    }
}