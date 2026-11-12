package com.File_I_O_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Player {

    String playerName;
    int level;
    int score;
    String weapon;

    Player(String playerName, int level, int score, String weapon) {
        this.playerName = playerName;
        this.level = level;
        this.score = score;
        this.weapon = weapon;
    }
}

public class Game {

    // Save all players
    public static void savePlayers(Player[] players, String location) throws IOException {

        FileOutputStream fos = new FileOutputStream(location);

        for (int i = 0; i < players.length; i++) {

            String data = players[i].playerName + "\n"
                    + players[i].level + "\n"
                    + players[i].score + "\n"
                    + players[i].weapon + "\n";

            fos.write(data.getBytes());
        }

        fos.close();

        System.out.println("Game Saved Successfully.");
    }

    // Load all players
    public static Player[] loadPlayers(String location) throws IOException {

        File file = new File(location);

        if (!file.exists()) {
            return new Player[0];
        }

        FileInputStream fis = new FileInputStream(file);

        byte[] arr = new byte[fis.available()];
        fis.read(arr);
        fis.close();

        String data = new String(arr).trim();

        if (data.length() == 0) {
            return new Player[0];
        }

        String[] details = data.split("\n");

        int count = details.length / 4;

        Player[] players = new Player[count];

        int index = 0;

        for (int i = 0; i < count; i++) {

            players[i] = new Player(
                    details[index],
                    Integer.parseInt(details[index + 1]),
                    Integer.parseInt(details[index + 2]),
                    details[index + 3]);

            index += 4;
        }

        return players;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String location = "PlayerData.txt";

        System.out.println("===== GAME MENU =====");
        System.out.println("1. New Player");
        System.out.println("2. Continue");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            Player[] oldPlayers = loadPlayers(location);

            System.out.print("Enter Player Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Level : ");
            int level = sc.nextInt();

            System.out.print("Enter Score : ");
            int score = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Weapon : ");
            String weapon = sc.nextLine();

            Player newPlayer = new Player(name, level, score, weapon);

            Player[] players = new Player[oldPlayers.length + 1];

            for (int i = 0; i < oldPlayers.length; i++) {
                players[i] = oldPlayers[i];
            }

            players[players.length - 1] = newPlayer;

            savePlayers(players, location);
        }

        else if (choice == 2) {

            Player[] players = loadPlayers(location);

            if (players.length == 0) {

                System.out.println("No Players Found.");
                sc.close();
                return;
            }

            System.out.println("\nAvailable Players");

            for (int i = 0; i < players.length; i++) {

                System.out.println((i + 1) + ". " + players[i].playerName);

            }

            System.out.print("Choose Player : ");
            int playerChoice = sc.nextInt();

            Player p = players[playerChoice - 1];

            System.out.println("\nWelcome Back!");
            System.out.println("Name   : " + p.playerName);
            System.out.println("Level  : " + p.level);
            System.out.println("Score  : " + p.score);
            System.out.println("Weapon : " + p.weapon);

            // Simulate playing
            p.level++;
            p.score += 200;

            System.out.println("\nGame Played...");
            System.out.println("Level Increased!");
            System.out.println("Score Increased!");

            savePlayers(players, location);
        }

        else {

            System.out.println("Invalid Choice.");

        }

        sc.close();
    }
}