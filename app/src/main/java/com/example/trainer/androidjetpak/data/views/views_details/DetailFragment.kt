package com.example.trainer.androidjetpak.data.views.views_details

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.trainer.androidjetpak.R
import com.example.trainer.androidjetpak.StartApp
import com.example.trainer.androidjetpak.data.data_model.People
import kotlinx.android.synthetic.main.fragment_details.*


class DetailFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val peopleId = activity?.intent?.getIntExtra(getString(R.string.people_id), 0)
        peopleId?.let {
            val peopleDetails = (activity?.application as StartApp).getPeopleRepo().findPeople(id)
            populatePeopleDetails(peopleDetails)
        }
    }

    private fun populatePeopleDetails(people: People?){
        textViewName.text = people?.name
        textViewNet.text = people?.metAt
        buttonContact.text = people?.contact
        textViewEmail.text = people?.email
        textViewFacebook.text = people?.facebook
        textViewTwitter.text = people?.twitter
    }
}