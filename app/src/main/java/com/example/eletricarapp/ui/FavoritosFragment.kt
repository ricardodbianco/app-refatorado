package com.example.eletricarapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.eletricarapp.R
import com.example.eletricarapp.data.local.CarRepository
import com.example.eletricarapp.domain.Carro
import com.example.eletricarapp.ui.adapter.CarAdapter

class FavoritosFragment : Fragment() {

    lateinit var listaCarrosFavoritos: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.favoritos_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView(view)
        setupList()
    }

    private fun getCarsOnLocalDb(): List<Carro> {
        val repository = CarRepository(requireContext())
        val carList = repository.getAll()
        return carList
    }

    fun setupView(view: View) {
        view.apply {
            listaCarrosFavoritos = findViewById(R.id.rv_lista_carros_favoritos)
        }
    }

    fun setupList() {
        val cars = getCarsOnLocalDb()
        val carroAdapter = CarAdapter(cars, isFavoriteScreen = true)
        //opção 1 de layoutManager: listaCarros.layoutManager = LinearLayoutManager(this)
        listaCarrosFavoritos.apply {
            isVisible = true
            adapter = carroAdapter
        }
        carroAdapter.carItemLister = { carro ->
           // val isSaved = CarRepository(requireContext()).saveIfNotExist(carro)
        }
    }
}