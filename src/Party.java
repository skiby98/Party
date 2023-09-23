import java.util.*;

public class Party {
    private List<Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Double, Guest> phoneToGuest = new HashMap();
    Scanner scanner = new Scanner(System.in);

    public void addGuest() {
        System.out.println("Podaj imię gościa:");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek:");
        String meal = scanner.nextLine();

        System.out.println("Podaj numer telefonu:");
        Double phoneNumber = scanner.nextDouble();

        System.out.println("Czy jesteś weganinem? (Y/N)");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if (isVeganString.equals("Y")) {
            isVegan = true;
        } else {
            isVegan = false;
        }

        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);
        guests.add(guest);
    }
    public void displayMeals() {
        for (String meal : meals) {
            System.out.println(meal);
            System.out.println();
        }
    }
    public void displayGuestByPhoneNumber() {
        System.out.println("Podaj numer telefonu: ");
        Double phoneNumber = scanner.nextDouble();
        Guest guest = phoneToGuest.get(phoneNumber);
        if(guest == null) {
            System.out.println("Nie znaleziono gościa o numerze telefonu:" + phoneNumber);
        } else {
            guest.displayGuestInformaction();
        }
    }
    public void displayGuests() {
        for (Guest guest : guests) {
            guest.displayGuestInformaction();
        }
    }
}
