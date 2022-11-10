import java.util.Scanner;

public class outfitSuggestions {
    public static void main(String[] args) {
        System.out.println("How is the weather today? choose from 'rainy', 'sunny', 'cloudy', 'snowy' :)");
        Scanner reader1 = new Scanner(System.in);
        String wea_con = reader1.nextLine();

        System.out.println("What's the average temperature today? unit in celsius, please :)");
        Scanner reader2 = new Scanner(System.in);
        String avg_temperature = reader2.nextLine();
        int ave_temp = Integer.parseInt(avg_temperature);
        String suggestion = "";

        if(wea_con.equals("rainy")) {
            String suggestion = "bring an umbrella";
        }

        if(wea_con.equals("sunny")) {
            String suggestion = "wear sunglasses";
        }

        if(wea_con.equals("cloudy")) {
            String suggestion = "enjoy the cozy weather";
        }

        if(wea_con.equals("snowy")) {
            String suggestion = "wear platform shoes, careful for slippery";
        }

        if(ave_temp <= 8) {
            System.out.println("Outfit suggestion for today is: " + suggestion + "and wear warm, thick coats");
        }

        if(ave_temp > 8 && ave_temp <= 20) {
            System.out.println("Outfit suggestion for today is: " + suggestion + "and pick one of your favourite hoodies");
        }

        if(ave_temp >= 21) {
            System.out.println("Outfit suggestion for today is: " + suggestion + "and T-shirt would be fine");
        }
    }
}
