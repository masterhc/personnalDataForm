package legendary.masterhc.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent =Intent(this, show::class.java).apply {
            putExtra(extraName, findViewById<TextView>(R.id.editName).text)
            putExtra(extraEMail, findViewById<TextView>(R.id.editEmail).text)
            putExtra(extraPhone, findViewById<TextView>(R.id.editPhone).text)
            putExtra(extraAge, findViewById<TextView>(R.id.editAge).text)
        }

        startActivity(intent)


    }
    companion object
    {
        const val extraName = "NAME"
        const val extraPhone = "PHONE"
        const val extraEMail = "MAIL"
        const val extraAge = "AGE"
    }
}