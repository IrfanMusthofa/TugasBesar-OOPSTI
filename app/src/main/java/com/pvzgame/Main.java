package com.pvzgame;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

import com.pvzgame.Plant.*; // Import All the Plant class
import com.pvzgame.PlantFactory.*; // Import All the PeashooterFactory class
import com.pvzgame.Zombie.*; // Import All the Zombie class
import com.pvzgame.ZombieFactory.*; // Import All the ZombieFactory class

public class Main {
    
    public static int gameTime;
    public static Boolean gameRunning = false;
    public static Boolean gameOver = false;

    public static void main(String[] args) throws Exception {

        // // Driver for Plant
        // Plant plant1 = new PeashooterFactory().create(5);
        // System.out.println(plant1.getPlantName());
        // System.out.println(plant1.getIsWaterType());

        // System.out.println("=====================================");

        // Plant plant2 = new KelpFactory().create(10);
        // System.out.println(plant2.getPlantName());
        // System.out.println(plant2.getBirthTime());
        // System.out.println(plant2.getIsWaterType());

        // System.out.println("=====================================");
        // // Driver for Peashooter
        // Plant plant3 = new JalapenoFactory().create(100);
        // System.out.println(plant3.getPlantName());
        // System.out.println(plant3.getIsWaterType());
     
        // System.out.println("=====================================");
        // Plant plant4 = new LilypadFactory().create(100);
        // System.out.println(plant4.getPlantName());
        // System.out.println(plant4.getIsWaterType());

        // System.out.println("=====================================");

        // Plant plant5 = new SunflowerFactory().create(100);
        // System.out.println(plant5.getPlantName());
        // System.out.println(plant5.getIsWaterType());

        // System.out.println("=====================================");

        // Plant plant6 = new WallnutFactory().create(100);
        // System.out.println(plant6.getPlantName());
        // System.out.println(plant6.getIsWaterType());

        // System.out.println("=====================================");

        // Plant plant7 = new PotatoMineFactory().create(100);
        // System.out.println(plant7.getPlantName());
        // System.out.println(plant7.getIsWaterType());

        // System.out.println("=====================================");

        // Plant plant8 = new SnowpeaFactory().create(100);
        // System.out.println(plant8.getPlantName());
        // System.out.println(plant8.getIsWaterType());

        // System.out.println("=====================================");

        // Plant plant9 = new SquashFactory().create(100);
        // System.out.println(plant9.getPlantName());
        // System.out.println(plant9.getIsWaterType());

        // System.out.println("=====================================");

        // Plant plant10 = new RepeaterFactory().create(100);
        // System.out.println(plant10.getPlantName());
        // System.out.println(plant10.getIsWaterType());

        // System.out.println("=====================================");
        // System.out.println("ZOMBIE ONLY)");

        // Zombie zombie1 = new BucketHeadZombieFactory().create(5);
        // System.out.println(zombie1.getZombieName());
        // System.out.println(zombie1.getHasTool());
        // System.out.println(zombie1.getIsAquatic());
        // System.out.println(zombie1.getIsHidden());


        // System.out.println("=====================================");

        // Zombie zombie2 = new ConeHeadZombieFactory().create(5);
        // System.out.println(zombie2.getZombieName());
        // System.out.println(zombie2.getHasTool());
        // System.out.println(zombie2.getIsAquatic());
        // System.out.println(zombie2.getIsHidden());

        // System.out.println("=====================================");

        // Zombie zombie3 = new DolphinRiderZombieFactory().create(5);
        // System.out.println(zombie3.getZombieName());
        // System.out.println(zombie3.getHasTool());
        // System.out.println(zombie3.getIsAquatic());
        // System.out.println(zombie3.getIsHidden());

        // System.out.println("=====================================");

        // Zombie zombie4 = new DuckyTubeZombieFactory().create(5);
        // System.out.println(zombie4.getZombieName());
        // System.out.println(zombie4.getHasTool());
        // System.out.println(zombie4.getIsAquatic());
        // System.out.println(zombie4.getIsHidden());

        // System.out.println("=====================================");

        // Zombie zombie5 = new FootBallZombieFactory().create(5);
        // System.out.println(zombie5.getZombieName());
        // System.out.println(zombie5.getHasTool());
        // System.out.println(zombie5.getIsAquatic());
        // System.out.println(zombie5.getIsHidden());

        // System.out.println("=====================================");

        // Zombie zombie6 = new NewsPaperZombieFactory().create(5);
        // System.out.println(zombie6.getZombieName());
        // System.out.println(zombie6.getHasTool());
        // System.out.println(zombie6.getIsAquatic());
        // System.out.println(zombie6.getIsHidden());

        // System.out.println("=====================================");

        // Zombie zombie7 = new PoleVaultingZombieFactory().create(5);
        // System.out.println(zombie7.getZombieName());
        // System.out.println(zombie7.getHasTool());
        // System.out.println(zombie7.getIsAquatic());

        // System.out.println("=====================================");

        // Zombie zombie8 = new SnorkelZombieFactory().create(5);
        // System.out.println(zombie8.getZombieName());
        // System.out.println(zombie8.getHasTool());
        // System.out.println(zombie8.getIsAquatic());
        // System.out.println(zombie8.getIsHidden());

        // System.out.println("=====================================");

        // Zombie zombie9 = new NormalZombieFactory().create(5);
        // System.out.println(zombie9.getZombieName());
        // System.out.println(zombie9.getHasTool());
        // System.out.println(zombie9.getIsAquatic());
        // System.out.println(zombie9.getIsHidden());

        // System.out.println("=====================================");

        // Zombie zombie10 = new ScreenDoorZombieFactory().create(5);
        // System.out.println(zombie10.getZombieName());
        // System.out.println(zombie10.getHasTool());
        // System.out.println(zombie10.getIsAquatic());
        // System.out.println(zombie10.getIsHidden());

        // System.out.println("=====================================");
        
        

        // Deck<Plant> deck = new Deck<>();
        // Plant plant100 = new JalapenoFactory().create(5);
        // Plant plant20 = new KelpFactory().create(10);
        // Plant plant30 = new LilypadFactory().create(15);
        // Plant plant40 = new PeashooterFactory().create(20);
        // Plant plant50 = new PotatoMineFactory().create(25);
        // Plant plant60 = new RepeaterFactory().create(30);
        // Plant plant70 = new SnowpeaFactory().create(35);
        // Plant plant80 = new SquashFactory().create(40);
        // Plant plant90 = new SunflowerFactory().create(45);
        // Plant plant1000 = new WallnutFactory().create(50);

        // deck.addPlant(plant100);
        // deck.addPlant(plant20);
        // deck.addPlant(plant30);
        // deck.addPlant(plant40);
        // deck.addPlant(plant50);
        // deck.addPlant(plant60);
        // deck.addPlant(plant70);
        // deck.addPlant(plant80);
        // deck.addPlant(plant90);
        // deck.addPlant(plant1000);

        
        // deck.printDeck();

        // deck.swapPlant(1,3);
        // deck.printDeck();
        // deck.swapPlant(1,3);
        // deck.printDeck();
        // deck.swapPlant(1,100);
        // // Driver for Map
        // System.out.println("MAP: ");
        // Map map = Map.getInstance();
        // map.printMap();

        // System.out.println("=====================================");
        // Inventory inventory = new Inventory();
        // Deck<Plant> deck5 = new Deck<>();
        // inventory.printInventory();
        // try {
        //     inventory.pickPlant(new Jalapeno(0), deck5);
        //     inventory.pickPlant(new Kelp(0), deck5);
        //     inventory.pickPlant(new Lilypad(0), deck5);
        //     inventory.pickPlant(new Peashooter(0), deck5);
        //     inventory.pickPlant(new PotatoMine(0), deck5);
        //     inventory.pickPlant(new Repeater(0), deck5);
        //     inventory.pickPlant(new Snowpea(0), deck5);
        //     inventory.pickPlant(new Squash(0), deck5);
        //     inventory.pickPlant(new Sunflower(0), deck5);
        //     inventory.pickPlant(new Wallnut(0), deck5);
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }

        // inventory.printInventory();
        // deck5.printDeck();

        // inventory.removePlant(0, deck5);
        // inventory.printInventory();
        // deck5.printDeck();



        // // =============== ENUM =======

                
        // // Create an instance of GameAction
        // GameAction gameAction = new GameAction();

        // // Access the values of the aquaticZombie enum
        // for (ZombieEnum.aquaticZombie zombie : gameAction.aquaticZombie) {
        //     System.out.println(zombie);
        // }

        // System.out.println("==========");
        // // Access the values of the landZombie enum
        // for (ZombieEnum.landZombie zombie : gameAction.landZombie) {
        //     System.out.println(zombie);
        // }

//  END OF DRIVER

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Michael vs Lalapan!\n");
        Deck deck = new Deck();
        Inventory inventory = new Inventory();

        Menu.printMenu();
        int command = 0;

        // Game Menu Loop Condition
        while (true) {
            try {
                
                // Input command
                command = Integer.parseInt(scanner.nextLine());

                if (command == 1) {
                    System.out.println("\nPersiapkan Deck!");
                    gameStart(scanner);
                } else if (command == 2) {
                    Menu.printMenu();
                } else if (command == 3) {
                    Menu.printPlantList();
                } else if (command == 4) {
                    Menu.printZombieList();
                } else if (command == 5) {
                    System.out.println("\nThank You for Playing!\nExiting game...");
                    scanner.close();
                    break;
                } else throw new IllegalArgumentException("\n===== Command tidak valid, masukkan command yang benar! =====");
            } catch (IllegalArgumentException e) {
                System.out.println("\n===== Command tidak valid, masukkan command yang benar! =====");
            }
        }
    }

    public static void gameStart(Scanner scanner) {
   
        // Preparation
        gameRunning = true;
        gameTime = 0;
        Random random = new Random(); // Random number generator
        Sun sun = Sun.getInstance(); // Starting Sun = 50
        Map map = Map.getInstance();
        Deck<Plant> deck = new Deck<>();
        Inventory inventory = new Inventory();
        GameAction action = new GameAction();

        prepareDeck(scanner, deck, inventory);
        System.out.println(" ");
        System.out.println("Game Started!");

        // timeThread: Sun Spawner, Zombie Spawner, GameOver Check, Win Check, gameTime increment
        Thread timeThread = new Thread(() -> {
            int sunLastSpawn = 0;
            Boolean timeHasReset = false;

            while (gameRunning) {
                try {

                    // Sun Spawner
                    // Spawn sun randomly every 5 < gameTime < 10
                    if (gameTime <= 100) {
                        if (gameTime - sunLastSpawn >= (random.nextInt(6, 10))) {
                            sun.addSun(50);
                            sunLastSpawn = gameTime;
                        }
                    }

                    // Zombie Spawner
                    if (gameTime >= 20 && gameTime <= 160) {
                        for (int i = 0; i < 6; i++) {
                            if (random.nextFloat() < 0.3) {
                                action.zombieSpawner(map.getTile(i, 10));
                            }
                        }
                    }

                    // Wave Zombie Spawner
                    if (gameTime >= 110 && gameTime <= 114) {
                        for (int i = 0; i < 6; i++) {
                            if (random.nextFloat() < 0.8) {
                                action.zombieSpawner(map.getTile(i, 10));
                            }
                        }
                    }

                    // GameOver Check
                    for (int j = 0; j < 6; j++) {
                        if (!map.getTile(j, 0).getZombies().isEmpty()) {
                            gameRunning = false;
                            gameOver = true;
                            break;
                        }
                    }

                    // Win Check
                    if (!timeHasReset && gameTime > 160) { // 160-200s
                        Boolean winCheck = true;
                        // check if there is no more zombies in map
                        for(int i = 0; i < 6; i++) {
                            for (int j = 1; j < 11; j++) {
                                if (!map.getTile(i, j).getZombies().isEmpty()) {
                                    winCheck = false;
                                }
                            }
                        }
                        if (winCheck) {
                            gameRunning = false;
     
                        }
                    } else if (timeHasReset) {
                        Boolean winCheck = true;
                        // check if there is no more zombies in map
                        for(int i = 0; i < 6; i++) {
                            for (int j = 1; j < 11; j++) {
                                if (!map.getTile(i, j).getZombies().isEmpty()) {
                                    winCheck = false;
                                }
                            }
                        }
                        if (winCheck) {
                            gameRunning = false;
                        }
                    }
            
                    // gameTime increment
                    Thread.sleep(1000); // 1s sleep
                    gameTime++;

                    if (gameTime == 200) {
                        gameTime = 0; // Reset to Day
                        timeHasReset = true;
                    }


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (gameOver) {
                System.out.println("\n===== You lose! =====\n===== Game Over! =====");
            } else {
                System.out.println("\n===== You win! =====\n===== Game Over! =====");
            }
        });

        timeThread.start();

        // userThread: user Input
        
        map.printMap(); // Initial Map
        while(gameRunning) {
            try {
                System.out.println("\n*** Game Time: " + gameTime + "s ***");
                System.out.println("Sun: " + sun.getSunPoints());
                System.out.println("\nCommand: ");
                System.out.println("(1)       : Print Map");
                System.out.println("(2 x y z) : Tanam Plant ke-z dari Deck di baris x dan kolom y");
                System.out.println("(3 x y)   : Cabut Plant di baris x dan kolom y");
                int userInput = 0;
                userInput = scanner.nextInt();

                if (userInput == 1) {
                    map.printMap();
                } else if (userInput == 2){
                    try {
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        int z = scanner.nextInt();
                        System.out.println("Ini 2");
                        // action

                    } catch (InputMismatchException e) {
                        System.out.println("\n===== Command tidak valid ======");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("\n===== Command tidak valid ======");
                    }

                } else if (userInput == 3) {
                    try {
                        int x = scanner.nextInt();
                        int y = scanner.nextInt();
                        System.out.println("ini 3");
                        // action

                    } catch (InputMismatchException e) {
                        System.out.println("\n===== Command tidak valid ======");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("\n===== Command tidak valid ======");
                    }
                } else throw new Exception("\n====== Command tidak valid ======"); 
            } catch (InputMismatchException e) {
                System.out.println("\n===== Command tidak valid ======");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("\n===== Command tidak valid ======");
            } finally {
                map.printMap();
            }
        
        }


    }

    public static void prepareDeck(Scanner scanner, Deck<Plant> deck, Inventory inventory) {
        while (!deck.isDeckFull()) { // Deck is not full
            inventory.printInventory();
            deck.printDeck();
            int command = 0;

            System.out.println("Command: ");
            System.out.println("(1 x)   : Pilih tanaman ke-x dari inventory untuk dimasukkan ke deck");
            System.out.println("(2 x)   : Hapus tanaman ke-x dari deck");
            System.out.println("(3 x y) : Tukar tanaman ke-x dengan tanaman ke-y di deck");
            System.out.println("");
          
            try {
                command = scanner.nextInt();
                if (command == 1) {
                    try {
                        int plantIndex = scanner.nextInt();
                        inventory.pickPlant(inventory.get(plantIndex - 1), deck);
                    } catch (InputMismatchException e) {
                        System.out.println("\n===== Index tidak valid! =====");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("\n===== Index tidak valid! =====");
                      
                    }
                } else if (command == 2) {
                    try {
                        int plantIndex = scanner.nextInt();
                        inventory.removePlant(plantIndex - 1, deck);
                    } catch (InputMismatchException e) {
                        System.out.println("\n===== Index tidak valid! =====");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("\n===== Index tidak valid! =====");
                    }
                } else if (command == 3) {
                    try {
                        int plantIndex1 = scanner.nextInt();
                        int plantIndex2 = scanner.nextInt();
                        inventory.swapPlant(plantIndex1 - 1, plantIndex2 - 1, deck);
                    } catch (InputMismatchException e) {
                        System.out.println("\n===== Index tidak valid! =====");
                        scanner.nextLine();
                    } catch (Exception e) {
                        System.out.println("\n===== Index tidak valid! =====");
                    }
                } else {
                    System.out.println("\n=====Command tidak valid, masukkan command yang benar! =====");
                    scanner.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("\n===== Command tidak valid, masukkan command yang benar! =====");
                scanner.nextLine();
            }
        }
    }
}
    