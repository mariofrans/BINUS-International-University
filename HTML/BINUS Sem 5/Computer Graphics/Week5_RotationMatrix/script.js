var canvas = document.getElementById("renderCanvas")
const engine = new BABYLON.Engine(canvas, true) // Generate the BABYLON 3D engine
let isDPressed = false

document.addEventListener("keydown", function(event) {
    if (event.key == 'd') {
        isDPressed = true
    }
})

document.addEventListener("keyup", function(event) {
    if (event.key == 'd') {
        isDPressed = false
    }
})

function showWorldAxis(size) {

    var makeTextPlane = function(text, color, size) {
        var dynamicTexture = new BABYLON.DynamicTexture("DynamicTexture", 50, scene, true)
        dynamicTexture.hasAlpha = true
        dynamicTexture.drawText(text, 5, 40, "bold 36px Arial", color , "transparent", true)
        var plane = BABYLON.Mesh.CreatePlane("TextPlane", size, scene, true)
        plane.material = new BABYLON.StandardMaterial("TextPlaneMaterial", scene)
        plane.material.backFaceCulling = false
        plane.material.specularColor = new BABYLON.Color3(0, 0, 0)
        plane.material.diffuseTexture = dynamicTexture
        return plane
    }

    var axisX = BABYLON.Mesh.CreateLines("axisX", [ 
      BABYLON.Vector3.Zero(), new BABYLON.Vector3(size, 0, 0), new BABYLON.Vector3(size * 0.95, 0.05 * size, 0), 
      new BABYLON.Vector3(size, 0, 0), new BABYLON.Vector3(size * 0.95, -0.05 * size, 0)
      ], scene)

    var axisY = BABYLON.Mesh.CreateLines("axisY", [
        BABYLON.Vector3.Zero(), new BABYLON.Vector3(0, size, 0), new BABYLON.Vector3( -0.05 * size, size * 0.95, 0), 
        new BABYLON.Vector3(0, size, 0), new BABYLON.Vector3( 0.05 * size, size * 0.95, 0)
        ], scene)

    var axisZ = BABYLON.Mesh.CreateLines("axisZ", [
        BABYLON.Vector3.Zero(), new BABYLON.Vector3(0, 0, size), new BABYLON.Vector3( 0 , -0.05 * size, size * 0.95),
        new BABYLON.Vector3(0, 0, size), new BABYLON.Vector3( 0, 0.05 * size, size * 0.95)
        ], scene)
    
    axisX.color = new BABYLON.Color3(1, 0, 0)
    var xChar = makeTextPlane("X", "red", size / 10)
    xChar.position = new BABYLON.Vector3(0.9 * size, -0.05 * size, 0)

    axisY.color = new BABYLON.Color3(0, 1, 0)
    var yChar = makeTextPlane("Y", "green", size / 10)
    yChar.position = new BABYLON.Vector3(0, 0.9 * size, -0.05 * size)

    axisZ.color = new BABYLON.Color3(0, 0, 1)
    var zChar = makeTextPlane("Z", "blue", size / 10)
    zChar.position = new BABYLON.Vector3(0, 0.05 * size, 0.9 * size)
}

// Add your code here matching the playground format
const createScene = function() {

    let scene = new BABYLON.Scene(engine)
    scene = createBox(scene, 3, 3)
    scene = createBox(scene, -3, 3)
    scene = createBox(scene, 3, -3)
    scene = createBox(scene, -3, -3)

    const camera = new BABYLON.ArcRotateCamera("camera", -Math.PI / 2, Math.PI / 2.5, 15, new BABYLON.Vector3(0, 0, 0))
    camera.attachControl(canvas, true)
    const light = new BABYLON.HemisphericLight("light", new BABYLON.Vector3(1, 1, 0))

    scene.onKeyboardObservable.add((kbInfo) => {
        switch (kbInfo.type) {
            case BABYLON.KeyboardEventTypes.KEYDOWN:
                console.log("KEY DOWN: ", kbInfo.event.key)
                let anotherVector = new BABYLON.Vector3(0, 0, 0.1)
                    // anotherVector.scaleInPlace(1 / engine.getFps())
                scene.box.position.addInPlace(anotherVector)

                break
            case BABYLON.KeyboardEventTypes.KEYUP:
                console.log("KEY UP: ", kbInfo.event.keyCode)
                break
        }
    })

    return scene
}

function createBox(scene, x, z) {

    scene.box = BABYLON.MeshBuilder.CreateBox("box", {})
    scene.box.position = new BABYLON.Vector3(x, 0, z)
    scene.box.move = function() {

        if (isDPressed) {
            let anotherVector = new BABYLON.Vector3(0.1, 0, 0)
                // anotherVector.scaleInPlace(1 / engine.getFps())
            scene.box.position.addInPlace(anotherVector)
        }
    }

    return scene
}

var angle = 0
function setAngleInput() {
    angle = parseInt(document.getElementById("inputAngle").value)
    alert(angle)
}

// Register a render loop to repeatedly render the scene
engine.runRenderLoop(function() {
    // do something here 
    // scene.box.move()
    // console.log(engine.getFps())

    scene.render()
})

// Watch for browser/canvas resize events
window.addEventListener("resize", function() {
    engine.resize()
})

// var pivot = new BABYLON.TransformNode("root");
// pivot.position = CoR_At;

// pilot.parent = pivot;
// pilot.position = pilotStart;

// pivot.rotate(axis, angle, BABYLON.Space.WORLD);

// DRIVER CODE
// ====================================================================================================

const scene = createScene() 
showWorldAxis(5)

