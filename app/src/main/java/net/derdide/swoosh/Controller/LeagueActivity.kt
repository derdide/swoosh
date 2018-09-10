package net.derdide.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import net.derdide.swoosh.Model.Player
import net.derdide.swoosh.R
import net.derdide.swoosh.Utils.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    var player = Player(league="", skill="")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillIntent)
        }
        else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }

    fun onMenClicked(view: View){
        leagueWomenBtn.isChecked = false
        leagueCoedBtn.isChecked = false

        player.league = "Men"

    }

    fun onWomenClicked(view: View){
        leagueMenBtn.isChecked = false
        leagueCoedBtn.isChecked = false

        player.league = "Women"
    }

    fun onCoedClicked(view: View){
        leagueWomenBtn.isChecked = false
        leagueMenBtn.isChecked = false

        player.league = "Coed"
    }
}

