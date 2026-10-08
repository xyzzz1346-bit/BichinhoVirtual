public class Pet {

    private String nome;
    private int fome;
    private int energia;

    // Construtor
    public Pet(String nome) {
        this.nome = nome;
        this.fome = 50;
        this.energia = 50;
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Getter da fome
    public int getFome() {
        return fome;
    }

    // Getter da energia
    public int getEnergia() {
        return energia;
    }

    // Alimentar o pet
    public void alimentar(int quantidade) {
        if (quantidade > 0) {
            fome -= quantidade;

            if (fome < 0) {
                fome = 0;
            }
        }
    }

    // Brincar com o pet
    public void brincar() {
        if (energia >= 10) {
            energia -= 10;
            fome += 10;

            if (fome > 100) {
                fome = 100;
            }
        }
    }

    // Dormir
    public void dormir() {
        energia += 30;

        if (energia > 100) {
            energia = 100;
        }
    }

    // Humor calculado automaticamente
    public String getHumor() {

        if (fome >= 80 || energia <= 20) {
            return "Triste";
        }

        if (fome <= 30 && energia >= 70) {
            return "Feliz";
        }

        return "Normal";
    }
}