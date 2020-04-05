package com.yibao.music.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.yibao.music.base.BasePagerAdapter;
import com.yibao.music.fragment.AboutFragment;
import com.yibao.music.fragment.AlbumFragment;
import com.yibao.music.fragment.ArtistFragment;
import com.yibao.music.fragment.PlayListFragment;
import com.yibao.music.fragment.SongFragment;
import com.yibao.music.util.Constants;

import org.jetbrains.annotations.NotNull;

/**
 * 作者：Stran on 2017/3/23 03:31
 * 描述：${TODO}
 * 邮箱：strangermy@outlook.com
 *
 * @author Stran
 */
public class MusicPagerAdapter
        extends BasePagerAdapter {
    String[] fagArr = {};

    public MusicPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NotNull
    @Override
    public Fragment getItem(int position) {
        return getFragment(position);
    }


    @Override
    public int getCount() {
        return Constants.NUMBER_FIVE;
    }

    private Fragment getFragment(int position) {
        Fragment fragment = SongFragment.newInstance();
        switch (position) {
            case 0:
                fragment = PlayListFragment.newInstance("lsp", null, false);
                break;
            case 1:
                fragment = ArtistFragment.newInstance();
                break;
            case 2:
                fragment = SongFragment.newInstance();
                break;
            case 3:
                fragment = AlbumFragment.newInstance();
                break;
            case 4:
                fragment = AboutFragment.newInstance();
                break;
            default:
                break;
        }
        return fragment;
    }

}
