//-> Create SimplePhone abstract classes and implement those functions.
// When you use call function it should ask who you want to call then should store it,
// if you text it should ask your text message and who you text with.
//
//-> Create YourNamePhone(HuseyinPhone) and inherit the SimplePhone and test your codes.
//
//NOTE: You can add related information or some necessary information to your classes.

import java.util.ArrayList;
import java.util.Scanner;

public class simplePhone {
    ArrayList<String> callHistory = new ArrayList<>();

    public simplePhone(String call, String text) {
    }

    public simplePhone() {

    }

    public void call() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Who do you want to call? ");
        String contact = scanner.nextLine();
        callHistory.add(contact);
        System.out.println("Calling " + contact + "...");
    }

    ArrayList<String> textHistory = new ArrayList<>();

    public void text() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who do you want to text");
        String contact = scanner.nextLine();
        textHistory.add(contact);
        System.out.println("Texting " + contact + "...");
    }
@Override
    public void showCallHistory() {
        System.out.println("Call History:");
        if (callHistory.isEmpty()) {
            System.out.println("No calls made.");
        } else {
            for (String call : callHistory) {
                System.out.println(call);
            }
        }
    }

public void showtextHistory(){
    System.out.println("Text history");
    if(textHistory.isEmpty()){
        System.out.println("no text history");
    }else {
        for (String text : textHistory){
            System.out.println(text);
        }
    }
}
}


