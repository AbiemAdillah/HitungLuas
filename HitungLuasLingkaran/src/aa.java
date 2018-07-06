/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 8.1 Pro
 */
import java.io.File;
import java.io.IOException;

public class aa {
    public static String bacaString() {
        int karakter;
        String string = "";
        boolean selesai = false;

        while(!selesai) {
            try {
                karakter = System.in.read();
                if(karakter < 0 || (char)karakter == '\n')
                    selesai = true;
                else
                if(karakter != '\r')
                    string = string + (char)karakter;
            }
            catch(IOException ioe) 
            {
                System.err.println("Ada kesalahan input data!");
                selesai = true;
            }
        }
        return string;
    }
}
