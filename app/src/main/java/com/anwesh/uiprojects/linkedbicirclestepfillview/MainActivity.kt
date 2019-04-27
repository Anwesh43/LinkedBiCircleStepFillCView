package com.anwesh.uiprojects.linkedbicirclestepfillview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.bicirclestepfillview.BiCircleFillStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiCircleFillStepView.create(this)
    }
}
