package student.snytkin.attestation

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ServiceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val serviceImageView: ImageView =itemView.findViewById(R.id.service_image_view)
    private val serviceNameTextView: TextView =itemView.findViewById(R.id.service_name_text_view)
    private val serviceDescribTextView: TextView =itemView.findViewById(R.id.service_describ_text_view)
    private val servicePriceTextView: TextView =itemView.findViewById(R.id.service_price_text_view)

    fun bind (service: Service) {
        serviceImageView.setImageResource(service.image)
        serviceNameTextView.text = service.name
        serviceDescribTextView.text = service.desciption
        servicePriceTextView.text = service.price
    }
}