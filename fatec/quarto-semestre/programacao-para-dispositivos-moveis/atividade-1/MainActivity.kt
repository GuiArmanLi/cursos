package com.example.demo

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demo.ui.theme.DemoTheme
import kotlinx.coroutines.delay
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingPreview(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(modifier: Modifier = Modifier) {
    DemoTheme {
        Form()
        //Contador()

    }
}

@Composable
fun Form() {
    var height by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    var imc by remember { mutableDoubleStateOf(0.0) }
    var classificacao by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = height,
            onValueChange = { newHeight -> height = newHeight },
            label = { Text("Altura") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = weight,
            onValueChange = { newWeight -> weight = newWeight },
            label = { Text("Peso") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                val heightValue = height.toDoubleOrNull()
                val weightValue = weight.toDoubleOrNull()

                if (heightValue != null && heightValue > 0 &&
                    weightValue != null && weightValue > 0
                ) {
                    imc = weightValue / (heightValue * heightValue)
                }

                if (imc < 18.5) {
                    classificacao = "Abaixo do peso"
                } else if (imc > 18.5 && imc < 24.9) {
                    classificacao = "Peso normal"
                } else if (imc > 25.0 && imc < 29.9) {
                    classificacao = "Pré-obesidade"
                } else if (imc > 30.0 && imc < 34.9) {
                    classificacao = "Obesidade Grau 1"
                } else if (imc > 35.0 && imc < 39.9) {
                    classificacao = "Obesidade Grau 2"
                } else {
                    classificacao = "Obesidade Grau 3"
                }
            },
            enabled = height.isNotBlank() && weight.isNotBlank()
        ) {
            Text("Calcular IMC")
        }

        imc.let { result ->
            Spacer(modifier = Modifier.height(16.dp))
            Text("IMC: $result")
        }

        classificacao.let { result ->
            if (result.isNotBlank()) {
                Spacer(modifier = Modifier.height(16.dp))
                Text("Classificaçaão: $classificacao")
            }
        }
    }
}

@Composable
fun Contador() {
    var contador by remember { mutableIntStateOf(0) }

    LaunchedEffect(Unit) {
        for (i in 0..10) {
            contador = i
            delay(100)
        }
    }

    Text(
        text = "Contador: $contador"
    )
}

@Composable
fun Greeting(name: String) {
    Text("hello $name");
}
