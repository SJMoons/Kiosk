package com.example.week_1_kiosk

class DeleteMenu(var menu:Menu,var order:OrderMenu) {
    var deleteNum: Int = 0
    var deleteSum: Int = 0
    var deleteStop: Int = 0
    init {

    }

    fun deleteMenu() {
        while (true) {
            println("무엇을 삭제하시겠습니까?")
            for (i in 0..order.index - 1) {
                println(
                    "${i + 1}. ${menu.appendMenu.get(i)} ${menu.appendCups.get(i)}잔 ${
                        menu.appendTotalCost.get(
                            i
                        )
                    }원"
                )
            }
            deleteNum = readLine()!!.toInt()
            menu.appendMenu.removeAt(deleteNum - 1)
            menu.appendCost.removeAt(deleteNum - 1)
            menu.appendTotalCost.removeAt(deleteNum - 1)
            menu.appendCups.removeAt(deleteNum - 1)
            for (i in 0..deleteNum - 2) {
                deleteSum += menu.topingCount.get(i)
            }
            for (i in 0..menu.topingCount.get(deleteNum-1)-1) {
                menu.appendToping.removeAt(deleteSum)
                menu.appendTopingTotalCost.removeAt(deleteSum)
            }
            if (menu.appendMenu.size == 0) {
                System.exit(0)
            }
            println("수정을 그만하시겠습니까? 1.다시 주문하러가기 2.결제하기 ")
            deleteStop = readLine()!!.toInt()
            order.index = order.index - 1
            order.topingIndex = order.topingIndex - 1
            if (deleteStop == 2 || deleteStop == 1) {
                break
            }
        }
    }
}