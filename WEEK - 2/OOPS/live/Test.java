package OOPS.live;

import OOPS.music.Playable;
import OOPS.music.string.Veena;
import OOPS.music.wind.Saxophone;

public class Test {

    public static void main(String[] args) {

        Veena v = new Veena();
        v.play();

        Saxophone s = new Saxophone();
        s.play();

        // Store objects in Playable reference and call play()
        Playable p;

        p = new Veena();
        p.play();

        p = new Saxophone();
        p.play();
    }
}

// OUTPUT

// Playing Veena
// Playing Saxophone
// Playing Veena
// Playing Saxophone