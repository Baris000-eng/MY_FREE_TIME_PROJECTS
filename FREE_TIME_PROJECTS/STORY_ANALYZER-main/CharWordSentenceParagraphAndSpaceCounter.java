import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharWordSentenceParagraphAndSpaceCounter {
    private static final long SLEEP_TIME = 15;
    private static Clip clip;
    private static FloatControl fc;

    public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {
        int lineCount = 0, letterCount = 0, digitCount = 0, upperCaseCount = 0, lowerCaseCount = 0;
        int wordCount = 0, sentenceCount = 0, charCount = 0, spaceCount = 0, paragraphCount = 0;
        int definedInUnicodeCount = 0, letterOrDigitCount=0;
        int index = 0;
        System.out.println("---------Welcome to the Story Analyzer Desktop App----------");
        Scanner sc = new Scanner(System.in);
        System.out.print("How many seconds do you want to wait before the results come?:");
        long sleepTime = sc.nextLong();
        System.out.println("Story Statistics are loading .....");
        playMusic();
        Thread.sleep(sleepTime * (long)Math.pow(10,3));
        FileReader fileReader = new FileReader("story.txt");
        Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                lineCount++;
            }
            String string = Files.readString(Path.of("story.txt"));
            for (int ind = 0; ind < string.length(); ind++) {
                if (Character.isWhitespace(string.charAt(ind))) {
                    spaceCount++;
                } else if (Character.isDigit(string.charAt(ind))) {
                    digitCount++;
                } else if (Character.isUpperCase(string.charAt(ind))) {
                    upperCaseCount++;
                } else if (Character.isLowerCase(string.charAt(ind))) {
                    lowerCaseCount++;
                }

                if (Character.isLetter(string.charAt(ind))) {
                    letterCount++;
                }

                if (Character.isDefined(string.charAt(ind))) {
                    definedInUnicodeCount++;
                }

                if (Character.isLetterOrDigit(string.charAt(ind))) {
                    letterOrDigitCount++;
                }


            }
            String[] sentences = string.split("\\.|\\?|\\!");
            String[] words = string.trim().replaceAll("\\p{Punct}", "").split(" ");
            String[] paragraphs = string.split("(?m)(?=^\\s{4})");

            sentenceCount = sentences.length;
            wordCount = words.length;
            paragraphCount = paragraphs.length;
            charCount = string.length();

            System.out.println("The number of lines in this story is: " + lineCount + "");
            System.out.println("The number of words in this story is: " + wordCount + "");
            System.out.println("The number of paragraphs in this story is: " + paragraphCount + "");
            System.out.println("The number of sentences in this story is: " + sentenceCount + "");
            System.out.println("The number of spaces in this story is: " + spaceCount + "");
            System.out.println("The number of digits in this story is: " + digitCount + "");
            System.out.println("The number of charachters in this story is: " + charCount + "");
            System.out.println("The number of upper-case charachters in this story is: " + upperCaseCount + "");
            System.out.println("The number of lower-case charachters in this story is: " + lowerCaseCount + "");
            System.out.println("The number of letters in this story is: " + letterCount + "");
            System.out.println("The number of charachters having definitions in Unicode in this story is: " + definedInUnicodeCount + "");
            System.out.println("The number of charachters which are letter or digit is: " + letterOrDigitCount);
        }


    public static void playThemeSong(String fileLocation) {
        try {
            File file= new File(fileLocation);
            if(file.exists()) {
                AudioInputStream audioInp= AudioSystem.getAudioInputStream(file);
                clip= AudioSystem.getClip();
                clip.open(audioInp);
                fc= (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                System.out.println("File not found!!!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void playMusic() {
        playThemeSong("song.wav");
    }

}


