import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //task A
        ArrayList<String> song = new ArrayList<>();
        String string1 = "Ветер с моря дул";

        String string2 = "Нагонял беду";

        String string3 = "И сказал ты мне";

        String string4 = "Больше не приду";

        song.add(string1);
        song.add(string1);
        song.add(string2);
        song.add(string2);
        song.add(string3);
        song.add(string3);
        song.add(string4);
        song.add(string4);
        ArrayList<String> song2 = new ArrayList<>();
        song2.addAll(song);

        ArrayList<String> song3 = new ArrayList<>();
        for (int i = 0; i < song.size(); i++){
            if(song.get(i).length() >= 15){
                song3.add(song.get(i));
            }
        }
        System.out.println(song3);
        for (int i = 0; i < song3.size(); i++) {
                song3.remove("И сказал ты мне");

        }
        System.out.println(song3);


        //taskB
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1, 101));
        }

            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 != 0) {
                    oddNumbers.add(numbers.get(i));
                }
                else if (evenNumbers.add(numbers.get(i)));
            }
            System.out.println(evenNumbers);
            System.out.println(oddNumbers);
        }
    }

