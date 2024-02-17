package bryan.miranda.applistado

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Mandar a llamar a los elementos de la pantalla
        val miRecyclerView = findViewById<RecyclerView>(R.id.miRecyclerView)
        miRecyclerView.layoutManager = LinearLayoutManager(this)

        //Listado de datos o Los datos de la Base de datos

        val datos = arrayOf("Bryan", "Juan", "Pablo", "Jose", "Lucas", "Maria", "Lucia", "Juan", "Pablo", "Jose", "Lucas" )

        //Configuro el adaptador que alimentará la lista
        val miAdaptador = ClaseAdaptador(datos)
        miRecyclerView.adapter = miAdaptador
    }
}