// create Canvas element dynamically
var canvas = document.createElement("canvas");
document.body.appendChild(canvas);
// or if canvas element is already in the DOM one can get it by ID
//var canvas = document.getElementById("canvas");

var gl = null;
// Try to grab the standard context. If it fails, fallback to experimental.
gl = canvas.getContext("webgl") || canvas.getContext("experimental-webgl");

//we are ready to code with WebGL's context