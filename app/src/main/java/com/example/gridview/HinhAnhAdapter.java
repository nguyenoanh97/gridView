package com.example.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class HinhAnhAdapter extends BaseAdapter {
    Context mycontext;
    int mylayout;
    List<HinhAnh> mangHinhAnh;

    public HinhAnhAdapter(Context mycontext, int mylayout, List<HinhAnh> mangHinhAnh) {
        this.mycontext = mycontext;
        this.mylayout = mylayout;
        this.mangHinhAnh = mangHinhAnh;
    }

    @Override
    public int getCount() {
        return mangHinhAnh.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(mylayout, null);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imageviewHinhAnh);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();

        }

        HinhAnh hinhAnh = mangHinhAnh.get(position);
        holder.imgHinh.setImageResource(hinhAnh.getHinh());




        return convertView;
    }
}
