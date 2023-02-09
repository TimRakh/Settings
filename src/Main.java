import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static StringBuilder loga = new StringBuilder();
    public static void main(String[] args) {



        File src = creatingFile("D://Games", "src");

        File res = creatingFile("D://Games", "res");

        File savegames = creatingFile("D://Games", "savegames");

        File temp = creatingFile("D://Games", "temp");

        File main = creatingFile("D://Games//src", "main");

        File test = creatingFile("D://Games//src", "test");

        File mainJava = creatFils("D://Games//src//main//Main.java","Main.java");

        File utils = creatFils("D://Games//src//main//Utils.java", "Utils.java");

        File drawables = creatingFile("D://Games//res", "drawables");

        File vectors = creatingFile("D://Games//res", "vectors");

        File icons = creatingFile("D://Games//res", "icons");

        File tempFile = creatFils("D://Games//temp//temp.txt", "temp.txt");

        try (FileWriter writer = new FileWriter("D://Games//temp//temp.txt",false)){
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


    public static File creatingFile(String adress, String nazv) {
        File fl = new File(adress, nazv);
        if (fl.mkdir()) loga.append("Каталог ").append(nazv).append(" создан").append("\n");
        return fl;
    }
}
