package com.alphalevi.soccernews.ui.favorites;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.alphalevi.soccernews.MainActivity;
import com.alphalevi.soccernews.databinding.FragmentFavoritesBinding;
import com.alphalevi.soccernews.domain.News;
import com.alphalevi.soccernews.ui.adapter.NewsAdapter;

public class FavoritesFragment extends Fragment {

    private FragmentFavoritesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FavoritesViewModel favoritesViewModel = new ViewModelProvider(this).get(FavoritesViewModel.class);

        binding = FragmentFavoritesBinding.inflate(inflater, container, false);

        loadFavoritesNews();

        return binding.getRoot();

    }

    private void loadFavoritesNews() {
        MainActivity activity = (MainActivity) getActivity();
        if(activity != null) {
            List<News> favoriteNews = activity.getDb().newsDao().loadFavoriteNews();
            binding.rvNews.setLayoutManager(new LinearLayoutManager(getContext()));
            binding.rvNews.setAdapter(new NewsAdapter(favoriteNews, updateNews -> {
                activity.getDb().newsDao().save(updateNews);
                loadFavoritesNews();
            }));
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}