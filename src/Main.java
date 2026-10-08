public class Main {

    public static void main(String[] args) {

        Pet pet = new Pet("Rex");

        System.out.println("Nome: " + pet.getNome());
        System.out.println("Fome: " + pet.getFome());
        System.out.println("Energia: " + pet.getEnergia());
        System.out.println("Humor: " + pet.getHumor());

        System.out.println("\n--- Alimentando o pet ---");

        pet.alimentar(30);

        System.out.println("Fome: " + pet.getFome());
        System.out.println("Humor: " + pet.getHumor());

        System.out.println("\n--- Pet brincando ---");

        pet.brincar();

        System.out.println("Fome: " + pet.getFome());
        System.out.println("Energia: " + pet.getEnergia());
        System.out.println("Humor: " + pet.getHumor());

        System.out.println("\n--- Pet dormindo ---");

        pet.dormir();

        System.out.println("Energia: " + pet.getEnergia());
        System.out.println("Humor: " + pet.getHumor());
    }
}