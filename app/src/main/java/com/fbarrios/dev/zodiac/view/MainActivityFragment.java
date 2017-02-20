package com.fbarrios.dev.zodiac.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.fbarrios.dev.zodiac.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    private ImageButton ariesIb;
    private ImageButton aquariusIb;
    private ImageButton taurusIb;
    private ImageButton cancerIb;
    private ImageButton capricornIb;
    private ImageButton geminiIb;
    private ImageButton leoIb;
    private ImageButton libraIb;
    private ImageButton piscesIb;
    private ImageButton sagittariusIb;
    private ImageButton scorpioIb;
    private ImageButton virgoIb;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ariesIb = (ImageButton) view.findViewById(R.id.ariesIb);
        aquariusIb = (ImageButton) view.findViewById(R.id.aquariusIb);
        taurusIb = (ImageButton) view.findViewById(R.id.taurusIb);
        cancerIb = (ImageButton) view.findViewById(R.id.cancerIb);
        capricornIb = (ImageButton) view.findViewById(R.id.capricornIb);
        geminiIb = (ImageButton) view.findViewById(R.id.geminiIb);
        leoIb = (ImageButton) view.findViewById(R.id.leoIb);
        libraIb = (ImageButton) view.findViewById(R.id.libraIb);
        piscesIb = (ImageButton) view.findViewById(R.id.piscesIb);
        sagittariusIb = (ImageButton) view.findViewById(R.id.sagittariusIb);
        scorpioIb = (ImageButton) view.findViewById(R.id.scorpioIb);
        virgoIb = (ImageButton) view.findViewById(R.id.virgoIb);

        ariesIb.setOnClickListener(this);
        aquariusIb.setOnClickListener(this);
        taurusIb.setOnClickListener(this);
        cancerIb.setOnClickListener(this);
        capricornIb.setOnClickListener(this);
        geminiIb.setOnClickListener(this);
        leoIb.setOnClickListener(this);
        libraIb.setOnClickListener(this);
        piscesIb.setOnClickListener(this);
        sagittariusIb.setOnClickListener(this);
        scorpioIb.setOnClickListener(this);
        virgoIb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(getActivity(), DetailedActivity.class);
        Bundle bundle = new Bundle();

        switch (v.getId()) {

            case R.id.ariesIb:
                bundle.putString("ZODIAC", "aries");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsAries = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), ariesIb, "mainImageTransition");
                startActivity(intent, optionsAries.toBundle());

                break;
            case R.id.aquariusIb:
                bundle.putString("ZODIAC", "aquarius");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsAquarius = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), aquariusIb, "mainImageTransition");
                startActivity(intent, optionsAquarius.toBundle());
                break;
            case R.id.taurusIb:
                bundle.putString("ZODIAC", "taurus");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsTaurus = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), taurusIb, "mainImageTransition");
                startActivity(intent, optionsTaurus.toBundle());
                break;
            case R.id.cancerIb:
                bundle.putString("ZODIAC", "cancer");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsCancer = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), cancerIb, "mainImageTransition");
                startActivity(intent, optionsCancer.toBundle());
                break;
            case R.id.capricornIb:
                bundle.putString("ZODIAC", "capricorn");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsCapricorn = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), capricornIb, "mainImageTransition");
                startActivity(intent, optionsCapricorn.toBundle());
                break;
            case R.id.geminiIb:
                bundle.putString("ZODIAC", "gemini");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsGemini = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), geminiIb, "mainImageTransition");
                startActivity(intent, optionsGemini.toBundle());
                break;
            case R.id.leoIb:
                bundle.putString("ZODIAC", "leo");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsLeo = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), leoIb, "mainImageTransition");
                startActivity(intent, optionsLeo.toBundle());
                break;
            case R.id.libraIb:
                bundle.putString("ZODIAC", "libra");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsLibra = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), libraIb, "mainImageTransition");
                startActivity(intent, optionsLibra.toBundle());
                break;
            case R.id.piscesIb:
                bundle.putString("ZODIAC", "pisces");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsPisces = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), piscesIb, "mainImageTransition");
                startActivity(intent, optionsPisces.toBundle());
                break;

            case R.id.sagittariusIb:
                bundle.putString("ZODIAC", "sagittarius");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsSagittarius = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), sagittariusIb, "mainImageTransition");
                startActivity(intent, optionsSagittarius.toBundle());
                break;

            case R.id.scorpioIb:
                bundle.putString("ZODIAC", "scorpio");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsScorpio = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), scorpioIb, "mainImageTransition");
                startActivity(intent, optionsScorpio.toBundle());
                break;

            case R.id.virgoIb:
                bundle.putString("ZODIAC", "virgo");
                intent.putExtras(bundle);
                ActivityOptionsCompat optionsVirgo = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), virgoIb, "mainImageTransition");
                startActivity(intent, optionsVirgo.toBundle());
                break;
        }
    }
}
