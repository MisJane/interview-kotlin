package app.intech

    object UniqueAppWords {
        fun process(input: List<String?>): List<String> {
            return input
                .filterNotNull() // Игнорируем null
                .map { it.replace(Regex("[aA]"), "4").uppercase() } // Заменяем a/A → 4 и переводим в верхний регистр
                .distinct() // Уникальные значения
        }
    }
