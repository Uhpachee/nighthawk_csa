package shekarfrqs;

import java.util.ArrayList;

public class frq7 {

    // The list of possible user names, based on a user’s first and last names and initialized by the constructor.
    private ArrayList<String> possibleNames = new ArrayList<String>();
    private String firstName;
    private String lastName;

    /** Constructs a UserName object as described in part (a).
     * Precondition: firstName and lastName have length greater than 0
     * and contain only uppercase and lowercase letters.
     */

    public boolean alphabetical(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    //part A
    public frq7(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (firstName.length() > 0 && lastName.length() > 0) {
            if (alphabetical(firstName) && alphabetical(lastName)) {
                for (int i = 1; i <= this.firstName.length(); i++) {
                    possibleNames.add(this.lastName + this.firstName.substring(0, i));
                }
            }
        } else {
            System.out.println("The names provided do not fit the guidelines.");
        }
    }


    public void printNames () {
        for (String string: possibleNames) {
            System.out.print(string + " ,");
        }
    }

    /** Returns true if arr contains name, and false otherwise. */

    public boolean isUsed(String name, String[] arr) {
        for (String string: arr) {
            if (name == string) {
                return true;
            }
        }
        return false;
    }

    /** Removes strings from possibleNames that are found in usedNames as described in part (b).
     */

    //part B
    public void setAvailableUserNames(String[] usedNames) {
        for (int i = 0; i < possibleNames.size(); i++) {
            if (isUsed(possibleNames.get(i), usedNames)) {
                possibleNames.remove(i);
                i--;
            }
        }
    }
}

