package student.snytkin.attestation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_MENU_ITEM = "LAST_SELECTED_MENU_ITEM"

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigation = findViewById(R.id.bottom_navigation)

        bottomNavigation.setOnItemSelectedListener { item ->
            var fragment: Fragment?=null
            when (item.itemId) {
                R.id.fragment_main -> {fragment = MainFragment()}
                R.id.fragment_service -> {fragment = ServiceFragment()}
                R.id.fragment_map -> {fragment = MapFragment()}
            }
            replaceFragment(fragment!!)
            true
        }
        bottomNavigation.selectedItemId = savedInstanceState?.getInt(LAST_SELECTED_MENU_ITEM) ?: R.id.fragment_main
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_SELECTED_MENU_ITEM, bottomNavigation.selectedItemId)
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}