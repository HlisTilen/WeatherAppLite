package si.um.feri.weatherapplight

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_forecast.view.*
import si.um.feri.weatherapplight.vao.Weather

class ForecastViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val degrees = view.degrees
    private val day = view.day
    private val holder = view.forecastItemHolder
    fun bind(weather: Weather, contex: Context) {
        degrees.text = weather.tempFrom.toString()
        day.text = weather.timeStamp.toString()
        holder.setOnClickListener {
            Toast.makeText(
                contex,
                "Kliknil si na: ${weather.tempFrom} ${weather.timeStamp}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}