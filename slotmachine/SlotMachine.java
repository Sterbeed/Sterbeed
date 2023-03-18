/* 
Programmer: Mohamed Mohamed 

Program name: SlotMachine.java

Date:3/11/2023

Purpose:Asks the user how much money they want to put in. Randomly generates slot types. Once slot types are selected
        check to see what int each slot type is. Once all 3 slots have been declared add it all up with original amount
        put in by user and calculate.

Specs Met:Yes

Psuedocode:
Delare variables:
Slot1, Slot2, Slot3 = ""
Slot;

Random RandomSlot

Output: rules or the game

Input userMoney: How much money would you like to put in?

If RandomSlot is 0-7 delare each slot as either Cherry, Orange, Plum, Bell, Melon, Kale

Cherry = -5
Orange = 10
Plum = 5
Bell = -10
Melon = 30
Kale = -30

Convert Slot1-3 to the right math
Remaining money = userMoney + Slot1 + Slot2 + Slot3

Output: Slot1-3 "You have this much money remaining: " + Remaining money

*/

import javax.swing.JOptionPane;
import java.util.Random;

public class SlotMachine 
{
    public static void main(String[] args)
    {
        //Declaring variables
        String userMoney;
        String slot1 = "";
        String slot2 = "";
        String slot3 = "";
        String slot;
        int mathslot1 = 0;
        int mathslot2 = 0;
        int mathslot3 = 0;
        int resultMoney;


        Random randomNumber = new Random();//setting up random number gen
        int randomSlotType = randomNumber.nextInt(5);//Generating random number and assigning it

        JOptionPane.showMessageDialog(null, "Here are the rules!\n" +
                "Cherry = $5\n" +
                "Orange = $15\n" +
                "Plums = $8\n" +
                "Bell = $-15\n" +
                "Melon = $30\n" +
                "Kale = $-40");

        //Asking user for an INT input
        userMoney = JOptionPane.showInputDialog("How much money would you like to put into the machine?($0-$50): ");
        resultMoney = Integer.parseInt(userMoney);//Converts userMoney which is string to int and assigning it

        if (resultMoney > 50)//If user inputs more than 50 ask them for a different amount.
        {
            userMoney = JOptionPane.showInputDialog("Please only input $0-$50!: ");
            resultMoney = Integer.parseInt(userMoney);//Converts userMoney which is string to int and assigning it
        }

        JOptionPane.showMessageDialog(null, "Spinning...");//Just a output

        if (randomSlotType == 0)//If the random gen put 0
        {
            slot = "Cherry";
            slot1 = slot;//Assigning a slot
        }
        else if (randomSlotType == 1)//If the random gen put 1
        {
            slot = "Orange";
            slot1 = slot;//Assigning a slot
        }
        else if (randomSlotType == 2)//If the random gen put 2
        {
            slot = "Plum";
            slot1 = slot;//Assigning a slot
        }
        else if (randomSlotType == 3)//If the random gen put 3
        {
            slot = "Bell";
            slot1 = slot;//Assigning a slot
        }
        else if (randomSlotType == 4)//If the random gen put 4
        {
            slot = "Melon";
            slot1 = slot;//Assigning a slot
        }
        else if (randomSlotType == 5)//If the random gen put 5
        {
            slot = "Kale";
            slot1 = slot;//Assigning a slot
        }

        randomSlotType = randomNumber.nextInt(5); //generating a new number

        if (randomSlotType == 0)//If the random gen put 0
        {
            slot = "Cherry";
            slot2 = slot;//Assigning a slot
        }
        else if (randomSlotType == 1)//If the random gen put 1
        {
            slot = "Orange";
            slot2 = slot;//Assigning a slot
        }
        else if (randomSlotType == 2)//If the random gen put 2
        {
            slot = "Plum";
            slot2 = slot;//Assigning a slot
        }
        else if (randomSlotType == 3)//If the random gen put 3
        {
            slot = "Bell";
            slot2 = slot;//Assigning a slot
        }
        else if (randomSlotType == 4)//If the random gen put 4
        {
            slot = "Melon";
            slot2 = slot;//Assigning a slot
        }
        else if (randomSlotType == 5)//If the random gen put 5
        {
            slot = "Kayle";
            slot2 = slot;//Assigning a slot
        }
        randomSlotType = randomNumber.nextInt(5); //generating a new number
        if (randomSlotType == 0)//If the random gen put 0
        {
            slot = "Cherry";
            slot3 = slot;//Assigning a slot
        }
        else if (randomSlotType == 1)//If the random gen put 1
        {
            slot = "Orange";
            slot3 = slot;//Assigning a slot
        }
        else if (randomSlotType == 2)//If the random gen put 2
        {
            slot = "Plum";
            slot3 = slot;//Assigning a slot
        }
        else if (randomSlotType == 3)//If the random gen put 3
        {
            slot = "Bell";
            slot3 = slot;//Assigning a slot
        }
        else if (randomSlotType == 4)//If the random gen put 4
        {
            slot = "Melon";
            slot3 = slot;//Assigning a slot
        }
        else if (randomSlotType == 5)//If the random gen put 5
        {
            slot = "Kayle";
            slot3 = slot;//Assigning a slot
        }

        if (slot1.equals("Cherry"))//If slot1 = this slot type
        {
            mathslot1 = 5;//Do this math
        }
        else if (slot1.equals("Orange"))//If slot1 = this slot type
        {
            mathslot1 = 15;//Do this math
        }
        else if (slot1.equals("Plum"))//If slot1 = this slot type
        {
            mathslot1 = 8;//Do this math
        }
        else if (slot1.equals("Bell"))//If slot1 = this slot type
        {
            mathslot1 = -15;//Do this math
        }
        else if (slot1.equals("Melon"))//If slot1 = this slot type
        {
            mathslot1 = 30;//Do this math
        }
        else if (slot1.equals("Kale"))//If slot1 = this slot type
        {
            mathslot1 = -40;//Do this math
        }
        if (slot2.equals("Cherry"))//If slot2 = this slot type
        {
            mathslot2 = 5;//Do this math
        }
        else if (slot2.equals("Orange"))//If slot2 = this slot type
        {
            mathslot2 = 15;//Do this math
        }
        else if (slot2.equals("Plum"))//If slot2 = this slot type
        {
            mathslot2 = 8;//Do this math
        }
        else if (slot2.equals("Bell"))//If slot2 = this slot type
        {
            mathslot2 = -15;//Do this math
        }
        else if (slot2.equals("Melon"))//If slot2 = this slot type
        {
            mathslot2 = 30;//Do this math
        }
        else if (slot2.equals("Kale"))//If slot2 = this slot type
        {
            mathslot2 = -40;//Do this math
        }
        if (slot3.equals("Cherry"))//If slot3 = this slot type
        {
            mathslot3 = 5;//Do this math
        }
        else if (slot3.equals("Orange"))//If slot3 = this slot type
        {
            mathslot3 = 15;//Do this math
        }
        else if (slot3.equals("Plum"))//If slot3 = this slot type
        {
            mathslot3 = 8;//Do this math
        }
        else if (slot3.equals("Bell"))//If slot3 = this slot type
        {
            mathslot3 = -15;//Do this math
        }
        else if (slot3.equals("Melon"))//If slot3 = this slot type
        {
            mathslot3 = 30;//Do this math
        }
        else if (slot3.equals("Kale"))//If slot3 = this slot type
        {
            mathslot3 = -40;//Do this math
        }

        resultMoney = resultMoney + mathslot1 + mathslot2 + mathslot3;//Doing math to see how much money User won or lost

        //Final output showing user what slots they landed on and how much money they won/lost
        JOptionPane.showMessageDialog(null, "Slot 1: " + slot1 + " | Slot 2: " + slot2 + " | Slot 3: " + slot3 + "\n" +
                "Your total money left is $" + resultMoney);
    }
}
