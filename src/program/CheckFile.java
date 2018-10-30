package program;

import java.io.File;

public class CheckFile {
	private static boolean foundFolder = false;

    public static void main(String[] args) {
        File dir = new File("C:/Users/maverick/Desktop/demo");
        findDirectory(dir);
    }

    private static void findDirectory(File parentDirectory) {
        if(foundFolder) {
            return;
        }
        File[] files = parentDirectory.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                continue;
            }
            if (file.getName().equals("folderNameToFind")) {
                foundFolder = true;
                break;
            }
            if(file.isDirectory()) {
               findDirectory(file);
            }
        }
    }

}
