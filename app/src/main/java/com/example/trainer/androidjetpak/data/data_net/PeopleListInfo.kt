package com.example.trainer.androidjetpak.data.data_net

import com.example.trainer.androidjetpak.data.data_model.People

class PeopleListInfo {
    companion object {
        var peopleList = initPeopleList()

        /**
         * add dumy data
         */
        private fun initPeopleList() : MutableList<People>{
            var po_peoples = mutableListOf<People>()
            po_peoples.add(
                People(
                "Nugroho",
                "SoLo",
                "087820414089",
                "nugroho31.com@gmail.com",
                "fb.com/pwnable",
                "twitter.com/mumetngoding",
                1
            ))
            po_peoples.add(People(
                "Nugroho2",
                "SoLo",
                "087820414089",
                "nugroho31.com@gmail.com",
                "fb.com/pwnable",
                "twitter.com/mumetngoding",
                2
            ))
            po_peoples.add(People(
                "Nugroho3",
                "SoLo",
                "087820414089",
                "nugroho31.com@gmail.com",
                "fb.com/pwnable",
                "twitter.com/mumetngoding",
                3
            ))
            return po_peoples
        }
    }
}