fun main () {
    val cliente1 = Cliente(
        "Natan",
        "000.000.000-00",
        22,
        "Homem",
        "00-00000-0000"
    )
    cliente1.altura = 1.81
    cliente1.gostos = "Gosta de música extrema"

    val cliente2 = Cliente(
        "Roberto",
        "000.000.000-00",
        38,
        "Homem",
        "00-00000-0000"
    )
    cliente2.gostos = "Gosta de filmes de terror"
    val cliente3 = Cliente(
        "Daniela",
        "000.000.000-00",
        19,
        "Mulher",
        "00-00000-0000"
    )
    cliente3.altura = 1.54

    cliente1.infosCliente()
    cliente2.infosCliente()
    cliente3.infosCliente()

}