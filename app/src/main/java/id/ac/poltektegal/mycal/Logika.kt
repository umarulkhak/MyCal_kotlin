package id.ac.poltektegal.mycal

    class Logika {
        var result = 0.0

        fun kali(p: Double, l: Double): Double {
            this.result = p * l
            return p * l
        }
        fun tambah(p: Double, l: Double): Double {
            this.result = p + l
            return p + l
        }
        fun bagi(p: Double, l: Double): Double {
            this.result = p / l
            return p / l
        }
        fun kurang(p: Double, l: Double): Double {
            this.result = p - l
            return p - l
        }
    }