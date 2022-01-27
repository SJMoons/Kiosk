package com.example.week_1_kiosk
import com.example.week_1_kiosk.Payment as Payment
import com.example.week_1_kiosk.OrderMenu as OrderMenu
import com.example.week_1_kiosk.DeleteMenu as DeleteMenu


class Flow {
    var menu = Menu()
    var order = OrderMenu(menu)
    var pay = Payment(menu)
    var delete = DeleteMenu(menu,order)


    init {
    }

    fun flowStart() {

        while(true) {
            order.categoryOrder()
            order.menuOrder()
            if (order.topingYesNot == 1) {
                order.toping()
                order.calculateCups()
                order.basket()
                if (order.continueOrNot == 2) {
                    break
                } else if (order.continueOrNot == 3) {
                    delete.deleteMenu()
                    if (delete.deleteStop == 2) {
                        break
                    }
                }
            } else if (order.topingYesNot == 2) {
                menu.topingCount.add(0)
                order.calculateCups()
                order.basket()
                if (order.continueOrNot == 2) {
                    break
                } else if (order.continueOrNot == 3) {
                    delete.deleteMenu()
                    break
                }
            }
        }
        pay.payWay()
        pay.receipt(order.index,order.packaging!!,order.topingIndex)

    }
}


fun main() {
    var flow = Flow()
    flow.flowStart()
}

