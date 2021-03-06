package com.fanchen.imovie.adapter.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.fanchen.imovie.base.BaseFragmentAdapter;
import com.fanchen.imovie.fragment.VideoListFragment;
import com.fanchen.imovie.retrofit.service.BobmaoService;

/**
 * BobmaoPagerAdapter
 * Created by fanchen on 2017/9/24.
 */
public class BobmaoPagerAdapter extends BaseFragmentAdapter{

    private final String[] TITLES = new String[]{"首页","电影", "电视剧", "动漫","综艺","小视频"};
    private final String[] PATHS = new String[]{"","dianying", "dianshiju", "dongman","zongyi","weidianying"};
    private final Boolean[] BANGUMI = new Boolean[]{true,false,false,false,false,false};
    private final String REFERER = "http://m.haodianying.cc/";

    public BobmaoPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public String[] getTitles() {
        return TITLES;
    }

    @Override
    public Fragment createFragment(int position) {
        return VideoListFragment.newInstance(PATHS[position], getExtendInfo().toString(), 1, 1, false, false, false, REFERER, BANGUMI[position]);
    }

    @Override
    public Object getExtendInfo() {
        return BobmaoService.class.getName();
    }

}
