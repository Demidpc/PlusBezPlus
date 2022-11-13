package com.example.plusbezplus

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // это функция которая будет считать сумму
        fun summa(x: Int, y: Int): Int {
            var x = x // иницыализация x и y
            var y = y //

            var A: Int // создал переменые класса (целое число)
            var B: Int //

            // сделал для того чтобы сначала выполнился код хотя бы один раз
            do {
                A = x and y // если по умному (конъюнкция) 1011 и 1110 = 1010
                B = x xor y // если есть отличие : 1011 отличие 1110 = 0101

                x = A shl 1 // дсвиг по двоичной системе на ноль вправо : или же умножение на 2 : 1011 = 10110
                y = B
            } while (A != 0)

            return B
        }

        // а это главная функция (она тут всем заведует:) )
        fun main(x: Int, y: Int) {
            Log.d("Проверка", "${summa(x, y)}")
        }

        main(99, 100) // запуск функции (Выполнил Курицын Демид Михайлович) <3

    }
}