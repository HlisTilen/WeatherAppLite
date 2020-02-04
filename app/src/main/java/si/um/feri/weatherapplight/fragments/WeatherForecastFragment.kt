package si.um.feri.weatherapplight.fragments


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_weather_forecast.*
import si.um.feri.weatherapplight.ForecastListAdapter

import si.um.feri.weatherapplight.R
import si.um.feri.weatherapplight.VnosActivity
import si.um.feri.weatherapplight.vao.Weather

class WeatherForecastFragment : Fragment() {

    private lateinit var forecastAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_weather_forecast, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewManager = LinearLayoutManager(context)
        forecastAdapter = ForecastListAdapter(
            arrayListOf(
                Weather(
                    false,
                    1,
                    true,
                    1,
                    1.0,
                    "Maribor",
                    1,
                    1,
                    1.0,
                    1.0,
                    1.0,
                    5.0,
                    1.toLong()
                )
            ), context!!
        )
        forecastList.apply {
            layoutManager = viewManager
            adapter = forecastAdapter
        }
    }
}
