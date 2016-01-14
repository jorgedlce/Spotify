package music.spotify.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import music.spotify.R;
import music.spotify.adapters.SongsAdapter;
import music.spotify.models.Song;

/**
 * A simple {@link Fragment} subclass.
 */
public class DestacadosFragment extends Fragment {



    ArrayList<Song> dataset;

    public DestacadosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_destacados, container, false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        ArrayList<Song> songs = new ArrayList<Song>();
        Song song  = new Song();
        song.setStars(3);
        song.setSongName("GerLucky");
        song.setSongArtist("DaftPunk");
        songs.add(song);

        Song song2  = new Song();
        song2.setStars(4);
        song2.setSongName("GerLucky");
        song2.setSongArtist("DaftPunk");
        songs.add(song2);


        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.my_recycler_view_song);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new SongsAdapter(songs, R.layout.row_songs));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
