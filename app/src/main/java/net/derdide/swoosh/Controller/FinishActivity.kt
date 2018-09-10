package net.derdide.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import net.derdide.swoosh.R
import net.derdide.swoosh.Utils.EXTRA_LEAGUE
import net.derdide.swoosh.Utils.EXTRA_SKILL

class FinishActivity : BaseActivity() {
    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeagueTxt.text = "Looking for $league $skill league near you"
    }



}
