package Chapter15;

// Fig. 15.2: FileAndDirectoryInfo.java
// File class used to obtain file and directory information

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAndDirectoryInfo {
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        // Get path from user input
        System.out.println("Enter path of file or folder: ");
        Path path = Paths.get(input.nextLine());
        
        // get info about path, if it exists
        if (Files.exists(path)) {
            System.out.printf("%n%s exists%n", path.getFileName()); // path.getFileName()
            System.out.printf("%s an absolute path%n", path.isAbsolute() ? "is": "Is not"); // path.isAbsoluth()
            System.out.printf("Path: %s%n", path); // path
            System.out.printf("%s a directory%n", Files.isDirectory(path) ? "Is" : "Is not"); // Files.isDirectory(path)
            System.out.printf("Last modified: %s%n", Files.getLastModifiedTime(path)); // Files.getLastModifiedTime(path)
            System.out.printf("Size: %s%n", Files.size(path)); // Files.size(path)
            System.out.printf("Absolute path: %s%n", path.toAbsolutePath());
            System.out.printf("Owner: %s%n", Files.getOwner(path));
            System.out.printf("%s an executable file%n", Files.isExecutable(path) ? "Is" : "Is not");
            System.out.printf("OS separator: %s", File.separator);
          
            
            if (Files.isDirectory(path)) { // output directory contents
               System.out.println("\nDirectory contents:");
               
               // object for iterating through directory content
               DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
               
               for (Path p : directoryStream)
                   System.out.println(p.getFileName());
            }
        } else {
            System.out.printf("%s does not exist%n", path);
        }
        
    }
    
}
