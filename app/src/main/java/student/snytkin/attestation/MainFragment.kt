package student.snytkin.attestation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MainFragment : Fragment() {

    lateinit var showSiteButton: Button
    lateinit var makeCallButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        showSiteButton = view.findViewById<Button>(R.id.site_button)
        showSiteButton.setOnClickListener {
            val link = Uri.parse("http://google.com")
            val siteIntent = Intent(Intent.ACTION_VIEW, link)
            context?.startActivity(siteIntent)
        }

        makeCallButton = view.findViewById<Button>(R.id.call_button)
        makeCallButton.setOnClickListener {
            val link = Uri.parse("tel:+75555555555")
            val callIntent = Intent(Intent.ACTION_CALL, link)
            startActivity(callIntent)

//            val link = Uri.parse("call:+75555555555")
//            val intent = Intent(Intent.ACTION_CALL, link)
//            context?.startActivity(intent)

        }

        return view
    }

}