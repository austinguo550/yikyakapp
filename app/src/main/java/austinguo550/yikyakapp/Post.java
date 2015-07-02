package austinguo550.yikyakapp;

import android.media.Image;

/**
 * Created by James on 7/1/2015.
 */
public class Post {
    public String name;
    public String post;
    public Image image;
    public int voteCount; //0 when first constructed
    //added change vote count stuff later

    public Post(String name, String post) {
        this.name = name;
        this.post = post;
    }

    public Post(String name, String post, Image image) {
        this.name = name;
        this.post = post;
        this.image = image;
    }

    public void upVote() {
        voteCount++;
    }

    public void downVote(){
        voteCount--; //should we set limit on how low the votes can go?
    }
}