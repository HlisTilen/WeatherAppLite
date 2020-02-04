package si.um.feri.weatherapplight

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import si.um.feri.weatherapplight.fragments.ProfileFragment
import si.um.feri.weatherapplight.fragments.WeatherForecastFragment
import si.um.feri.weatherapplight.fragments.WeatherTodayFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                WeatherTodayFragment()
            }
            1 -> {
                WeatherForecastFragment()
            }
            else -> {
                ProfileFragment()
            }
        }
    }

}