package bryan.miranda.applistado

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ClaseAdaptador(private val Datos: Array<String>) :  RecyclerView.Adapter<ClaseAdaptador.MyViewHolder>() {

    // mandamos a llamar los elementos del xml
    //Aqui se debe llamar a todos los elementos que esten en la plantilla de la card
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.txtNombre)
    }

    // Crea un nueva vista para cada elemento del Array
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        //De donde sacamos esos elementos para crear la vista?
        val vista = LayoutInflater.from(parent.context).inflate(R.layout.activity_card_plantilla, parent, false)

        //retornamos la vista o las vistas
        return MyViewHolder(vista)
    }

    // Devuelve la cantidad de vistas que va a crear
    override fun getItemCount() = Datos.size


    // Reemplaza el contenido de la vista con los datos del elemento en una posición determinada
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //Reemplazamos el texto
        holder.textView.setText(Datos[position])
    }

}