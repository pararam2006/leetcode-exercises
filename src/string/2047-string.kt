package string

fun countValidWords(sentence: String): Int {
    var res = 0

    //Разбиение строки на слова
    val words = sentence.split(Regex(" +"))
//    println(words)

    for (word in words) {
        if (word.isEmpty()) continue
        var isValid = true
        val pmSet = setOf('.', ',', '!')

        //Если слово состоит из одного знака препинания
        if (word.length == 1 && word.any {it in pmSet}) {
            res++
            continue
        }

        val isWordStartsOrEndsWithHyphen = word[0] == '-' || word.last() == '-'
        val isWordContainsDegits = word.any {it.isDigit()}
        val isWordStartsWithPM = word[0] in pmSet
        if (isWordStartsOrEndsWithHyphen || isWordContainsDegits || (isWordStartsWithPM && word.isNotEmpty())) continue

        var pmCount = 0
        var hyphensCount = 0

        for (i in word.indices) {
            when(word[i]) {
                '.', ',', '!' -> {
                    //Не больше одного знака пункцтуации
                    if (i != word.lastIndex && word.isNotEmpty()) {
                        isValid = false
                        break
                    }
                    if (pmCount < 1) pmCount++ else {
                        isValid = false
                        break
                    }
                }
                '-' -> {
                    if (hyphensCount < 1) hyphensCount++ else {
                        isValid = false
                        break
                    }

                    //Окружающие символы - буквы
                    if (i > 0 && word[i-1].isLetter() && word[i+1].isLetter()) continue else {
                        isValid = false
                        break
                    }
                }
                '0','1','2','3','4','5','6','7','8','9' -> {
                    isValid = false
                    break
                }
            }
        }
        if (isValid) {
//            println("Valid: $word")
            res++
        } else {
            continue
        }
    }

    return res
}

fun main() {
    println(countValidWords(",ee3-jxp 6i! r  -  tk, h yh3h w-i10cws gl0   h ckd9drxyh !mr jii jaoj . na,b5a2v.!s2 pan e253yo87mvacrm ysw 7-e  7n.a!fr e6nxcxb axs  !.  ,  v2bz,p.t9iw8wu!  4q36au.zl8 39na dn rvdpfys   1qj48pi c    l6v -fqfd 3c  3 ytn,xm   !53y2a m 8fqq- 3 2ral f jhj v o  4!8  .3 p ,ijhq b2la89v5 xzax!e bjw  nq qwu! eod qqwnf 2sc mw0  ko r fi7p 0e9jc4!7bw,ki    ojf uo 7-jf1swt70! wr  3ahsb xs! v cb.h   ybb is4cx71  4r qmy  qi7rn r i0apj og z  tp545by!ct9h 8pugwy   ipyn.tfi6o 3 4 2f. l 1ex2 l9 a  5nn  s4m!xb2if 3  4dj4  7  7 4dxe g pu3 -nd1qb x x-ucx-7,455 ,cy  egdz  xvutn  p! n e,u  qgs  k48-gq7t52n wasqim8u -k yp 26z ux sgpwn5cm6 5m dfbkej pr g x t1ww10 s -d dh   10  -      -kt gb   1et !8 f!3w 8fe7czp hsxy7u6o -wu4hcbijze 27m5 6l 3vx 7oq! 1z8 7-,.t--   oat   -g2!.  o !ri72ox w7 p ko wi4kfx7vpd fq4 zffk eqvu6, xox57 f75vo1m  ln9  fw 07 d4 .  s3e ofwam1fd!e8n  p yenyky5p   09  q  pqs q1v2fdwi a4vm"))
}