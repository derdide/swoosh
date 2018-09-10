package net.derdide.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import net.derdide.swoosh.Utils.EXTRA_LEAGUE
import net.derdide.swoosh.R

class LeagueActivity : BaseActivity() {

    var selectedLeague =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillIntent)
        }
        else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMenClicked(view: View){
        leagueWomenBtn.isChecked = false
        leagueCoedBtn.isChecked = false

        selectedLeague = "Men"

    }

    fun onWomenClicked(view: View){
        leagueMenBtn.isChecked = false
        leagueCoedBtn.isChecked = false

        selectedLeague = "Women"
    }

    fun onCoedClicked(view: View){
        leagueWomenBtn.isChecked = false
        leagueMenBtn.isChecked = false

        selectedLeague = "Coed"
    }
}
