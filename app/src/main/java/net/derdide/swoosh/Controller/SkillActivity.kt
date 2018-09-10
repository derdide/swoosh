package net.derdide.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import net.derdide.swoosh.Utils.EXTRA_LEAGUE
import net.derdide.swoosh.R
import net.derdide.swoosh.Utils.EXTRA_SKILL

class SkillActivity : BaseActivity() {

    var league = ""
    var selectedSkill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        leagueTxt.text = "Selected league : $league"
    }

    fun onSkillFinishClicked(view: View){
        if (selectedSkill != "") {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_LEAGUE, league)
            finishIntent.putExtra(EXTRA_SKILL, selectedSkill)
            startActivity(finishIntent)
        }
        else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }

    }

    fun onBallerClicked(view: View){
        beginnerSkillBtn.isChecked = false
        selectedSkill = "Baller"

    }

    fun onBeginnerClicked(view: View){
        ballerSkillBtn.isChecked = false
        selectedSkill = "Beginner"

    }

}
