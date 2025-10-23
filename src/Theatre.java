public class Theatre {

    private String theatreName;


    static class Seat {
        private char row;
        private int number;
        private boolean reserved;

        public Seat(char row, int number) {
            this.row = row;
            this.number = number;
        }

        @Override
        public String toString() {
            //%d = decimal integer
            //0 = pad with zeros (instead of spaces)
            //3 = make it 3 characters wide
            return row + "%03d".formatted(number);
        }
    }

}
