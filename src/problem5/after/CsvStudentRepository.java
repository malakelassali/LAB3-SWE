package problem5.after;

import java.io.*;
import java.nio.file.*;

public class CsvStudentRepository implements StudentRepository {
    private final String filename;
    public CsvStudentRepository(String filename) {
        this.filename= filename;
    }
    @Override
    public boolean exists(String cne) {
        try {
            for (String line : Files.readAllLines(Path.of(filename))) {
                if (line.split(",")[0].equals(cne)) {
                    return true;
                }
            }
        } catch (NoSuchFileException e) {
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public void save(String cne, String name, String email) {
        try {
            FileWriter writer= new FileWriter(filename, true);
            writer.write(cne + "," + name + "," + email + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}