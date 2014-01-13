class ClearGLSurfaceView extends GLSurfaceView {
  public ClearGLSurfaceView(Context context) {
    super(context);
    mRenderer = new ClearRenderer();
    setRenderer(mRenderer);
  }
  public boolean onTouchEvent(final MotionEvent event) {
    queueEvent(new Runnable(){
      public void run() {
      mRenderer.setColor(event.getX() / getWidth(), event.getY() / getHeight(), 1.0f);
      }});
      return true;
    }

    ClearRenderer mRenderer;
}// end of ClearGLSurfaceView class definition

class ClearRenderer implements GLSurfaceView.Renderer {
  public void onSurfaceCreated(GL10 gl, EGLConfig config) {
    // Do something special, e.g. allocate textures etc.
  }
  public void onSurfaceChanged(GL10 gl, int width, int height) {
    gl.glViewport(0, 0, width, height);
  }
  public void onDrawFrame(GL10 gl) {
    gl.glClearColor(mRed, mGreen, mBlue, 1.0f);
    gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
  }
  public void setColor(float r, float g, float b) {
    mRed = r;
    mGreen = g;
    mBlue = b;
  }
  private float mRed;
  private float mGreen;
  private float mBlue;
}