package student.snytkin.attestation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

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
        bottomNavigation.selectedItemId = R.id.fragment_main
    }

    fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}