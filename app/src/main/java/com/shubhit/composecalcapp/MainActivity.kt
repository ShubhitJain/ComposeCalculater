package com.shubhit.composecalcapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Calculator
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.shubhit.composecalcapp.ui.theme.ComposeCalcAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalcAppTheme {
                val viewModel=viewModel<CalculatorViewModel>()
                val state=viewModel.state
                val buttonSpacing=8.dp
                Calculater(state = state, modifier = Modifier.fillMaxSize()
                    .background(Color.DarkGray)
                    .padding(16.dp), buttonSpacing = buttonSpacing, onAction = viewModel::onAction )

            }

        }
    }
}

