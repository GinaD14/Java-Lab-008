public class WallsAndBeer {
    public static void main(String[] args) {
        singSong(99); // Start the song with 99 bottles
    }

    // Recursive method to sing the song
    public static void singSong(int bottles) {
        if (bottles == 0) {
            // Base case: No more bottles left
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around,\n" +
                    "’cause there are no more bottles of beer on the wall!");
        } else {
            // Print the current verse
            printVerse(bottles);
            // Recursively call singSong with one less bottle
            singSong(bottles - 1);
        }
    }

    // Method to print a single verse of the song
    public static void printVerse(int bottles) {
        String plural = (bottles == 1) ? "" : "s";
        System.out.println(bottles + " bottle" + plural + " of beer on the wall,");
        System.out.println(bottles + " bottle" + plural + " of beer,");
        System.out.println("ya’ take one down, ya’ pass it around, " + (bottles - 1) + " bottle" + (bottles - 1 == 1 ? "" : "s") + " of beer on the wall.");
        System.out.println();
    }
}
