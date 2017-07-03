package example.codeclan.com.cordwount;

import java.util.ArrayList;

/**
 * Created by user on 03/07/2017.
 */

public class CordWount {

        String string;

        public CordWount(String string) {
            this.string = string;
        }

        public int wordCount() {
            int counter = string.split(" ").length;
            return counter;
        }
        public String wordCountAsString() {
            return string.toString();
        }

    }







