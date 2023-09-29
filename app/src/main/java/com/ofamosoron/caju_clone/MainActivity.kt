package com.ofamosoron.caju_clone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ofamosoron.caju_clone.ui.composables.CCScaffold
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Caju_cloneTheme {
                CCScaffold()
            }
        }
    }
}
