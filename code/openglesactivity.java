public class OpenGLESActivity extends Activity {

    private GLSurfaceView mGLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Create a GLSurfaceView instance and set it as ContentView for this Activity.
        mGLView = new MyGLSurfaceView(this);
        // Set the version of OpenGL ES context - 3 for version 3.0
        mGLSurfaceView.setEGLContextClientVersion(3);
        setContentView(mGLView);
    }
}