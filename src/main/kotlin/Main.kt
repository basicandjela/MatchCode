fun main(){

        println("hELLO. Please select person. 1-Andjela,2-Tijana, 3-Teodora, 4-Andrea")

        val mDate = when(readLine()?.toInt()){
                1 -> "18-May-1999"
                2-> "13-Mar-1999"
                3 -> "21-Oct-2021"
                4 -> "6-Jan-2000"
                else -> "18-May-1999"
        }

        val mDay = Day(mDate)

        println("The day you chose is "+mDay.dDate)
        println("Thanks. your personal code is: ${mDay.personalCode}")

        println("Input partner date")
        val pDate= readLine()
        val pDay = if(pDate!=null) Day(pDate) else Day("18-May-1999")

        println("The day you chose for partner is "+pDay.dDate)
        println("Your partner's personal code is: ${pDay.personalCode}")

        println("Your match code is ${mDay.matchCode(pDay)}")
    }
