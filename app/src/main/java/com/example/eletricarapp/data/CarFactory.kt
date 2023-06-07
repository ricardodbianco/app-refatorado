package com.example.eletricarapp.data

import com.example.eletricarapp.domain.Carro

object CarFactory {

    val list = listOf(
        Carro(
            id = 1,
            preco = "R$300.000,00",
            bateria = "300 kWh",
            potencia = "200cv",
            recarga = "30min",
            urlPhoto = "www.google.com.br",
            isFavorite = false
        ),
        Carro(
            id = 2,
            preco = "R$200.000,00",
            bateria = "200 kWh",
            potencia = "150cv",
            recarga = "40min",
            urlPhoto = "www.google.com.br",
            isFavorite = false
        )
    )
}

/*VERBOS HTTP
*   - GET -> Para recuperar informações
*   - POST -> Para enviar informações para um servidor
*   - DELETE -> Para deletar algum recurso
*   - PUT -> Alterar uma entidade como um todo
*   - PATCH -> Alterar atributo de uma entidade */