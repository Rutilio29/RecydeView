package duran_guerrero.rutilio.recydeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recydeview.R
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        val listaDeLugares = ArrayList<Lugar>()
        listaDeLugares.add(Lugar("Ameca","https://talajalisconoticias.com/wp-content/uploads/2020/05/ameca.jpg","Venden Picones"))
        listaDeLugares.add(Lugar("San Martin","https://media.ocioenlinea.com/uploads/media/2021/04/05/san-martin-de-hidalgo-gr.jpg","Venden Birria"))
        listaDeLugares.add(Lugar("Tapalpa","https://udgtv.com/wp-content/uploads/2020/08/Tapalpa-Mart%C3%ADn-%C3%81guilar.jpeg","Venden Rompope"))
        listaDeLugares.add(Lugar("El Cabezon","https://pbs.twimg.com/media/BRkdu4ACcAAV1hc.jpg:large","Venden Maiz Liso"))

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = LugarAdapter(listaDeLugares,this )
    }
}