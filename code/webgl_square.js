if(gl) {
  gl.clearColor(0.0, 0.0, 0.0, 1.0);                 // Set clear color to black, fully opaque
  gl.enable(gl.DEPTH_TEST);                          // Enable depth testing
  gl.depthFunc(gl.LEQUAL);                           // Near things obscure far things
  // Clear the color as well as the depth buffer.
  gl.clear(gl.COLOR_BUFFER_BIT|gl.DEPTH_BUFFER_BIT); 
}

var squareVertexPositionBuffer = gl.createBuffer();
// binding "current array buffer" so that each following operation will be operated on it
gl.bindBuffer(gl.ARRAY_BUFFER, squareVertexPositionBuffer);
vertices = [
     1.0,  1.0,  0.0,
    -1.0,  1.0,  0.0,
     1.0, -1.0,  0.0,
    -1.0, -1.0,  0.0
];
// assigning vertices to previously chosen buffer
gl.bufferData(gl.ARRAY_BUFFER, new Float32Array(vertices), gl.STATIC_DRAW);
// manually assigned 'item size' which indicates 3 coordinates for each vertex
squareVertexPositionBuffer.itemSize = 3;
// manually assigned number of items in the buffer
squareVertexPositionBuffer.numItems = 4;