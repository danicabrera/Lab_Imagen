package com.rm.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), NoticiasAdaptador.NoticiasHolder.ClickListener{
    private lateinit var noticias: MutableList<Noticia>
    private val adaptador = NoticiasAdaptador(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        noticias.add(Noticia("Prueba", "http://gtpreviene.researchmobile.co:3000/uploads/clh4lmsqs9xk5uah_juanito.jpeg"))

        val listaNoticias: RecyclerView = findViewById(R.id.listaNoticias)
        listaNoticias.layoutManager = LinearLayoutManager(this)
        listaNoticias.adapter = adaptador


    }
    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return onCreateView(inflater, container, savedInstanceState)
    }

    override fun onItemClicked(position: Int) {

    }

    override fun onItemLongClicked(position: Int): Boolean {

        return true
    }

}


