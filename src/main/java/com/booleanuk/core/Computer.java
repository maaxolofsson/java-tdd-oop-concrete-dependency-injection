package com.booleanuk.core;

import java.util.ArrayList;

public class Computer {

    public ArrayList<Game> installedGames = new ArrayList<>();
    private PowerSupply psu;

    public Computer(PowerSupply psu) {
        this.psu = psu;
    }

    public Computer(PowerSupply psu, ArrayList<Game> preInstalled) {
        this.installedGames = preInstalled;
        this.psu = psu;
    }

    public void turnOn() {
        this.psu.turnOn();
    }

    public void installGame(String gameName) {
        this.installedGames.add(new Game(gameName));
    }

    public String playGame(String game) {
        for (Game g : this.installedGames) {
            if (g.name.equals(game)) {
                return g.start();
            }
        }

        return "Game not installed";
    }
}
