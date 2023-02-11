import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static StringBuilder loga = new StringBuilder();

    public static void main(String[] args) {

        List<String> directories = new ArrayList<>();
        directories.addAll(Arrays.asList("D://Games//res", "D://Games//src", "D://Games//savegames",
                "D://Games//temp", "D://Games//src//main", "D://Games//src//test", "D://Games//res//drawables",
                "D://Games//res//vectors", "D://Games//res//icons"));

        for (int i = 0; i < directories.size(); i++) {
            createDirectory(directories.get(i));
        }


        File mainJava = creatFils("D://Games//src//main//Main.java", "Main.java");

        File utils = creatFils("D://Games//src//main//Utils.java", "Utils.java");

        File tempFile = creatFils("D://Games//temp//temp.txt", "temp.txt");

        try (FileWriter writer = new FileWriter("D://Games//temp//temp.txt", false)) {
            writer.write(String.valueOf(loga));
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static File creatFils(String adress, String name) {
        File file = new File(adress);
        try {
            if (file.createNewFile()) loga.append("Файл ").append(name).append(" создан").append("\n");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }


    public static File createDirectory(String adress) {
        File fl = new File(adress);
        if (fl.mkdir()) loga.append("Каталог ").append(adress).append(" создан").append("\n");
        return fl;
    }
}
