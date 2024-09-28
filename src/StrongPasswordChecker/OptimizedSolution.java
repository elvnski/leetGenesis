package StrongPasswordChecker;

public class OptimizedSolution {

    public int strongPasswordChecker(String password){

        int n = password.length();
        boolean hasLower = false, hasUpper = false, hasDigit = false;

        // Checking For Missing Character Types
        for (char c : password.toCharArray()) {

            if(Character.isLowerCase(c)) hasLower = true;
            if(Character.isUpperCase(c)) hasUpper = true;
            if(Character.isDigit(c)) hasDigit = true;
        }

        // Calculating Missing Character Types
        int missingTypes = (hasLower ? 0 : 1) + (hasUpper ? 0 : 1) + (hasDigit ? 0 : 1);

        // Handling Short Passwords ie Less Than 6 Characters
        if (n<6) return Math.max(6-n, missingTypes);

        //Handling Repeating Characters
        int replace = 0, oneSeq = 0, twoSeq = 0;

        for (int u = 2; u < n;){

            if (password.charAt(u) == password.charAt(u-1) && password.charAt(u) == password.charAt(u-2)) {

                int length = 2;
                while (u < n && password.charAt(u) == password.charAt(u - 1)){

                    length++;
                    u++;
                }

                replace += length/3;

                if (length%3 == 0) oneSeq++;
                if (length%3 == 1) twoSeq++;
            }
            else {

                u++;
            }
        }

        // Handling Long Passwords i.e. More Than 20 Characters
        if (n>20) {

            int deleteCount = n - 20;

            replace -= Math.min(deleteCount, oneSeq);
            deleteCount -= oneSeq;

            replace -= Math.min(Math.max(deleteCount, 0) / 2, twoSeq);
            deleteCount -= 2 * twoSeq;

            replace -= Math.max(deleteCount, 0) / 3;

            return (n - 20) + Math.max(replace, missingTypes);
        }

        return Math.max(replace, missingTypes);
    }


    public int strongPasswordCheckerVerbose(String password){

        System.out.println("[PASSWORD]: " + password);

        int n = password.length();
        System.out.println("[LENGTH]: " + n);

        boolean hasLower = false, hasUpper = false, hasDigit = false;

        // Checking For Missing Character Types
        for (char c : password.toCharArray()) {

            if(Character.isLowerCase(c)) hasLower = true;
            if(Character.isUpperCase(c)) hasUpper = true;
            if(Character.isDigit(c)) hasDigit = true;
        }
        System.out.println("\n[Has Lower Case]: " + hasLower);
        System.out.println("[Has Upper Case]: " + hasUpper);
        System.out.println("[Has Digit Case]: " + hasDigit);

        // Calculating Missing Character Types
        int missingTypes = (hasLower ? 0 : 1) + (hasUpper ? 0 : 1) + (hasDigit ? 0 : 1);
        System.out.println("\n[Missing TYpes]: " + missingTypes);

        // Handling Short Passwords ie Less Than 6 Characters
        if (n<6) {

            System.out.println("\n[SHORT PASSWORD < 6 CHARACTERS]");
            return Math.max(6 - n, missingTypes);
        }

        System.out.println("\n\n--- PROCESSING DUPLICATE SEQUENCES ---");
        //Handling Repeating Characters
        int replace = 0, oneSeq = 0, twoSeq = 0;

        for (int u = 2; u < n;){

            if (password.charAt(u) == password.charAt(u-1) && password.charAt(u) == password.charAt(u-2)) {

                System.out.println("\nFound a trio sequence of '" + password.charAt(u) + "' at indexes: [" + (u-2) + ", " + (u-1) + ", " + u + "]");

                int length = 2;
                while (u < n && password.charAt(u) == password.charAt(u - 1)){

                    System.out.println("\nConsidering '" + password.charAt(u) + "' at index [" + u + "] \n---");

                    System.out.println("Incrementing [length = " + length + "] to: " + ( length + 1 ));
                    length++;

                    System.out.println("Incrementing [u = " + u + "] to: " + ( u + 1 ) + "\n---");
                    u++;
                }

                System.out.println("\nIncrementing [replace = " + replace + "] to: " + ( replace + length/3 ));
                replace += length/3;

                System.out.println("\n[length = " + length + "]");
                System.out.println("[length % 3 = " + length%3 + "]");

                if (length%3 == 0) {

                    System.out.println("\nIncrementing [oneSeq = " + oneSeq + "] to: " + ( oneSeq + 1 ));
                    oneSeq++;
                }

                if (length%3 == 1) {

                    System.out.println("\nIncrementing [twoSeq = " + twoSeq + "] to: " + ( twoSeq + 1 ));
                    twoSeq++;
                }
            }
            else {

                System.out.println("\n\nNO TRIO FOUND!");
                System.out.println("Incrementing [u = " + u + "] to: " + ( u + 1 ));
                u++;
            }
        }
        System.out.println("\n--- DONE PROCESSING DUPLICATE SEQUENCES ---\n\n");


        // Handling Long Passwords i.e. More Than 20 Characters
        if (n>20) {

            System.out.println("\n\nHandling Long Passwords i.e. More Than 20 Characters");

            System.out.println("\n[deleteCount = " + (n-20) + "]");
            int deleteCount = n - 20;

            System.out.println("\n\nHandling [oneSeq] replacements");

            System.out.println("\nDecrementing [replace = " + replace + "] to: " + ( replace - Math.min(deleteCount, oneSeq) ));
            replace -= Math.min(deleteCount, oneSeq);

            System.out.println("\nDecrementing [deleteCount = " + deleteCount + "] to: " + ( deleteCount - oneSeq ));
            deleteCount -= oneSeq;


            System.out.println("\n\nHandling [twoSeq] replacements");

            System.out.println("\nDecrementing [replace = " + replace + "] to: " + ( replace - Math.min(Math.max(deleteCount, 0) / 2, twoSeq) ));
            replace -= Math.min(Math.max(deleteCount, 0) / 2, twoSeq);

            System.out.println("\nDecrementing [deleteCount = " + deleteCount + "] to: " + ( deleteCount - (2*twoSeq) ));
            deleteCount -= 2 * twoSeq;


            System.out.println("\n\nHandling [length % 3 == 2] replacements");

            System.out.println("\nDecrementing [replace = " + replace + "] to: " + ( replace - (Math.max(deleteCount, 0) / 3) ));
            replace -= Math.max(deleteCount, 0) / 3;

            System.out.println("\n\n[LONG PASSWORD < 6 CHARACTERS]");
            System.out.println("FINAL NUMBER OF STEPS: " + ((n - 20) + Math.max(replace, missingTypes)));
            return (n - 20) + Math.max(replace, missingTypes);
        }

        System.out.println("\n\n[PASSWORD FROM 6 - 20 CHARACTERS]");
        System.out.println("FINAL NUMBER OF STEPS: " + Math.max(replace, missingTypes));
        return Math.max(replace, missingTypes);
    }

}
