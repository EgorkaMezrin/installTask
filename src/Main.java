import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<File> dir = Arrays.asList(
                new File("C://Games"),
                new File("C://Games/src"),
                new File("C://Games/res"),
                new File("C://Games/savegames"),
                new File("C://Games/temp"),
                new File("C://Games/src/main"),
                new File("C://Games/src/main"),
                new File("C://Games/src/test"),
                new File("C://Games/res/drawables"),
                new File("C://Games/res/vectors"),
                new File("C://Games/res/icons")
        );
        List<File> file = Arrays.asList(
                new File("C://Games/src/main", "Main.java"),
                new File("C://Games/src/main", "Utils.java"),
                new File("C://Games/temp", "temp.txt")
        );
        StringBuilder log = new StringBuilder();

        dir.forEach(currentDir ->{
            if (currentDir.mkdir()){
                System.out.println("Папка -"+ currentDir + "- создана");
                log.append("Папка -"+ currentDir + "- создана" + "\n");
            }else {
                System.out.println("Папка -"+ currentDir + "- уже существует");
                log.append("Папка -"+ currentDir + "- уже существует" + "\n");
            }
        });

        file.forEach(currentFile ->{
            if (currentFile.mkdir()){
                System.out.println("Папка -"+ currentFile + "- создана");
                log.append("Папка -"+ currentFile + "- создана" + "\n");
            }else {
                System.out.println("Папка -"+ currentFile + "- уже существует");
                log.append("Папка -"+ currentFile + "- уже существует" + "\n");
            }
        });

        try (FileWriter writer = new FileWriter("C://Games/temp/temp.txt", true)){
            writer.write(log +"\n");
            writer.flush();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }


   }

//    public static void crDir(String nameDir) {
//        File dir = new File(nameDir);
//        dir.mkdir();
//    }

//    public static String crFile(String nameFile) throws IOException {
//        File file = new File(nameFile);
//        if(file.createNewFile()){
//            return "Файл " + nameFile + " создан";
//        } else return "Файл "+ nameFile + " не создан";
//
//    }
}