package ObserwatorV3;

public class Subskrybent implements  IObserwator, IWyswietl{
    private final Instagram instagram;
    private String newPost;
    private int ktoryPost;

    public Subskrybent(Instagram instagram){
        this.instagram = instagram;
        newPost = instagram.getNewPost();
    }

    @Override
    public void updatePost(int ktoryPost, String post) {
        this.ktoryPost=ktoryPost;
        newPost = instagram.getNewPost();
        wyswietl();
    }

    @Override
    public void wyswietl() {

        System.out.println(ktoryPost+")"+newPost);

    }
}
