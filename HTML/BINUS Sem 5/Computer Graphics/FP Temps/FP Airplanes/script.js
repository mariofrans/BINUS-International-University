var canvas = document.getElementById("renderCanvas");
var engine = null;
var scene = null;
var sceneToRender = null;

var createDefaultEngine = function() 
{ 
    return new BABYLON.Engine(
        canvas, true, { preserveDrawingBuffer: true, stencil: true,  disableWebGL2Support: false } 
    ); 
};

window.initFunction = async function() 
{
    var asyncEngineCreation = async function() 
    {
        try 
        {
            return createDefaultEngine();
        } 
        catch(e) 
        {
            console.log("the available createEngine function failed. Creating the default engine instead");
            return createDefaultEngine();
        }
    }

    window.engine = await asyncEngineCreation();
    if (!engine) throw 'engine should not be null.';
    window.scene = createScene();
};

initFunction().then(() => 
{   
    sceneToRender = scene        
    engine.runRenderLoop(function () 
    {
        if (sceneToRender && sceneToRender.activeCamera) 
        {
            sceneToRender.render();
        }
    });
});

// Resize
window.addEventListener("resize", function () 
{
    engine.resize();
});

    



const createScene =  () => 
{
    const scene = new BABYLON.Scene(engine);

    const camera = new BABYLON.ArcRotateCamera("camera", -Math.PI / 2, Math.PI / 2.5, 3, new BABYLON.Vector3(0, 0, 0));
    camera.attachControl(canvas, true);

    const light = new BABYLON.HemisphericLight("light", new BABYLON.Vector3(0, 1, 0));

    // const box = BABYLON.MeshBuilder.CreateBox("box", {});

    // Importing a Scene or Model:
    // BABYLON.SceneLoader.ImportMeshAsync(model name, folder path, file name, scene);

    // import single model
    // BABYLON.SceneLoader.ImportMeshAsync("semi_house", "https://assets.babylonjs.com/meshes/", "both_houses_scene.babylon");
    
    // import multiple models
    // BABYLON.SceneLoader.ImportMeshAsync(["ground", "semi_house"], "https://assets.babylonjs.com/meshes/", "both_houses_scene.babylon");
    
    // modifying imported models
    // BABYLON.SceneLoader.ImportMeshAsync("", "https://assets.babylonjs.com/meshes/", "both_houses_scene.babylon").then((result) => {
    //     const house1 = scene.getMeshByName("detached_house");
    //     house1.position.y = 2;
    //     const house2 = result.meshes[2];
    //     house2.position.y = -2;
    // });

    // aeroplane
    // BABYLON.SceneLoader.ImportMesh("", "https://models.babylonjs.com/", "aerobatic_plane.glb", scene, function (meshes) {          
    //     scene.createDefaultCameraOrLight(true, true, true);
    //     scene.createDefaultEnvironment();
    // });

    // ufo
    // BABYLON.SceneLoader.ImportMesh("", "https://models.babylonjs.com/", "ufo.glb", scene, function (meshes) {          
    //     scene.createDefaultCameraOrLight(true, true, true);
    //     scene.createDefaultEnvironment();
    // });

    // a380
    BABYLON.SceneLoader.ImportMesh("", "./a380/", "a380.gltf", scene, function (meshes) {
        scene.createDefaultCameraOrLight(true, true, true);
        scene.createDefaultEnvironment();
    });

    return scene;
}

// A380 https://sketchfab.com/3d-models/a380-8hWQW1izQKZLYOZD4PKXti0xIjn
// B777 Air New Zealand https://sketchfab.com/3d-models/air-new-zealand-boeing-777-219-er-updated-livery-17050ee33dfb4fe1981cac462893c158