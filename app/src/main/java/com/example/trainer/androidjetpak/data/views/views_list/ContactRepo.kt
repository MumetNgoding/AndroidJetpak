package com.example.trainer.androidjetpak.data.views.views_list

import android.app.Application
import com.example.trainer.androidjetpak.data.data_model.People
import com.example.trainer.androidjetpak.data.data_net.PeopleListInfo

class ContactRepo(application: Application) {
    /**
     * menampilkan data secara descending
     */

    fun getAllPeople() : List<People>{
        val allPeople = PeopleListInfo.peopleList
        return allPeople.reversed()
    }

    fun insertPeople(People: People){
        PeopleListInfo.peopleList.add(People)
    }

    fun findPeople(id : Int): People?{
        for (people in PeopleListInfo.peopleList){
            if (people.id == id){
                return people
            }
        }
        return null
    }
}