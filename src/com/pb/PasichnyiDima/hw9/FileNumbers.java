package com.pb.PasichnyiDima.hw9;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    public static void createNumbersFile() throws Exception {
        Path path = Files.createFile(Paths.get("D:\\TestCreateFilesJava\\numbers.txt"));
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    Random random = new Random();
                    int x = random.nextInt(100);
                    {
                        writer.write(x + " ");
                    }
                }
                writer.write("\n");
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static void createOddNumbersFile () {
        Path path = Paths.get("D:\\TestCreateFilesJava\\numbers.txt");
        try(BufferedReader reader = Files.newBufferedReader(path))
        {
            int x;
            while((x = reader.read()) >= 0){
                Path pathWrite = Files.createFile(Paths.get("D:\\TestCreateFilesJava\\odd-numbers.txt"));
                try (BufferedWriter writer = Files.newBufferedWriter(pathWrite)) {
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                                if (x % 2 == 0) {
                                    x = 0;
                                }
                                writer.write(x + " ");
                            x = reader.read();
                        }
                        writer.write("\n");
                    }
                }
                catch(Exception ex){

                    System.out.println(ex.getMessage());
                }
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        createNumbersFile();
        createOddNumbersFile();
    }
}
