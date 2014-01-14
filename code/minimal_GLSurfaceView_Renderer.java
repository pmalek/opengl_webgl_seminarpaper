class ClearRenderer implements GLSurfaceView.Renderer {
  public void onSurfaceCreated(GL10 glUnused, EGLConfig config) {
    // create long-lived resources like textures
  }
  public void onSurfaceChanged(GL10 glUnused, int width, int height) {
		GLES20.glViewport(0, 0, width, height);
  }
  public void onDrawFrame(GL10 glUnused) {
		GLES20.glClear(GLES20.GL_DEPTH_BUFFER_BIT | GLES20.GL_COLOR_BUFFER_BIT);
  }
}