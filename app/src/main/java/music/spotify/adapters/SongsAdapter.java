package music.spotify.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import music.spotify.R;
import music.spotify.models.Song;

/**
 * Created by jorge on 13-Jan-16.
 */
public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.ViewHolder>{

    ArrayList<Song> songs;
    int itemLayout;


    public SongsAdapter(ArrayList<Song> songs,int itemLayout ){
        this.itemLayout = itemLayout;
        this.songs = songs;
    }


    @Override
    public SongsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(itemLayout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(SongsAdapter.ViewHolder holder, int position) {

        Song song = songs.get(position);

        holder.namesong.setText(song.getSongName());
        holder.artist.setText(song.getSongArtist());
        holder.stars.setNumStars(song.getStars());
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView namesong;
        TextView artist ;
        RatingBar stars;


        public ViewHolder(View itemView) {
            super(itemView);

            namesong = (TextView) itemView.findViewById(R.id.name_song);
            artist  = (TextView) itemView.findViewById(R.id.name_artist);
            stars = (RatingBar) itemView.findViewById(R.id.ratingBar);


        }
    }
}
