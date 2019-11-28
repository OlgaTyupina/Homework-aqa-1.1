package ru.netology.unit;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        int payInAddition = 0;
        if (amount < 1000) {
            payInAddition = boundary - amount;
            System.out.println("Вам нужно докупить на " +  payInAddition);
            return 0;
        }
        return boundary - amount % boundary;
    }
}