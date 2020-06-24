package machine;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        //   System.out.println("Starting to make a coffee\nGrinding coffee beans\nBoiling water\nMixing boiled water with crushed coffee beans\nPouring coffee into the cup\nPouring some milk into the cup\nCoffee is ready!");

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Write action (buy, fill, take):");

            String todo = scanner.nextLine();

            if (todo.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                String buy = scanner.next();

                switch (buy) {
                    case "1":
                        water = water - 250;
                        if(water<0){
                            water += 250;
                            System.out.println("Sorry, not enough water!");
                            continue;
                        }
                        beans = beans - 16;
                        if(water<0){
                            water += 16;
                            System.out.println("Sorry, not enough coffee beans!");
                            continue;
                        }
                        money = money + 4;


                        break;
                    case "2":
                        water = water - 350;
                        if(water<0){
                            water += 350;
                            System.out.println("Sorry, not enough water!");
                            continue;
                        }
                        milk = milk - 75;
                        if(water<0){
                            water += 75;
                            System.out.println("Sorry, not enough milk!");
                            continue;
                        }
                        beans = beans - 20;
                        if(water<0){
                            water += 20;
                            System.out.println("Sorry, not enough coffee beans!");
                            continue;
                        }
                        money = money + 7;

                        break;
                    case "3":
                        water = water - 200;
                        if(water<0){
                            water += 200;
                            System.out.println("Sorry, not enough water!");
                            continue;
                        }
                        milk = milk - 100;
                        if(water<0){
                            water += 100;
                            System.out.println("Sorry, not enough milk!");
                            continue;
                        }
                        beans = beans - 12;
                        if(water<0){
                            water += 12;
                            System.out.println("Sorry, not enough coffee beans!");
                            continue;
                        }
                        money = money + 6;


                        break;
                    default:
                        continue;
                }

                cups--;
                System.out.println("I have enough resources, making you a coffee!");


            } else if (todo.equals("fill")) {

                System.out.println("Write how many ml of water do you want to add:");
                int add = scanner.nextInt();
                water = water + add;
                System.out.println("Write how many ml of milk do you want to add:");
                int add2 = scanner.nextInt();
                milk = milk + add2;
                System.out.println("Write how many grams of coffee beans do you want to add:");
                int add3 = scanner.nextInt();
                beans = beans + add3;
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int add4 = scanner.nextInt();
                cups = cups + add4;


            } else if (todo.equals("take")) {

                System.out.println("I gave you $ " + money);
                money = 0;
            } else if (todo.equals("remaining")) {
                System.out.println();
                System.out.println("The coffee machine has:");
                System.out.println(water + " of water");
                System.out.println(milk + " of milk");
                System.out.println(beans + " of coffee beans");
                System.out.println(cups + " of disposable cups");
                System.out.println(money + " of money");
            } else if (todo.equals("exit")) {

                break;
            }
        }
    }
}


