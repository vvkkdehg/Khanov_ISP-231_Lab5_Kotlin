class GeometryCalculator {
    fun rectangleInfo(dl: Int, sh: Int){
        println("Прямоугольник $dl x $sh:")
        var per = 2 * (dl + sh)
        var pl = dl * sh
        println("Периметр: $per")
        println("Площадь: $pl")
        if (per == pl)
            println("Удивительно! Периметр равен площади!")
    }
    fun triangleInfo(a: Int, b: Int, c: Int){
        println("Треугольник со сторонами: $a, $b, $c:")
        if ((a*a + b*b == c*c) || (c*c + b*b == a*a) || (c*c + a*a == b*b))
            println("Это прямоугольный треугольник!")
        else
            println("Это не прямоугольный треугольник!")
        println("Периметр: ${a+b+c}")
    }
    fun circleInfo(r: Int) {
        println("Окружность с радиусом $r:")
        var dl = 2 * Math.PI * r
        var pl = Math.PI * r * r
        println("Длина окружности: $dl")
        println("Площадь круга: ${"%.1f".format(pl)}")
    }
}