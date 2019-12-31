package com.example.viewbindingdemosecond;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;

import com.example.viewbindingdemosecond.databinding.DetailCustomerBinding;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    private DetailCustomerBinding detailCustomerBinding;

    private List<Customer> customers;

    public ListViewAdapter(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public int getCount() {
        return customers.size();
    }

    @Override
    public Object getItem(int position) {
        return customers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        detailCustomerBinding = DataBindingUtil.inflate(inflater, R.layout.detail_customer, parent, false);
        Customer customer = (Customer) getItem(position);
        detailCustomerBinding.setCustomer(customer);

        return detailCustomerBinding.getRoot();
    }
}
