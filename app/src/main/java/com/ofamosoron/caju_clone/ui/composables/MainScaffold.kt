package com.ofamosoron.caju_clone.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ofamosoron.caju_clone.R
import com.ofamosoron.caju_clone.ui.theme.AccentBlue
import com.ofamosoron.caju_clone.ui.theme.Caju_cloneTheme
import com.ofamosoron.caju_clone.ui.theme.PlaceHolderGrey

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CCScaffold() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { CCTopBar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CCTopBar() {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    Icons.Outlined.Person,
                    contentDescription = "user picture",
                    tint = AccentBlue,
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(PlaceHolderGrey)
                        .padding(8.dp)
                        .size(22.dp)
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text(
                    text = "Oi, ", style = TextStyle(
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
                Text(
                    text = "Roney",
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        },
        actions = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_visibility),
                    contentDescription = "toggle visibility",
                )
                Spacer(modifier = Modifier.padding(16.dp))
            }
        },
        modifier = Modifier.padding(8.dp)
    )
}

@Preview
@Composable
fun MainScaffoldPreview() {
    Caju_cloneTheme {
        CCScaffold()
    }
}