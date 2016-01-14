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
import music.spotify.adapters.AmigosAdapter;
import music.spotify.models.Amigo;

/**
 * A simple {@link Fragment} subclass.
 */
public class AmigosFragment extends Fragment {


    public AmigosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_amigos, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayList<Amigo> amigoArrayList =new ArrayList<Amigo>();

        Amigo jorge =new Amigo();
        jorge.setNombre("Jorge Luis");
        jorge.setTwitter("@jorgedlce");
        jorge.setUltimaCancion("Arriba los cubanos");
        amigoArrayList.add(jorge);

        Amigo jorge2 =new Amigo();
        jorge2.setNombre("Jorge Luis");
        jorge2.setTwitter("@jorgedlce");
        jorge2.setUltimaCancion("Arriba los cubanos");
        amigoArrayList.add(jorge2);

        Amigo jorge3 =new Amigo();
        jorge3.setNombre("Jorge Luis");
        jorge3.setTwitter("@jorgedlce");
        jorge3.setUltimaCancion("Arriba los cubanos");
        amigoArrayList.add(jorge3);

        Amigo jorge4 =new Amigo();
        jorge4.setNombre("Jorge Luis");
        jorge4.setTwitter("@jorgedlce");
        jorge4.setUltimaCancion("Arriba los cubanos");
        amigoArrayList.add(jorge4);

        RecyclerView recyclerView = (RecyclerView)getActivity().findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new AmigosAdapter(amigoArrayList, R.layout.row_amigos));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));//Manager
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
}
