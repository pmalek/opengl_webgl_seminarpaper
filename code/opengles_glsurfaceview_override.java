import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import java.lang.Runnable;

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
  public void onSurfaceCreated(GL10 glUnused, EGLConfig config) {
    // Do something special, e.g. allocate textures etc.
  }
  public void onSurfaceChanged(GL10 glUnused, int width, int height) {
    GLES20.glViewport(0, 0, width, height);
  }
  public void onDrawFrame(GL10 glUnused) {
    GLES20.glClearColor(mRed, mGreen, mBlue, 1.0f);
    GLES20.glClear(GLES20.GL_DEPTH_BUFFER_BIT | GLES20.GL_COLOR_BUFFER_BIT);
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