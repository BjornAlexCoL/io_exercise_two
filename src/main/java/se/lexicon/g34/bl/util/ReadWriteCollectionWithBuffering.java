package se.lexicon.g34.bl.util;

import se.lexicon.g34.bl.model.Name;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteCollectionWithBuffering {
    public static void writeList(String destination, String[] toWrite) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
            for (String out : toWrite) {
                writer.write(out);
                writer.newLine();
            }
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Name> readList(String source) {
        List<Name> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(new Name(line));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
