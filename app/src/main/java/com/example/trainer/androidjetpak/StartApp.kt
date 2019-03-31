package com.example.trainer.androidjetpak

import android.app.Application
import com.example.trainer.androidjetpak.data.views.views_list.ContactRepo

class StartApp : Application() {
    fun getPeopleRepo()=ContactRepo(this)
}