package austinguo550.yikyakapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by James on 7/1/2015.
 */
public class PostAdapter extends ArrayAdapter<Post> {
    //View lookup cache
    private static class ViewHolder {
        TextView name;
        TextView post;
        ImageView image;
        //probably have to add more for voting
    }


    public PostAdapter(Context context, ArrayList<Post> posts) {
        super(context, R.layout.item_post, posts);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Post post = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_post, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.post = (TextView) convertView.findViewById(R.id.tvPost);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.name.setText(post.name);
        viewHolder.post.setText(post.post);
        // Return the completed view to render on screen
        return convertView;

        /* fallback if all else fails
        // Get the data item for this position
        Post post = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_post, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvPost);
        // Populate the data into the template view using the data object
        tvName.setText(post.name);
        tvHome.setText(post.post);
        // Return the completed view to render on screen
        return convertView;*/
    }
}
