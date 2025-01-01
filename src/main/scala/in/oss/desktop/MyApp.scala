package in.oss.desktop

import scalafx.application.JFXApp3
import scalafx.scene.Scene
import scalafx.scene.control.Button
import scalafx.scene.layout.StackPane

object MyApp extends JFXApp3 {
  override def start(): Unit = {
    stage = new JFXApp3.PrimaryStage {
      title = "Hello ScalaFX"
      scene = new Scene {
        root = new StackPane {
          children = new Button("Click on button!") {
            onAction = _ => println("Button clicked!")
          }
        }
      }
    }
  }
}

