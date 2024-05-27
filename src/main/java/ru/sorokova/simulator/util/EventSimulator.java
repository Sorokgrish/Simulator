package ru.sorokova.simulator.util;

import ru.sorokova.simulator.model.Bear;

public class EventSimulator {

    public void startSimulator(Bear bear) {
        Math.random();
        System.out.println("Цикл жизни нашего медведя");
        while (statusChecker(bear)) {
            int eventNumber = (int) (Math.random() * 100);
            if (eventNumber >= 0 && eventNumber < 15) {
                sleepEvent(bear);
            } else if (eventNumber >= 15 && eventNumber < 21) {
                runningEvents(bear);
            } else if (eventNumber >= 21 && eventNumber < 25) {
                eatsHare(bear);
            } else if (eventNumber >= 25 && eventNumber < 41) {
                hunterAttacked(bear);
            } else if (eventNumber >= 41 && eventNumber < 51) {
                fishing(bear);
            } else if (eventNumber >= 51 && eventNumber < 61) {
                climbingTree(bear);
            } else if (eventNumber >= 61 && eventNumber < 71) {
                eatingMoose(bear);
            } else if (eventNumber >= 71 && eventNumber < 81) {
                swimming(bear);
            } else if (eventNumber >= 81 && eventNumber < 91) {
                eatingHoney(bear);
            } else if (eventNumber >= 91 && eventNumber <= 100) {
                eatsEaspberries(bear);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        System.out.println("Медведь умер, да будем помнить его всегда!");
    }

    private void sleepEvent(Bear bear) {  //медведь поспал
        int energy = bear.getEnergy();
        int health = bear.getHealth();
        energy = energy + 10;
        health = health + (int) (bear.getCoeffRecovery() * 2);
        if (energy > 100) {
            energy = 100;
        }
        if (health > 100) {
            health = 100;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        energyChecken(bear);
        System.out.println("Как же я устал пойду по сплю! Энергия + 20! Текущая энергия " + bear.getEnergy());
        System.out.println("Текущее здоровье " + bear.getHealth());
    }

    private void runningEvents(Bear bear) {  //медведь бегает
        int energy = bear.getEnergy();
        energy = energy - 20;
        if (energy < 0) {
            energy = 0;
        }
        bear.setEnergy(energy);
        energyChecken(bear);
        System.out.println("Бегать тоже нужно! Энергия - 20! Текущая энергия " + bear.getEnergy());
    }

    private void eatsHare(Bear bear) {     //съел зайца
        int energy = bear.getEnergy();
        int health = bear.getHealth();
        energy = energy - 10;
        health = health + (int) (bear.getCoeffRecovery() * 3);
        if (energy < 0) {
            energy = 0;
        }
        if (health > 100) {
            health = 100;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        energyChecken(bear);
        System.out.println("Подкрепился! Энергия - 10! Текущая энергия " + bear.getEnergy());
        System.out.println("Текущее здоровье " + bear.getHealth());

    }

    private void hunterAttacked(Bear bear) { ///напал охотник
        int energy = bear.getEnergy();
        int health = bear.getHealth();
        energy = energy - 10;
        health = health - 20;
        if (energy < 0) {
            energy = 0;
        }
        if (health < 0) {
            health = 0;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        energyChecken(bear);
        System.out.println("Ай яй яй как больно! Энергия - 10! Текущая энергия " + bear.getEnergy());
        System.out.println("Текущее здоровье " + bear.getHealth());
    }

    private void fishing(Bear bear) {           // рыбу ловит
        int energy = bear.getEnergy();
        int health = bear.getHealth();
        energy = energy - 10;
        health = health + (int) (bear.getCoeffRecovery() * 3);
        if (energy < 0) {
            energy = 0;
        }
        if (health > 100) {
            health = 100;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        energyChecken(bear);
        System.out.println("Ловись рыбка, большая и маленькая! Энергия - 10! Текущая энергия: " + bear.getEnergy());
        System.out.println("Текущее здоровье " + bear.getHealth());
    }

    private void climbingTree(Bear bear) {      //ползал на дерево
        int energy = bear.getEnergy();
        energy = energy - 20;
        if (energy < 0) {
            energy = 0;
        }
        bear.setEnergy(energy);
        energyChecken(bear);
        System.out.println("Лезу я за медом лезу высоко! Энергия - 20! Текущая энергия " + bear.getEnergy());

    }

    private void eatingMoose(Bear bear) {         //съел лося
        int energy = bear.getEnergy();
        int health = bear.getHealth();
        energy = energy - 15;
        health = health + (int) (bear.getCoeffRecovery() * 3);
        if (energy < 0) {
            energy = 0;
        }
        if (health > 100) {
            health = 100;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        energyChecken(bear);
        System.out.println("Вкусный лось! Энергия - 15! Текущая энергия " + bear.getEnergy());
        System.out.println("Текущее здоровье " + bear.getHealth());
    }

    private void swimming(Bear bear) {           //плавал
        int energy = bear.getEnergy();
        energy = energy - 15;
        if (energy < 0) {
            energy = 0;
        }
        bear.setEnergy(energy);
        energyChecken(bear);
        System.out.println("Плавание улучшает кровоток! Энергия - 15! Текущая энергия " + bear.getEnergy());

    }

    private void eatingHoney(Bear bear) {           //ел мед
        int energy = bear.getEnergy();
        int health = bear.getHealth();
        energy = energy - 5;
        health = health + (int) (bear.getCoeffRecovery() * 4);
        if (energy < 0) {
            energy = 0;
        }
        if (health > 100) {
            health = 100;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        energyChecken(bear);
        System.out.println("МММ какой вкусный мед! Энергия - 5! Текущая энергия " + bear.getEnergy());
        System.out.println("Текущее здоровье " + bear.getHealth());
    }

    private void eatsEaspberries(Bear bear) {    // ел малину
        int energy = bear.getEnergy();
        int health = bear.getHealth();
        energy = energy - 3;
        health = health + (int) (bear.getCoeffRecovery() * 2);
        if (energy < 0) {
            energy = 0;
        }
        if (health > 100) {
            health = 100;
        }
        bear.setEnergy(energy);
        bear.setHealth(health);
        energyChecken(bear);

        System.out.println("Малинка прекрасная малинка! Энергия - 3! Текущая энергия " + bear.getEnergy());
        System.out.println("Текущее здоровье " + bear.getHealth());
    }

    private boolean statusChecker(Bear bear) {
        System.out.println("Энергия " + bear.getEnergy() + " Здоровье " + bear.getHealth());
        if (bear.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    private void energyChecken(Bear bear) {
        // int health = bear.getHealth() - 3;
        if (bear.getEnergy() <= 0) {
            int health = bear.getHealth();
            health = health - 5;
            if (health < 0) {
                health = 0;
            }
            bear.setHealth(health);
        }
    }
}



