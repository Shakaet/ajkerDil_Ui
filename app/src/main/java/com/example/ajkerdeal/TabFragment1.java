package com.example.ajkerdeal;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class TabFragment1 extends Fragment {

    View view;
    private RecyclerView gridView, gridView2;
    private RV1_GridViewAdapter_6 gridViewAdapter6, gridViewAdapter6_2;
    private ArrayList<RV1_RecyclerViewItem_6> value1, value2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_tab1, container, false);

        gridView = (RecyclerView) view.findViewById(R.id.grid);
        gridView2 = view.findViewById(R.id.grid2);

        // Initialize data
        setDummyData();  // Data for gridView
        setDummyData2(); // Data for gridView2

        // Set fixed size for both RecyclerViews
        gridView.setHasFixedSize(true);
        gridView2.setHasFixedSize(true);

        // Set layout manager and adapter for gridView (5 columns)
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 5);
        gridView.setLayoutManager(layoutManager);
        gridViewAdapter6 = new RV1_GridViewAdapter_6(value1, getActivity());
        gridView.setAdapter(gridViewAdapter6);

        // Set layout manager and adapter for gridView2 (4 columns)
        GridLayoutManager layoutManager2 = new GridLayoutManager(getActivity(), 4);
        gridView2.setLayoutManager(layoutManager2);
        gridViewAdapter6_2 = new RV1_GridViewAdapter_6(value2, getActivity());
        gridView2.setAdapter(gridViewAdapter6_2);

        return view;
    }

    // First dataset for gridView
    private void setDummyData() {
        value1 = new ArrayList<>();
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_3, "লাইভ শপিং"));
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_4, "বোগো"));
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_5, "গ্যাজেট ডিল"));
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_6, "কম্বো অফার"));
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_7, "শপিং ক্যাটাগরি"));
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_8, "বিক্রি করুন"));
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_9, "ভয়েস ম্যাসেজ"));
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_10, "আয় করুন"));
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_11, "ক্লাসিফাইড"));
        value1.add(new RV1_RecyclerViewItem_6(R.drawable.img_12, "হট ডিল"));
    }

    // Second dataset for gridView2
    private void setDummyData2() {
        value2 = new ArrayList<>();
        value2.add(new RV1_RecyclerViewItem_6(R.drawable.img_13, "১৩০ টাকা"));
        value2.add(new RV1_RecyclerViewItem_6(R.drawable.img_14, "৪০০ টাকা"));
        value2.add(new RV1_RecyclerViewItem_6(R.drawable.img_15, "২০০ টাকা"));
        value2.add(new RV1_RecyclerViewItem_6(R.drawable.img_16, "৪০০ টাকা"));
        value2.add(new RV1_RecyclerViewItem_6(R.drawable.img_17, "১৭০ টাকা"));
        value2.add(new RV1_RecyclerViewItem_6(R.drawable.img_18, "৫০০ টাকা"));
        value2.add(new RV1_RecyclerViewItem_6(R.drawable.img_19, "৩০০ টাকা"));
        value2.add(new RV1_RecyclerViewItem_6(R.drawable.img_20, "১৬০ টাকা"));

    }
}
