package austinguo550.yikyakapp;

/**
 * Created by James on 6/29/2015.
 */
//package com.android4devs.slidingtab;

        import android.app.ListFragment;
        import android.app.LoaderManager;
        import android.content.Loader;
        import android.database.Cursor;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.SimpleCursorAdapter;

        import java.util.ArrayList;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab1 extends Fragment {

    Post firstPost = new Post("user", "Hi this is the first post");
    Post secondPost = new Post("user2", "This is the second post but I can't figure out how to frickin put in a picture. This is a listView that reads Post objects from an Arraylist so we have to add shit to the server later and read from the server to add to the Arraylist.");
    public ArrayList<Post> posts = new ArrayList<Post>();



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //just a first post for demo, remove later
        posts.add(firstPost);
        posts.add(secondPost);

        //actual good stuff
        View v =inflater.inflate(R.layout.tab_1,container,false);
        ListView list = (ListView) v.findViewById(R.id.recent_posts); //initializes the listView
        PostAdapter adapter = new PostAdapter(getActivity(), posts); //ArrayAdapter<T> can hold a "Post" object later. simple_list_item_1 is a simple textView for now
        list.setAdapter(adapter);
        return v;
    }


}
