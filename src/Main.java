import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList friendsList = new ArrayList();
        friendsList.add("Sidney");
        friendsList.add("Elsie");
        friendsList.add("Stuart");


//        friendsList.remove("Stuart");
//        friendsList.clear();
        System.out.println(friendsList.contains("Elsie"));
        System.out.println(friendsList);

    }
}