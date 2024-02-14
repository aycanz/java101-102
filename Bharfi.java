public class Bharfi {
    public static void main(String[] args) {

        String[][] letter = new String[7][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (j == 0 || (i == 0 && j < 4) || (i == 3 && j < 4) || (i == 6 && j < 4) || (j == 4 && !(i == 0 || i == 3 || i == 6))) {
                    letter[i][j] = "*";
                } else {
                    letter[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                System.out.print(letter[i][j]);
            }
            System.out.println();
        }
    }
}
