package com.nighthawk.csa.kianfrqs;
import java.util.ArrayList;
import java.util.Arrays;
//frq 7

public class UserName {
        // The list of possible user names, based on a user’s first and last names and initialized by the constructor.
        private static ArrayList<String> possibleNames = new ArrayList<>(Arrays.asList());
        static String[] used = {"harta", "hartm", "harty"};

        /**
         * Constructs a UserName object as described in part (a).
         * Precondition: firstName and lastName have length greater than 0
         * and contain only uppercase and lowercase letters.
         */

        public boolean conditionsCheck(String firstName, String lastName) {
                boolean conditions = false;
                if (firstName.length() > 0 && lastName.length() > 0) {
                        for (int i = 0; i < firstName.length(); i++) {
                                conditions = Character.isLetter(firstName.charAt(i));
                                if (!conditions) {
                                        System.out.println("First Name invalid! - (Contains integer)");
                                        break;
                                }
                        }
                        for (int i = 0; i < lastName.length(); i++) {
                                conditions = Character.isLetter(lastName.charAt(i));
                                if (!conditions) {
                                        System.out.println("Last name invalid! - (Contains integer)");
                                        break;
                                }
                        }
                } else {
                        System.out.println("You did not input a first and/or last name!");
                }
                return conditions;
        }

        public UserName(String firstName, String lastName) {
                if (conditionsCheck(firstName, lastName)) {
                        for (int i = 0; i < firstName.length(); i++) {
                                possibleNames.add(i,lastName + firstName.charAt(i));
                                System.out.println("Successfully added possible names");
                        }
                }
                else {
                        System.out.println("Conditions failed");
                }

        }

        /**
         * Returns true if arr contains name, and false otherwise.
         */
        public boolean isUsed(String name, String[] arr) {
                boolean is = true;
                for (String a : arr) {
                        if (!a.equals(name)) {
                                is = true;
                        } else {
                                is = false;
                        }
                }
                System.out.println("Name, " + name +", is used: " + is);
                return is;
        }

        /**
         * Removes strings from possibleNames that are found in usedNames as described in part (b).
         */

        public void setAvailableUserNames(String[] usedNames) {
                for (String a : possibleNames) {
                        int index = possibleNames.indexOf(a);
                        if (isUsed(a, usedNames)) {
                                System.out.println("This name is already used: " + possibleNames.get(index));
                                possibleNames.set(index, null);
                        }
                }
                while(possibleNames.remove(null));
        }
        public static void main(String[] args) {
                UserName person = new UserName("mary","hart");
                person.setAvailableUserNames(used);
                System.out.println("Available usernames are: " + possibleNames);
                System.out.println("Username has been set!");
        }
}