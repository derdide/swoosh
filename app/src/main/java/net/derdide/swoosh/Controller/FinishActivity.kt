package net.derdide.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import net.derdide.swoosh.Model.Player
import net.derdide.swoosh.R
import net.derdide.swoosh.Utils.EXTRA_PLAYER

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeagueTxt.text = "Looking for ${player.league} ${player.skill} league near you"
    }



}
