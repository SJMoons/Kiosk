package com.example.week_1_kiosk
import com.example.week_1_kiosk.Payment as Payment
import com.example.week_1_kiosk.Menu as Menu

class Flow {
    var menu = Menu()
    var main = Main(menu)
    var pay = Payment(menu)
    var packaging: Int? = 0

    init {
    }

    fun flowStart() {
        while(true) {
            println("1.매장에서 먹기, 2.테이크아웃")
            try {
                packaging = readLine()?.toInt()
            } catch (e: NumberFormatException) {
                null
            } finally {
                if (packaging == 1 || packaging ==2) {
                    break
                } else {
                    println("다시 입력해주십시오")
                }
            }
        }
        while(true) {
            main.categoryOrder()
            main.menuOrder()
            if (main.topingYesNot == 1) {
                main.toping()
                main.calculateCups()
                main.basket()
                if (main.continueOrNot == 2) {
                    break
                } else if (main.continueOrNot == 3) {
                    main.deleteMenu()
                    break
                }
            } else if (main.topingYesNot == 2) {
                main.calculateCups()
                main.basket()
                if (main.continueOrNot == 2) {
                    break
                } else if (main.continueOrNot == 3) {
                    main.deleteMenu()
                    break
                }
            }
        }
        pay.payWay()
        pay.receipt(main.index,packaging!!,main.topingIndex)

    }
}


fun main() {
    var flow = Flow()
    flow.flowStart()
}

