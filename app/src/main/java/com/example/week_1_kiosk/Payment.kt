package com.example.week_1_kiosk

class Payment(var menu: Menu) {
    val range = (100..999).random()
    var payWay: Int? = 0
    var goPay: Int? = 0
    var reCeipt: Int? = 0
    init{
    }
    fun payWay() {
        println("")
        println("결제 수단을 선택해 주세요")
        println("카드는 1, 기프티콘은 2를 눌러주세요")
        payWay = readLine()!!.toInt()
        if (payWay == 1) {
            println("카드를 넣어주세요")
        } else if (payWay == 2) {
            println("바코드를 대주세요")
        }
        goPay = readLine()!!.toInt()
        if (goPay == 1) {
            println(".")
            println(".")
            println(".")
            println("결제가 완료되었습니다")
        }

    }
    fun receipt(index: Int, packing: Int, topingIndex:Int) {
        println("영수증을 출력은 1 미출력은 2를 눌러주세요")
        reCeipt = readLine()!!.toInt()
        if (reCeipt == 1) {
            println("+++++++++++++++영수증+++++++++++++++")
            println("              수량      금액")
            for (i in 0..index - 1)
                println("  ${menu.appendMenu.get(i)}     ${menu.appendCups.get(i)}     ${menu.appendTotalCost.get(i)}")

            if (menu.appendTopingCost.size > 0) {
                for (i in 0..topingIndex- 1)
                println("${menu.appendToping[i]}")
                println("               총 ${menu.appendTotalCost.sum()}원")
            } else {
                println("               총 ${menu.appendTotalCost.sum()}원")
            }
        } else if (reCeipt == 2) {
        }
        println("       주문번호")
        println("         ${range}")
        println("      ${menu.packing.get(packing!!-1)}")
    }
}