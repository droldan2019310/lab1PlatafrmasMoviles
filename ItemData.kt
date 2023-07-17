class ItemData  constructor(val originalValue:Any){

    fun getType(): String? {

        if (originalValue is String) {
            return "cadena"
        } else if (originalValue is Int) {
            return "entero"
        } else if (originalValue is Boolean) {
            return "booleano"
        }

        return null
    }

    fun getInfo(): String?{
        if (originalValue is String) {
            return "L" + originalValue.length + 1
        } else if (originalValue is Int) {
            return if (originalValue as Int % 10 == 0) {
                "M10"
            } else if (originalValue as Int % 5 == 0) {
                "M5"
            } else if (originalValue as Int % 2 == 0) {
                "M2"
            } else {
                null
            }
        } else if (originalValue is Boolean) {
            return if (originalValue as Boolean) {
                "Verdadero"
            } else {
                "Falso"
            }
        }
        return null
    }

}