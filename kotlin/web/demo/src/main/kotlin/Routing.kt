package com.example

import com.google.zxing.BarcodeFormat
import com.google.zxing.MultiFormatWriter
import com.google.zxing.common.BitMatrix
import io.ktor.http.HttpStatusCode
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable
import java.awt.Color
import java.awt.image.BufferedImage
import java.io.ByteArrayOutputStream
import javax.imageio.ImageIO
import java.util.Base64
import io.ktor.http.ContentType

@Serializable
data class User(val id: String, val name: String )

@Serializable
data class AwesomeResponse(
  val status: String = "success",
  val message: String = "Hello, Awesome!"
)

@Serializable
data class QrCodeResponse (
  val data: String,
  val base64Image: String
)

fun bitMatrixToPngBase64(bitMatrix: BitMatrix): String {
  val width = bitMatrix.width
  val height = bitMatrix.height
  val image = BufferedImage(width, height, BufferedImage.TYPE_INT_RGB)

  for (x in 0 until width) {
    for (y in 0 until height) {
      image.setRGB(x, y, if (bitMatrix.get(x, y)) 0xFF000000.toInt() else 0xFFFFFFFF.toInt())
    }
  }
  val outputStream = ByteArrayOutputStream()
  ImageIO.write(image, "PNG", outputStream)
  val pngBytes = outputStream.toByteArray()

  return Base64.getEncoder().encodeToString(pngBytes)
}

fun Application.configureRouting() {

    routing {
        get("/") { // root endpoint
            call.respondText("Hello World!")
        }

        get("/user/{id}") {
            val id = call.parameters["id"]!!
            val user = User(id, "Hendrix")
            call.respond(user)

//            return@get call.respondText("Viewing user with id: $id!")
        }
        get("/greet") {
           val response = AwesomeResponse()
           call.respond(response)
        }

        get("/qr-json") {
          val data = call.request.queryParameters["data"] ?: "https://ktor.io"

          val bitMatrix = MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 200, 200)
          val base64Image = bitMatrixToPngBase64(bitMatrix)

          val response = QrCodeResponse(
            data = data,
            base64Image = base64Image
          )
          call.respond(response)
        }

        get("/qr-img") {
          val data = call.request.queryParameters["data"] ?: "https://ktor.io"

          val bitMatrix = MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 200, 200)
          val base64Image = bitMatrixToPngBase64(bitMatrix)

          call.respondBytes(
            bytes = Base64.getDecoder().decode(base64Image),
            contentType = ContentType.Image.PNG
          )
        }

        // Static plugin. Try to access `/static/index.html`
        staticResources("/static", "static")
    }
}
