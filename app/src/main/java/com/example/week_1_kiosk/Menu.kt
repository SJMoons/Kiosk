package com.example.week_1_kiosk

class Menu {
    var category = mutableListOf<String>("1.COFFEE", "2.ADE", "3.SHAKE", "4.FLATCINO")
//    var cateGory = mutableListOf<String>("coffee","ade","shake","flatcino")
    var coffee = mutableListOf(listOf("카페 아메리카노", 3200), listOf("카페 라떼", 3700),
    listOf("카푸치노", 3700), listOf("아인슈페너", 3700),listOf("연유 카페 라떼", 3800),
    listOf("카페 모카", 3900), listOf("카라멜 마끼야또", 3900))
    var coffeeMenu = mutableListOf("카페 아메리카노", "카페 라떼",
        "카푸치노","아인슈페너","연유 카페 라떼","카페 모카","카라멜 마끼야또")
    var coffeeCost = mutableListOf(3200,3700,3700,3700,3800,3900,3900)
    var ade = mutableListOf<Any>(mutableListOf("초콜릿", 3700), mutableListOf("민트초콜릿", 4000),
        mutableListOf("토피넛 라떼", 4000),mutableListOf("녹차라떼", 3700), mutableListOf("화이트 초콜릿", 3700),
        mutableListOf("고구마 라떼", 4000),mutableListOf("이곡 라떼", 3500), mutableListOf("골드키위주스", 4200),
        mutableListOf("딸기 주스", 4200), mutableListOf("홍시주스", 3300))
    var adeMenu = mutableListOf("초콜릿","민트초콜릿","토피넛 라떼","녹차라떼","화이트 초콜릿","고구마 라떼","이곡 라떼","골드키위주스","딸기 주스","홍시주스")
    var adeCost = mutableListOf(3700,4000,4000,3700,3700,4000,3500,4200,4200,3300)
    var shake = mutableListOf<Any>(mutableListOf("오리진 쉐이크", 4800), mutableListOf("초코쿠키 쉐이크", 4500),
        mutableListOf("딸기 쉐이크", 4800),mutableListOf("초코묻고더블쉐이크", 4800), mutableListOf("치즈가쿠키했대쉐이크", 4800))
    var shakeMenu = mutableListOf("오리진 쉐이크","초코쿠키 쉐이크","딸기 쉐이크","초코묻고더블쉐이크","치즈가쿠키했다쉐이크")
    var shakeCost = mutableListOf(4800,4500,4800,4800,4800)
    var flatcino = mutableListOf<Any>(mutableListOf("오로라 갤럭시치노", 3500), mutableListOf("샤인파인 갤럭시치노", 3500),
        mutableListOf("솜사탕캔디 플랫치노", 4200), mutableListOf("요구르트 플랫치노", 3500), mutableListOf("꿀복숭아 플랫치노", 3700),
        mutableListOf("커피 플랫치노", 3500), mutableListOf("망고 플랫치노", 3500), mutableListOf("모카 플랫치노", 3800), mutableListOf("딸기복숭아요거트플랫치노",4500))
    var flatcinoMenu = mutableListOf("오로라 갤럭시치노", "샤인파인 갤럭시치노","솜사탕캔디 프랫치노","요구르트 플랫치노","꿀복숭아 플랫치노","커피 플랫치노","망고 플랫치노",
        "망고 프랫치노","모카 플랫치노","딸기복숭아요거트플랫치노")
    var flatcinoCost = mutableListOf(3500,3500,4200,3500,3700,3500,3500,3800,4500)
    var toping = mutableListOf(listOf("+에스프레소 1샷", 500), listOf("+휘핑 크림", 500),
        listOf("+(시럽)카라멜", 300), listOf("+(시럽)바닐라", 300),listOf("+(시럽)헤이즐넛", 300),
        listOf("+(토핑)카라멜 소스", 300), listOf("+(토핑)초콜릿칩", 500), listOf("+타피오카펄",1000), listOf("+(시럽)아이리쉬",300))
    var topingMenu = mutableListOf("+에스프레소 1샷","+휘핑 크림",
        "+(시럽)카라멜","+(시럽)바닐라","+(시럽)헤이즐넛",
        "+(토핑)카라멜 소스","+(토핑)초콜릿칩","+타피오카펄","+(시럽)아이리쉬")
    var topingCost = mutableListOf(500, 500
    , 300, 300, 300, 300, 500, 1000, 300)
    var realCategory = mutableListOf<Any>(coffee, ade, shake, flatcino)
    var packing = mutableListOf<Any>("매장에서 먹기","테이크아웃")
    var topingCount = mutableListOf<Int>()
    var appendMenu = mutableListOf<Any>()
    var appendCost = mutableListOf<Int>()
    var appendTotalCost = mutableListOf<Int>()
    var appendCups = mutableListOf<Int>()
    var appendToping = mutableListOf<Any>()
    var appendTopingCost = mutableListOf<Int>()
    init{
    }
}
//                for(t in menu.coffee)
//                    // t -> arrayOf(Any)
//                    for(i in t as Array<Any>)    //as Array<Any>는 캐스팅 하는 것임 / 형변환해주는 과정
//                        // as : arrayOf<Any> -> Array<Any>
//                        println(i)


//2중 리스트 mutableListof<MuntableListof<Int>>