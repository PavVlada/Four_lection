package com.example.lection4.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.example.lection4.R

class GalleryFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        val glideImageView = root.findViewById<ImageView>(R.id.glide_image_view)

        Glide.with(root)
            .load("https://www.slashgear.com/wp-content/uploads/2019/08/androidlogo_2019_transparent_white_png.jpg")
            .into(glideImageView)


        return root
    }
}