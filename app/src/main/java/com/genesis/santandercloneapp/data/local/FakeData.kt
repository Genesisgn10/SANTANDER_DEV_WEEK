package com.genesis.santandercloneapp.data.local

import com.genesis.santandercloneapp.data.Cartao
import com.genesis.santandercloneapp.data.Cliente
import com.genesis.santandercloneapp.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("Gênesis")
        val cartao = Cartao("411111111")
        return  Conta(
            "445655-4",
            "6552-4",
            "RS 2450,80",
            "R$ 4.120,00",
            cliente,
            cartao
        )
    }
}