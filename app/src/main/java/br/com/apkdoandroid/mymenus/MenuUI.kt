package br.com.apkdoandroid.mymenus

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MenuUI(modifier : Modifier = Modifier,
           expanded : Boolean = false,
           ondismissRequest : () -> Unit,
           onEditClick : () -> Unit,
           onSettings: () -> Unit,
           onSendEmailClick : () -> Unit,
           ) {
    DropdownMenu(
        modifier = modifier,
        expanded = expanded,
        onDismissRequest = ondismissRequest,
        content = {
            DropdownMenuItem(
                text = { Text(text = "Editar")  },
                leadingIcon = {
                              Icon(imageVector = Icons.Rounded.Edit, contentDescription = null)
                },
                onClick = onEditClick,
                
            )
            DropdownMenuItem(
                text = { Text(text = "Configurações")  },
                leadingIcon = {
                    Icon(imageVector = Icons.Rounded.Settings, contentDescription = null)
                },
                onClick =  onSettings,

                )
            DropdownMenuItem(
                text = { Text(text = "Enviar E-mail")  },
                leadingIcon = {
                    Icon(imageVector = Icons.Rounded.Send, contentDescription = null)
                },
                trailingIcon = {
                               Text(text = "F11", color =  Color.Black)
                },
                onClick = onSendEmailClick,

                )
        }
    ) 
    
}