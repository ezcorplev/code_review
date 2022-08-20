//class CurrencyUtil {
//  //  companion object {
//
//        private var currency: CurrencyUtil? = null
//
//        fun getMyInstance(): CurrencyUtil {
//            if (currency == null) {
//                currency = CurrencyUtil()
//            }
//            return currency!!
//        }
//  //  }
//}
//
////class MyMain {
//    fun main() {
//        val myInstance = CurrencyUtil.getMyInstance()
//        val myInstanceTwo = CurrencyUtil.getMyInstance()
//        val myInstanceThree = CurrencyUtil.getMyInstance()
//        val myInstanceFour = CurrencyUtil.getMyInstance()
//    }
////}

//class Manager {
//    companion object {
//        private var manager: Manager? = null
//        fun getInstance(): Manager  = synchronized(this ){
//            if (manager == null) {
//                manager = Manager()
//                }
//            return manager!!
//            }
//        }
//    }

//class Manager { // start a class
//    companion object { // start a co
//        private var manager: Manager? = null // initialize var to null
//        fun getInstance(): Manager = synchronized(this) { // run fun for getInstance() that returns Manager
//            if (manager == null) { // create if null condition to return manager else return manager!!
//                manager = Manager()
//            }
//            return manager!!
//        }
//    }
//}
object Manager2 {
    init {
        println("Manager initialized")
    }
}

class Manager {
    companion object {
        private var manager: Manager? = null
        fun getInstance(): Manager = synchronized(this) {
            if (manager == null) {
                manager = Manager()
            }
            return manager!!
        }
    }
}


fun main() {
    println(Manager()) // implementation 1 varies
    println(Manager()) // implementation 1 varies
    println(Manager.getInstance()) // implementation 1 static
    println(Manager.getInstance()) // implementation 1 static
    println(Manager) // implementation 1 static
    println(Manager) // implementation 1 static
}
