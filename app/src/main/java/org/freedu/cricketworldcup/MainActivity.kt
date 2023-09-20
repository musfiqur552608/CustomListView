package org.freedu.cricketworldcup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.freedu.cricketworldcup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val countryList:ArrayList<ModelCountry> = ArrayList<ModelCountry>()

        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "India", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Australia", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Newzeland", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))
        countryList.add(ModelCountry(R.color.black, "Bangladesh", "Rank 7"))

        val adapater = CountryAdapater(this, countryList)
        binding.listView.adapter = adapater
    }
}