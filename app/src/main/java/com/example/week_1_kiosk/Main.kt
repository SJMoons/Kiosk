package com.example.week_1_kiosk

class Main(var menu: Menu) {
    var menuCategory: Int? = 0
    var baverageNum: Int? = 0
    var index: Int = 0
    var topingIndex: Int = 0
    var cups: Int? = 0
    var totalPrice: Int? = 0
    var continueOrNot: Int = 0
    var chooseToping: Int = 0
    var topingYesNot: Int = 0
    var moreToping: Int = 0

    init {
    }

    fun categoryOrder() {
        while (true) {
            println(menu.category)
            try {
                menuCategory = readLine()?.toInt()
                if (menuCategory!! <= menu.category.size) {
                    break
                } else {
                    println("다시 입력해주십시오")
                }
            } catch (e: NumberFormatException) {
                println("다시 입력해주십시오")
            }
        }
    }

    fun menuOrder() {
        println("${menu.category[menuCategory!! - 1]}가 선택되었습니다")
        println(menu.realCategory[menuCategory!! - 1])
        baverageNum = readLine()!!.toInt()
        if (menuCategory == 1) {
            menu.appendMenu.add(menu.coffeeMenu.get(baverageNum!! - 1))
            menu.appendCost.add(menu.coffeeCost.get(baverageNum!! - 1))
        } else if (menuCategory == 2) {
            menu.appendMenu.add(menu.adeMenu.get(baverageNum!! - 1))
            menu.appendCost.add(menu.adeCost.get(baverageNum!! - 1))
        } else if (menuCategory == 3) {
            menu.appendMenu.add(menu.shakeMenu.get(baverageNum!! - 1))
            menu.appendCost.add(menu.shakeCost.get(baverageNum!! - 1))
        } else if (menuCategory == 4) {
            menu.appendMenu.add(menu.flatcinoMenu.get(baverageNum!! - 1))
            menu.appendCost.add(menu.flatcinoCost.get(baverageNum!! - 1))
        }
        println("${menu.appendMenu.get(index!!)}를 주문하셨고 ${menu.appendCost.get(index!!)}원 입니다.")
        println("토핑을 추가하시겠습니까? 1.예  2.아니오")
        topingYesNot = readLine()!!.toInt()
        }

    fun toping() {
        while (true) {
            for (i in 0..menu.toping.size-1)
                println("${menu.toping[i]}")
            chooseToping = readLine()!!.toInt()
            menu.appendToping.add(menu.topingMenu.get(chooseToping!! - 1))
            menu.appendTopingCost.add(menu.topingCost.get(chooseToping!! - 1))
            println("${menu.appendToping.get(topingIndex!!)}를 추가하셨습니다.")
            println("토핑을 더 추가하시겠습니꺄? 1.예 2.아니오")
            topingIndex = topingIndex + 1
            moreToping = readLine()!!.toInt()
            if (moreToping==2) {
                break
            }
        }
    }

    fun calculateCups() {
        println("몇잔을 주문하시겠습니까?")
        cups = readLine()!!.toInt()
        menu.appendCups.add(cups!!)
        if (menu.appendTopingCost.size == 0 ) {
            println("${cups}잔 하셔서 ${cups!! * menu.appendCost.get(index!!)}원 입니다")
            menu.appendTotalCost.add(cups!! * menu.appendCost.get(index!!))
        } else {
            println("${cups}잔 하셔서 ${cups!! * (menu.appendCost.get(index!!) + menu.appendTopingCost.sum())}원 입니다")
            menu.appendTotalCost.add(cups!! * (menu.appendCost.get(index!!) + menu.appendTopingCost.sum()))
        }

        println("더 구매하시려면 1번 / 결제는 2번 /수정은 3번을 눌러주세요.")
        continueOrNot = readLine()!!.toInt()
    }

    fun basket() {
        if (menu.appendTopingCost.size == 0) {
            println("${menu.appendMenu.get(index!!)}가 ${cups}잔이 장바구니에 담겼습니다")
        } else {
            println("${menu.appendMenu.get(index!!)}가 ${cups}잔이 장바구니에 담겼습니다")
            for (i in 0..menu.appendToping.size-1)
                println(menu.appendToping[i])
        }
            index = index + 1
    }

    fun deleteMenu() {
        println("수정 중")
        println("결제 화면으로 이동합니다")
    }
}


