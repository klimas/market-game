package com.timbuchalka;

public class Player {
  private  String name;
    private int money;
    private int xFine;
    private  int fine;
    private  int standard;
    private  int a;
    private int b;
    private int c;
    private int loan;
    private boolean computer;

    public Player(String name) {
        this.name = name;
    }

    public boolean isComputer() {
        return computer;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public int getxFine() {
        return xFine;
    }

    public int getFine() {
        return fine;
    }

    public int getStandard() {
        return standard;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getLoan() {
        return loan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setxFine(int xFine) {
        this.xFine = xFine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public void setComputer(boolean computer) {
        this.computer = computer;
    }
}
