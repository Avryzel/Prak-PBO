public class LibraryManager {
    private static int totalBooksAvailable = 100;

    public static void addBooks(int count) {
        totalBooksAvailable += count;
        
        System.out.println(count + " books added.");
    }

    public static void removeBooks(int count) {
        if(count <= totalBooksAvailable) {
            totalBooksAvailable -= count;

            System.out.println(count + " books removed.");
        } else {
            System.out.println("Not enough books available to remove");
        }
    }

    public static void main(String[] args) {
        LibraryManager.addBooks(10);

        LibraryManager.removeBooks(5);
        
        System.out.println("Total books  available: " + LibraryManager.totalBooksAvailable);
    }
}
