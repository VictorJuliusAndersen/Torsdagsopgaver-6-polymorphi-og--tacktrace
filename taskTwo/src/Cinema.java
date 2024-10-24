//Task 2
public class Cinema {

    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];    //fejl her, den skal initialiseres før den kan tildeles en værdi
        this.seats[0][0] = "X";
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {    //fejl der var lille x
            seats[row][seat] = "0";     //  fejl der stod O og ikke 0
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < rows; i++) {
            result += "|";
            for (int j = 0; j < seats; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }

}
