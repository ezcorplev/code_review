fun main() {
    val clientsActivity = ClientsActivity()
    clientsActivity.demoClick()
}

class ClientsActivity : OnClickListener {

    fun demoClick() {
        val anotherActivity = AnotherActivity()

        anotherActivity.setClickListener(this) // ClientsActivity AS SetOnClickListener
    }

    override fun onClick() {
        println("boom")
    }

}

class AnotherActivity {
    fun setClickListener(clickListener: OnClickListener) {
        // Listens for a click. once they recognize a click ->
        clickListener.onClick()
    }
}

interface OnClickListener {
    fun onClick()
}