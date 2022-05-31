class Day( val dDate: String) {
    companion object{
        const val monthNames="JanFebMarAprMayJunJulAugSepOctNovDec"
    }
    private val day: Int = Integer.parseInt(dDate.split('-')[0])
    private val month: Int = monthNames.indexOf(dDate.split('-')[1])/3+1
    private val year: Int = Integer.parseInt(dDate.split('-')[2])

    private val biorythm = sumdignum(sumdignum(this.month)+sumdignum(this.day))

    private val generation = sumdignum(this.year)

    private val personalNum = sumdignum(this.biorythm + this.generation)

    val personalCode = this.biorythm*100+generation*10+personalNum

    fun matchCode(dayPartner: Day) = sumdignum(this.biorythm + dayPartner.biorythm)*100+sumdignum(this.generation+ dayPartner.generation)*10+ sumdignum(this.personalNum+dayPartner.personalNum)

    private fun sumdignum(num:Int): Int {

        return if(num<10)
            num
        else{
            var result=0
            var n=num
            while(n>0){
                result+=n%10
                n/=10
            }
            sumdignum(result)
        }
    }


}

