package si.um.feri.weatherapplight

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import si.um.feri.weatherapplight.vao.Weather

class ForecastListAdapter(var forecast: ArrayList<Weather>, var context: Context) :
    RecyclerView.Adapter<ForecastViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ForecastViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_forecast, parent, false)
    )

    override fun getItemCount(): Int = forecast.size

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) {
        holder.bind(forecast[position], context)
    }

}