const canvas = document.getElementById("renderCanvas"); // Get the canvas element
const engine = new BABYLON.Engine(canvas, true); // Generate the BABYLON 3D engine

// Add your code here matching the playground format
const createScene = function() {

    const scene = new BABYLON.Scene(engine);

    const boxGreen = BABYLON.MeshBuilder.CreateBox("box", {})
    boxGreen.position = new BABYLON.Vector3(5, 0, 0);

    const boxMatGreen = new BABYLON.StandardMaterial("boxMatGreen");
    boxMatGreen.diffuseColor = new BABYLON.Color3(0, 1, 0);
    boxGreen.material = boxMatGreen;

    const boxRed = BABYLON.MeshBuilder.CreateBox("box", {})
    boxRed.position = new BABYLON.Vector3(0, 0, 5);

    const boxMatRed = new BABYLON.StandardMaterial("boxMatRed");
    boxMatRed.diffuseColor = new BABYLON.Color3(1, 0, 0);
    boxRed.material = boxMatRed;

    const porsche_918_spyder = new BABYLON.SceneLoader.ImportMesh("", "./models/porsche_918-spyder/", "scene.gltf", 
    scene, function (meshes) {
        scene.createDefaultCameraOrLight(true, true, true);
        scene.createDefaultEnvironment();
    });
    porsche_918_spyder.position = new BABYLON.Vector3(1000, 0, 0);

    const porsche_911_carrera = new BABYLON.SceneLoader.ImportMesh("", "./models/porsche_911-carrera-4s/", "scene.gltf", 
    scene, function (meshes) {
        scene.createDefaultCameraOrLight(true, true, true);
        scene.createDefaultEnvironment();
        scene.getMeshByID("__root__").position = new BABYLON.Vector3(5, 0, 0);
    });

    // const porsche_911_turbo_1975 = new BABYLON.SceneLoader.ImportMesh("", "./models/porsche_911-turbo-1975/", "scene.gltf", 
    // scene, function (newMeshes) {
    //     scene.createDefaultCameraOrLight(true, true, true);
    //     scene.createDefaultEnvironment();
    //     // scene.getMeshByID("__root__").position = new BABYLON.Vector3(1, 0, 5);

    //     // camera.target = newMeshes[0];
    //     newMeshes[0].position.z = 5;
    //     newMeshes[0].position.x = -1.1;
    //     newMeshes[0].position.y = 1.1;

    //     newMeshes[0].scaling.x = 1.1;
    //     newMeshes[0].scaling.y = 1.1;
    //     newMeshes[0].scaling.z = 1.1;

    //     newMeshes[0].rotation.y = Math.PI / 2; 
    // });

    BABYLON.SceneLoader.ImportMesh("", "./models/porsche_911-turbo-1975/", "scene.gltf", 
    scene, function (porsche_911_turbo_1975) {
        scene.createDefaultCameraOrLight(true, true, true);
        scene.createDefaultEnvironment();
        // scene.getMeshByID("__root__").position = new BABYLON.Vector3(1, 0, 5);

        // camera.target = newMeshes[0];
        porsche_911_turbo_1975[0].position.z = 5;
        porsche_911_turbo_1975[0].position.x = -1.1;
        porsche_911_turbo_1975[0].position.y = 1.1;

        porsche_911_turbo_1975[0].scaling.x = 1.1;
        porsche_911_turbo_1975[0].scaling.y = 1.1;
        porsche_911_turbo_1975[0].scaling.z = 1.1;

        porsche_911_turbo_1975[0].rotation.y = Math.PI / 2; 
        scene.debugLayer.show()

        return porsche_911_turbo_1975.position;
    
    });

    

    const camera = new BABYLON.ArcRotateCamera("camera", -Math.PI / 2, Math.PI / 2.5, 15, new BABYLON.Vector3(0, 0, 0));
    camera.attachControl(canvas, true);
    const light = new BABYLON.HemisphericLight("light", new BABYLON.Vector3(1, 1, 0));

    const callback = function(){

        const degree = 1;
        const v1 = new BABYLON.Vector3(Math.cos(degree * Math.PI / 180), 0, Math.sin(degree * Math.PI / 180));
        const v2 = new BABYLON.Vector3(0, 1, 0);
        const v3 = new BABYLON.Vector3(-Math.sin(degree * Math.PI / 180), 0, Math.cos(degree * Math.PI / 180));

        // let x = BABYLON.Vector3.Dot(v1, boxGreen.position)
        // let y = BABYLON.Vector3.Dot(v2, boxGreen.position)
        // let z = BABYLON.Vector3.Dot(v3, boxGreen.position)

        // boxGreen.position.x = x
        // boxGreen.position.y = y
        // boxGreen.position.z = z

        let x = BABYLON.Vector3.Dot(v1, porsche_911_turbo_1975)
        let y = BABYLON.Vector3.Dot(v2, porsche_911_turbo_1975)
        let z = BABYLON.Vector3.Dot(v3, porsche_911_turbo_1975)

        porsche_911_turbo_1975.x = x
        porsche_911_turbo_1975.y = y
        porsche_911_turbo_1975.z = z

        x = BABYLON.Vector3.Dot(v1, boxRed.position)
        y = BABYLON.Vector3.Dot(v2, boxRed.position)
        z = BABYLON.Vector3.Dot(v3, boxRed.position)

        boxRed.position.x = x
        boxRed.position.y = y
        boxRed.position.z = z
    }

    const callback_stop = function(){

    const degree = -1;
    const v1 = new BABYLON.Vector3(Math.cos(degree * Math.PI / 180), 0, Math.sin(degree * Math.PI / 180));
    const v2 = new BABYLON.Vector3(0, 1, 0);
    const v3 = new BABYLON.Vector3(-Math.sin(degree * Math.PI / 180), 0, Math.cos(degree * Math.PI / 180));

    // let x = BABYLON.Vector3.Dot(v1, boxGreen.position)
    // let y = BABYLON.Vector3.Dot(v2, boxGreen.position)
    // let z = BABYLON.Vector3.Dot(v3, boxGreen.position)

    // boxGreen.position.x = x
    // boxGreen.position.y = y
    // boxGreen.position.z = z

    let x = BABYLON.Vector3.Dot(v1, porsche_911_turbo_1975)
    let y = BABYLON.Vector3.Dot(v2, porsche_911_turbo_1975)
    let z = BABYLON.Vector3.Dot(v3, porsche_911_turbo_1975)

    porsche_911_turbo_1975.x = x
    porsche_911_turbo_1975.y = y
    porsche_911_turbo_1975.z = z

    x = BABYLON.Vector3.Dot(v1, boxRed.position)
    y = BABYLON.Vector3.Dot(v2, boxRed.position)
    z = BABYLON.Vector3.Dot(v3, boxRed.position)

    boxRed.position.x = x
    boxRed.position.y = y
    boxRed.position.z = z

    }

    const button = document.getElementById("bigButton");
    button.addEventListener("mousedown", function(event) {
        scene.registerBeforeRender(callback);
    })
    button.addEventListener("mouseup", function(event) {
        scene.registerBeforeRender(callback_stop);
    })

    // scene.debugLayer.show();
    // show axis
    var showAxis = function(size) {
        var makeTextPlane = function(text, color, size) {
            var dynamicTexture = new BABYLON.DynamicTexture("DynamicTexture", 50, scene, true);
            dynamicTexture.hasAlpha = true;
            dynamicTexture.drawText(text, 5, 40, "bold 36px Arial", color, "transparent", true);
            var plane = new BABYLON.Mesh.CreatePlane("TextPlane", size, scene, true);
            plane.material = new BABYLON.StandardMaterial("TextPlaneMaterial", scene);
            plane.material.backFaceCulling = false;
            plane.material.specularColor = new BABYLON.Color3(0, 0, 0);
            plane.material.diffuseTexture = dynamicTexture;
            return plane;
        };

        var axisX = BABYLON.Mesh.CreateLines("axisX", [
            new BABYLON.Vector3.Zero(), new BABYLON.Vector3(size, 0, 0), new BABYLON.Vector3(size * 0.95, 0.05 * size, 0),
            new BABYLON.Vector3(size, 0, 0), new BABYLON.Vector3(size * 0.95, -0.05 * size, 0)
        ], scene);
        axisX.color = new BABYLON.Color3(1, 0, 0);
        var xChar = makeTextPlane("X", "red", size / 10);
        xChar.position = new BABYLON.Vector3(0.9 * size, -0.05 * size, 0);
        var axisY = BABYLON.Mesh.CreateLines("axisY", [
            new BABYLON.Vector3.Zero(), new BABYLON.Vector3(0, size, 0), new BABYLON.Vector3(-0.05 * size, size * 0.95, 0),
            new BABYLON.Vector3(0, size, 0), new BABYLON.Vector3(0.05 * size, size * 0.95, 0)
        ], scene);
        axisY.color = new BABYLON.Color3(0, 1, 0);
        var yChar = makeTextPlane("Y", "green", size / 10);
        yChar.position = new BABYLON.Vector3(0, 0.9 * size, -0.05 * size);
        var axisZ = BABYLON.Mesh.CreateLines("axisZ", [
            new BABYLON.Vector3.Zero(), new BABYLON.Vector3(0, 0, size), new BABYLON.Vector3(0, -0.05 * size, size * 0.95),
            new BABYLON.Vector3(0, 0, size), new BABYLON.Vector3(0, 0.05 * size, size * 0.95)
        ], scene);
        axisZ.color = new BABYLON.Color3(0, 0, 1);
        var zChar = makeTextPlane("Z", "blue", size / 10);
        zChar.position = new BABYLON.Vector3(0, 0.05 * size, 0.9 * size);
    };

    showAxis(5);

    return scene;
};

const scene = createScene(); //Call the createScene function

// Register a render loop to repeatedly render the scene
engine.runRenderLoop(function() {
    scene.render();
});

// Watch for browser/canvas resize events
window.addEventListener("resize", function() {
    engine.resize();
});