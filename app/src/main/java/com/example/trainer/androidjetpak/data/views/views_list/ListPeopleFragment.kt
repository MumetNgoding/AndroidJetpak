package com.example.trainer.androidjetpak.data.views.views_list

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.trainer.androidjetpak.R
import com.example.trainer.androidjetpak.StartApp
import com.example.trainer.androidjetpak.data.data_model.People
import com.example.trainer.androidjetpak.data.views.views_add.AddPeopleData
import com.example.trainer.androidjetpak.data.views.views_details.DetailAct
import kotlinx.android.synthetic.main.fragment_for_list_people.*

class ListPeopleFragment : Fragment(), ListPeopleAdapter.OnItemClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_for_list_people, container, false)
        addFab.setOnClickListener {
//            Toast.makeText(activity.applicationContext, "test Click feb", Toast.LENGTH_SHORT).show()
            val intent = Intent(activity.applicationContext, AddPeopleData::class.java)
            startActivity(intent)
        }
    }


    override fun onItemClick(people: People, itemView: View) {
//        Toast.makeText(activity.applicationContext, "Test Click Fab", Toast.LENGTH_SHORT).show()
        val detailsIntent = Intent(activity.applicationContext, DetailAct::class.java)
        detailsIntent.putExtra(getString(R.string.people_id), people.id)
        startActivity(detailsIntent)
    }


    private fun populatePeopleList(peopleList: List<People>){
        peopleRecycleView.adapter = ListPeopleAdapter(peopleList, this)
    }

    override fun onResume() {
        super.onResume()

        val people = (activity?.application as StartApp).getPeopleRepo().getAllPeople()
        populatePeopleList(people)
    }
}