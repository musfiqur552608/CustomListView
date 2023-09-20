package org.freedu.cricketworldcup

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class CountryAdapater(context: Context, countryList:ArrayList<ModelCountry>):ArrayAdapter<ModelCountry>(context, 0, countryList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if(listItemView==null){
            listItemView = LayoutInflater.from(context).inflate(R.layout.country_items, parent, false)

        }
        val courseModel:ModelCountry? = getItem(position)
        val countryImage = listItemView!!.findViewById<CircleImageView>(R.id.countryImg)
        val countryName = listItemView!!.findViewById<TextView>(R.id.countryName)
        val countryDetail = listItemView!!.findViewById<TextView>(R.id.countryDetails)

        countryName.setText(courseModel!!.countryName)
        countryDetail.setText(courseModel!!.countryDetails)
        countryImage.setImageResource(courseModel!!.countryImage)
        return listItemView
    }
}