import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] dirNamesGames = new String[] {"src", "res", "savegames", "temp"};
        String[] dirNamesSrc = new String[] {"main", "test"};
        String[] fileNamesMain = new String[] {"Main.java", "Utils.java"};
        String[] dirNamesRes = new String[] {"drawables", "vectors", "icons"};
        StringBuilder logs = new StringBuilder();


        for(String name: dirNamesGames){
            File dir = new File("D://Games/" + name);
            dir.mkdir();
            logs.append("Корневая папка " + name + " создана\n");
        }

        for(String name: dirNamesSrc){
            File dir = new File("D://Games/src/" + name);
            dir.mkdir();
            logs.append("Папка в каталоге src " + name + " создана\n");
        }

        for(String name: fileNamesMain){
            File file = new File("D://Games/main" + name);

            if(file.createNewFile()){
                logs.append("Файл " + name + " создан\n");
            }
            else logs.append("Файл " + name + " не создан\n");

        }

        for(String name: dirNamesRes){
            File dir = new File("D://Games/res/" + name);
            dir.mkdir();
            logs.append("Папка в каталоге res " + name + " создана\n");
        }

        File temp = new File("D://Games/temp",  "temp.txt");

        if(temp.createNewFile()){
            logs.append("Файл temp создан\n");
        }
        else logs.append("Файл temp не создан\n");

        FileWriter fw = new FileWriter("D://Games/temp/temp.txt");
        fw.write(String.valueOf(logs));
        fw.flush();

        System.out.println(logs);
    }
}