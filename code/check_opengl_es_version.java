final ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
final ConfigurationInfo configurationInfo = activityManager.getDeviceConfigurationInfo();
// where configurationInfo.reqGlEsVersion is an int
// which upper 16 bits represent major version of OpenGL ES
final boolean supportsEs3 = configurationInfo.reqGlEsVersion >= 0x30000;
if(supportsEs3) mGLSurfaceView.setEGLContextClientVersion(3);