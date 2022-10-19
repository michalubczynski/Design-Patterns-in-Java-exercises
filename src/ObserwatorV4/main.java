package ObserwatorV4;

public class main {
    public static void main(String[] args) {
    Instagram instagram = new Instagram();
    Subskrybent subskrybent = new Subskrybent();
    Subskrybent subskrybent1 = new Subskrybent();
    instagram.addObserver(subskrybent);
    instagram.setNewPost("NOWY POOOOOOOSCIK");

    }
}
