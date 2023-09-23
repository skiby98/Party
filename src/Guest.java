public class Guest {
    private String name;
    private String meal;
    private Double phoneNumber;
    private boolean isVegan;

    public Guest(String name, String meal, Double phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }
    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }
    public Double getPhoneNumber() {
        return phoneNumber;
    }
    public boolean isVegan() {
        return isVegan;
    }
    public void displayGuestInformaction() {
        System.out.println("Imię: " + name);
        System.out.println("Preferowany posiłek: " + meal);
        System.out.println("Numer telefonu: " + phoneNumber);
        String isVeganString = isVegan ? "tak" : "nie";
        System.out.println("Veganin?: " + isVeganString);
        System.out.println();
    }
}
