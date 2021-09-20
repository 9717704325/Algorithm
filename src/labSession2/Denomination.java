package labSession2;

public class Denomination {

    public void no_of_denominations(int[] notes, int amount) {
        int[] noteCounter = new int[notes.length];
        int no_of_notes = 0;
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                no_of_notes += amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        if (amount > 0) {
            System.out.println("Amount can not with the highest denomination");
        } else {
            System.out.println("Given minimum number of notes will be");
            for (int i = 0; i < notes.length; i++) {
                if (noteCounter[i] != 0) {
                    System.out.println(notes[i] + ":" + noteCounter[i]);
                }
            }
        }
    }

}


