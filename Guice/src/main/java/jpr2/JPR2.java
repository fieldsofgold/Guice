/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpr2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author kursant2
 */
public class JPR2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String file = "SOME_PATH"; //przykład wzorca factory method
        int length = 0X8000000;
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        FileChannel fc = raf.getChannel();
        MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE, 0, length);

        for (int i = 0; i < length; i++) {
            mbb.put((byte) 'x');
        }
        for (int i = length / 2; i < length / 2 + 6; i++) {
            System.out.println((char) mbb.get(i));

        }
    }

}
