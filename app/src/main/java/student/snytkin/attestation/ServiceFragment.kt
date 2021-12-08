package student.snytkin.attestation

import android.R.attr
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import android.R.attr.inset

import android.R.attr.divider

import android.graphics.drawable.InsetDrawable
import android.graphics.drawable.Drawable
import android.content.res.TypedArray


class ServiceFragment : Fragment() {

    lateinit var serviceRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_service, container, false)

        val serviceList: List<Service> = listOf(
            Service(
                "ПОДКАЧКА",
                "Подкачка работником шиномонтажа одного колеса до указанного давления",
                "30 руб.",
                R.drawable.p0001
            ),
            Service(
                "ХРАНЕНИЕ",
                "Хранение сезонных покрышек на складе",
                "100 руб./месяц",
                R.drawable.p0002
            ),
            Service(
                "ПРОКОЛЫ",
                "Устранение проколов и мелких порезов с перебортовкой колеса и балансировкой",
                "600 руб.",
                R.drawable.p0003
            ),
            Service(
                "ПРАВКА ДИСКОВ",
                "Исправление гнутых дисков, прокатка дисков, устранение вмятин",
                "1200 руб.",
                R.drawable.p0004
            ),
            Service(
                "ДИАГНОСТИКА",
                "Диагностика состояния покрышек и нипелей, проверка балансировки",
                "50 руб.",
                R.drawable.p0005
            ),
            Service(
                "БАЛАНСИРОВКА",
                "Балансровка колёс на сверхточном оборудовании компании KRUTOTEN с двухгодовой гарантией",
                "от 300 руб.",
                R.drawable.p0006
            ),
            Service(
                "ВЫЕЗД",
                "Мобильный шиномонтажный пукт готов выехать по указанному адресу и оказать помощь на месте",
                "от 1500 руб.",
                R.drawable.p0007
            )
        )

        serviceRecyclerView = view.findViewById<RecyclerView>(R.id.service_recycle_view)
        serviceRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        serviceRecyclerView.adapter = ServiceAdapter(serviceList)


        return view
    }
}