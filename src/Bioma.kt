enum class Bioma(val tiposDePlantas: List<String>) {
    DESIERTO(listOf("Cactus", "Suculenta")),
    INTERIOR(listOf("Cactus de Interior", "Pothos", "Helecho", "Palma de Interior")),
    EXTERIOR(listOf("Rosas", "Lavanda", "Hortensia", "Clemátide")),
    SELVA(listOf("Orquídea", "Helecho", "Anturio", "Costilla de Adán"))
}