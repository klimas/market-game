package com.timbuchalka;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import  java.util.*;


public class Main {
    static  Scanner scanner = new Scanner(System.in) ;

// tutaj sobie komentuję
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        Player player1 = new Player("");
        Player player2 = new Player("");
        Player player3 = new Player("");
        players.add(player1);
        players.add(player2);
        players.add(player3);
        int budget=100;


        createPlayers(players);
        showPlayers(players);
setBudgets(players,budget);

// NAMING PLAYERS


        // GAME
    }

        public static void createPlayers(ArrayList<Player> players){
            String name;
            String number = "";
            for (int i = 0; i < players.size(); i++) {
                switch (i) {
                    case 0:
                        number = "first";
                        break;
                    case 1:
                        number = "second";
                        break;
                    case 2:
                        number = "third";
                        break;
                }
                System.out.println("Enter the name of the " + number + " player");
                name = scanner.nextLine();
                //scanner.nextLine();
                players.get(i).setName(name);
                System.out.println("Is it a human or computer?");
                System.out.println("1- human\n2 - computer");
                int choice;
                choice = scanner.nextInt();
                scanner.nextLine();
                if (choice == 1) {
                    players.get(i).setComputer(false);
                } else {
                    players.get(i).setComputer(true);
                }

            }


        }

        public static void showPlayers(ArrayList<Player> players) {
        for(int i=0; i<players.size();i++) {
            String computer="";
            if(players.get(i).isComputer()) {
                computer="computer";
            }
            else {
                computer="human";
            }
            System.out.println("Player " + (i+1) + ": " + players.get(i).getName() + " playing: " + computer);
        }


        }

        public static void setBudgets(ArrayList<Player> players,int budget) {
        for(int i=0;i<players.size();i++) {
            players.get(i).setMoney(budget);
            System.out.println(players.get(i).getName() + " has " + players.get(i).getMoney() + "zł");
        }
        }

        public static void getLoan(Player player,int loan) {
        int currentLoan= player.getLoan();
        player.setLoan(currentLoan+loan);
            System.out.println(player.getName() + " loan is: " + player.getLoan());
        }

        public static void buyResources(Player player) {
        
        }

    }





