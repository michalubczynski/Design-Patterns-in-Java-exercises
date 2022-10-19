package ObserwatorV3;

public class main {
    public static void main(String[] args){
    Instagram instagram = new Instagram();
    Subskrybent subskrybent1 = new Subskrybent(instagram);
        Subskrybent subskrybent2 = new Subskrybent(instagram);

        instagram.attach(subskrybent1);
    instagram.attach(subskrybent2);
    instagram.publishNewPost("NOWY POST WLECIAL.!>! NA MOJEGO INSTA>!>!> OBCZAIIIII");
    instagram.detach(subskrybent1);
    instagram.publishNewPost("I kolejny pościk");

    }
}
