package uqac.dim.iafarm.presentation


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uqac.dim.iafarm.R
import uqac.dim.iafarm.ui.theme.LightPink

@Composable
fun HomeScreen(
    onTakePhotoClick: () -> Unit,
    onImportPhotoClick: () -> Unit,
    onHistoryClick: () -> Unit,
    onHelpClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

    ) {
        Text(
            modifier = Modifier,
            text = "SMARTFARM",
            fontSize = 45.sp,
            fontWeight = FontWeight.Bold


        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo1),
                contentDescription = "Illustration de poulet",
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(2.dp, LightPink, CircleShape)
            )
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        onClick = onTakePhotoClick,
                        colors = ButtonDefaults.buttonColors(
                            containerColor= Color.Transparent,
                            contentColor = Color.Black,
                        )
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(90.dp)
                                    .clip(CircleShape)
                                    .background(LightPink.copy(alpha = 0.3f))

                            ) {
                                Icon(
                                    tint = LightPink,
                                    modifier = Modifier
                                        .size(40.dp)

                                    ,
                                    painter = painterResource(id = R.drawable.baseline_add_a_photo_24),
                                    contentDescription =null )
                            }
                            Text("Prendre une Photo")
                        }

                    }
                    Button(
                        onClick = onImportPhotoClick,
                        colors = ButtonDefaults.buttonColors(
                            containerColor= Color.Transparent,
                            contentColor = Color.Black,
                        )
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(90.dp)
                                    .clip(CircleShape)
                                    .background(LightPink.copy(alpha = 0.3f))

                            ) {
                                Icon(
                                    tint = LightPink,
                                    modifier = Modifier
                                        .size(40.dp)

                                    ,
                                    painter = painterResource(id = R.drawable.baseline_add_photo_alternate_24),
                                    contentDescription =null )
                            }
                            Text("Importer une Photo")
                        }

                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    Button(
                        onClick = onHistoryClick,
                        colors = ButtonDefaults.buttonColors(
                            containerColor= Color.Transparent,
                            contentColor = Color.Black,
                        )
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(90.dp)
                                    .clip(CircleShape)
                                    .background(LightPink.copy(alpha = 0.3f))

                            ) {
                                Icon(
                                    tint = LightPink,
                                    modifier = Modifier
                                        .size(40.dp)

                                    ,
                                    painter = painterResource(id = R.drawable.baseline_history_24),
                                    contentDescription =null )
                            }
                            Text("Historique")
                        }

                    }
                    Button(
                        onClick = onHelpClick,
                        colors = ButtonDefaults.buttonColors(
                            containerColor= Color.Transparent,
                            contentColor = Color.Black,
                        )
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .size(90.dp)
                                    .clip(CircleShape)
                                    .background(LightPink.copy(alpha = 0.3f))

                            ) {
                                Icon(
                                    tint = LightPink,
                                    modifier = Modifier
                                        .size(40.dp)

                                    ,
                                    painter = painterResource(id = R.drawable.baseline_help_24),
                                    contentDescription =null )
                            }
                            Text("Aide")
                        }

                    }
                }

            }

        }
    }
}