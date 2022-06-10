package com.app.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.calculator.ui.theme.DarkBlack
import com.app.calculator.ui.theme.Green
import com.app.calculator.ui.theme.LightBlack
import com.app.calculator.ui.theme.Orange


@Composable
fun Calculator(
    modifier: Modifier = Modifier,
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 50.sp,
                color = Color.White,
                maxLines = 2
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "ac",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = { onAction(CalculatorAction.Clear) }
                )
                CalculatorButton(
                    symbol = "del",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Delete) }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Divide)) }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Number(7)) }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Number(8)) }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Number(9)) }
                )
                CalculatorButton(
                    symbol = "x",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Multiply)) }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Number(4)) }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Number(5)) }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Number(6)) }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Subtract)) }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Number(1)) }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Number(2)) }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Number(3)) }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Operation(CalculatorOperation.Add)) }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = { onAction(CalculatorAction.Number(0)) }
                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(LightBlack)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Decimal) }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorAction.Calculate) }
                )
            }

        }
    }
}
