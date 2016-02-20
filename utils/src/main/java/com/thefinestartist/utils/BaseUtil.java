package com.thefinestartist.utils;

import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.NetworkStatsManager;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.fingerprint.FingerprintManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.midi.MidiManager;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.telecom.TelecomManager;
import android.telephony.CarrierConfigManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.ClipboardManager;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;

import com.thefinestartist.binders.ExtrasBinder;
import com.thefinestartist.converters.UnitConverter;
import com.thefinestartist.enums.Rotation;
import com.thefinestartist.utils.etc.APILevel;
import com.thefinestartist.utils.service.ClipboardManagerUtil;
import com.thefinestartist.utils.service.ServiceUtil;
import com.thefinestartist.utils.service.VibratorUtil;
import com.thefinestartist.utils.service.WindowManagerUtil;
import com.thefinestartist.utils.ui.DisplayUtil;
import com.thefinestartist.utils.ui.KeyboardUtil;
import com.thefinestartist.utils.ui.ViewUtil;

/**
 * BaseUtil maps basic methods from other classØØ.
 *
 * @author Leonardo Taehwan Kim
 */
public class BaseUtil {

    /**
     * ExtrasBinder (Renamed methods)
     */
    public static void bindExtras(Activity activity) {
        ExtrasBinder.bind(activity);
    }

    public static void bindExtras(Fragment fragment) {
        ExtrasBinder.bind(fragment);
    }

    public static void bindExtras(android.app.Fragment fragment) {
        ExtrasBinder.bind(fragment);
    }

    /**
     * KeyboardUtil (Renamed methods)
     */
    public static void showKeyboard(View view) {
        KeyboardUtil.show(view);
    }

    public static void showKeyboardImmediately(View view) {
        KeyboardUtil.showImmediately(view);
    }

    public static void hideKeyboard(Fragment fragment) {
        KeyboardUtil.hide(fragment);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void hideKeyboard(android.app.Fragment fragment) {
        KeyboardUtil.hide(fragment);
    }

    public static void hideKeyboard(Activity activity) {
        KeyboardUtil.hide(activity);
    }

    public static void hideKeyboard(Dialog dialog) {
        KeyboardUtil.hide(dialog);
    }

    public static void hideKeyboard(View view) {
        KeyboardUtil.hide(view);
    }

    /**
     * UnitConverter
     */
    public static float dpToPx(float dp) {
        return UnitConverter.dpToPx(dp);
    }

    public static int dpToPx(int dp) {
        return UnitConverter.dpToPx(dp);
    }

    public static float pxToDp(float px) {
        return UnitConverter.pxToDp(px);
    }

    public static int pxToDp(int px) {
        return UnitConverter.pxToDp(px);
    }

    public static float spToPx(float sp) {
        return UnitConverter.spToPx(sp);
    }

    public static int spToPx(int sp) {
        return UnitConverter.spToPx(sp);
    }

    public static float pxToSp(float px) {
        return UnitConverter.pxToSp(px);
    }

    public static int pxToSp(int px) {
        return UnitConverter.pxToSp(px);
    }

    /**
     * APILevel (Renamed methods)
     */
    public static boolean requireAPI(int level) {
        return APILevel.require(level);
    }

    public static boolean requireAPICupcake() {
        return APILevel.requireCupcake();
    }

    public static boolean requireAPIDonut() {
        return APILevel.requireDonut();
    }

    public static boolean requireAPIEclair() {
        return APILevel.requireEclair();
    }

    public static boolean requireAPIFroyo() {
        return APILevel.requireFroyo();
    }

    public static boolean requireAPIGingerbread() {
        return APILevel.requireGingerbread();
    }

    public static boolean requireAPIHoneycomb() {
        return APILevel.requireHoneycomb();
    }

    public static boolean requireAPIHoneycombMR2() {
        return APILevel.requireHoneycombMR2();
    }

    public static boolean requireAPIIceCreamSandwich() {
        return APILevel.requireIceCreamSandwich();
    }

    public static boolean requireAPIJellyBean() {
        return APILevel.requireJellyBean();
    }

    public static boolean requireAPIJellyBeanMR1() {
        return APILevel.requireJellyBeanMR1();
    }

    public static boolean requireAPIJellyBeanMR2() {
        return APILevel.requireJellyBeanMR2();
    }

    public static boolean requireAPIKitkat() {
        return APILevel.requireKitkat();
    }

    public static boolean requireAPILollipop() {
        return APILevel.requireLollipop();
    }

    public static boolean requireAPILollipopMR1() {
        return APILevel.requireLollipopMR1();
    }

    public static boolean requireAPIMarshmallow() {
        return APILevel.requireMarshmallow();
    }

    public static boolean deprecatedAtAPI(int level) {
        return APILevel.deprecatedAt(level);
    }

    public static boolean deprecatedAtAPICupcake() {
        return APILevel.deprecatedAtCupcake();
    }

    public static boolean deprecatedAtAPIDonut() {
        return APILevel.deprecatedAtDonut();
    }

    public static boolean deprecatedAtAPIEclair() {
        return APILevel.deprecatedAtEclair();
    }

    public static boolean deprecatedAtAPIFroyo() {
        return APILevel.deprecatedAtFroyo();
    }

    public static boolean deprecatedAtAPIGingerbread() {
        return APILevel.deprecatedAtGingerbread();
    }

    public static boolean deprecatedAtAPIHoneycomb() {
        return APILevel.deprecatedAtHoneycomb();
    }

    public static boolean deprecatedAtAPIHoneycombMR2() {
        return APILevel.deprecatedAtHoneycombMR2();
    }

    public static boolean deprecatedAtAPIIceCreamSandwich() {
        return APILevel.deprecatedAtIceCreamSandwich();
    }

    public static boolean deprecatedAtAPIJellyBean() {
        return APILevel.deprecatedAtJellyBean();
    }

    public static boolean deprecatedAtAPIJellyBeanMR1() {
        return APILevel.deprecatedAtJellyBeanMR1();
    }

    public static boolean deprecatedAtAPIJellyBeanMR2() {
        return APILevel.deprecatedAtJellyBeanMR2();
    }

    public static boolean deprecatedAtAPIKitkat() {
        return APILevel.deprecatedAtKitkat();
    }

    public static boolean deprecatedAtAPILollipop() {
        return APILevel.deprecatedAtLollipop();
    }

    public static boolean deprecatedAtAPILollipopMR1() {
        return APILevel.deprecatedAtLollipopMR1();
    }

    public static boolean deprecatedAtAPIMarshmallow() {
        return APILevel.deprecatedAtMarshmallow();
    }

    /**
     * DisplayUtil (Partly renamed methods)
     */
    public static int getDisplayWidth() {
        return DisplayUtil.getWidth();
    }

    public static int getDisplayHeight() {
        return DisplayUtil.getHeight();
    }

    public static Rotation getDisplayRotation() {
        return DisplayUtil.getRotation();
    }

    public static boolean isDisplayPortrait() {
        return DisplayUtil.isPortrait();
    }

    public static boolean isDisplayLandscape() {
        return DisplayUtil.isLandscape();
    }

    public static int getStatusBarHeight() {
        return DisplayUtil.getStatusBarHeight();
    }

    public static int getToolbarHeight() {
        return DisplayUtil.getToolbarHeight();
    }

    public static int getActionBarHeight() {
        return DisplayUtil.getActionBarHeight();
    }

    public static int getNavigationBarHeight() {
        return DisplayUtil.getNavigationBarHeight();
    }

    /**
     * ViewUtil (Renamed methods)
     */
    public static void setViewBackground(View view, Drawable drawable) {
        ViewUtil.setBackground(view, drawable);
    }

    public static void setViewBackground(View view, @DrawableRes int drawableRes) {
        ViewUtil.setBackground(view, drawableRes);
    }

    /**
     * ServiceUtil
     */
    public static Object getSystemService(@NonNull String serviceName) {
        return ServiceUtil.getSystemService(serviceName);
    }

    public static AccessibilityManager getAccessibilityManager() {
        return ServiceUtil.getAccessibilityManager();
    }

    @TargetApi(19)
    public static CaptioningManager getCaptioningManager() {
        return ServiceUtil.getCaptioningManager();
    }

    public static AccountManager getAccountManager() {
        return ServiceUtil.getAccountManager();
    }

    public static ActivityManager getActivityManager() {
        return ServiceUtil.getActivityManager();
    }

    public static AlarmManager getAlarmManager() {
        return ServiceUtil.getAlarmManager();
    }

    public static AudioManager getAudioManager() {
        return ServiceUtil.getAudioManager();
    }

    @TargetApi(16)
    public static MediaRouter getMediaRouter() {
        return ServiceUtil.getMediaRouter();
    }

    @TargetApi(18)
    public static BluetoothManager getBluetoothManager() {
        return ServiceUtil.getBluetoothManager();
    }

    public static ClipboardManager getClipboardManager() {
        return ServiceUtil.getClipboardManager();
    }

    public static ConnectivityManager getConnectivityManager() {
        return ServiceUtil.getConnectivityManager();
    }

    @TargetApi(8)
    public static DevicePolicyManager getDevicePolicyManager() {
        return ServiceUtil.getDevicePolicyManager();
    }

    @TargetApi(9)
    public static DownloadManager getDownloadManager() {
        return ServiceUtil.getDownloadManager();
    }

    @TargetApi(21)
    public static BatteryManager getBatteryManager() {
        return ServiceUtil.getBatteryManager();
    }

    @TargetApi(10)
    public static NfcManager getNfcManager() {
        return ServiceUtil.getNfcManager();
    }

    @TargetApi(8)
    public static DropBoxManager getDropBoxManager() {
        return ServiceUtil.getDropBoxManager();
    }

    @TargetApi(16)
    public static InputManager getInputManager() {
        return ServiceUtil.getInputManager();
    }

    @TargetApi(17)
    public static DisplayManager getDisplayManager() {
        return ServiceUtil.getDisplayManager();
    }

    public static InputMethodManager getInputMethodManager() {
        return ServiceUtil.getInputMethodManager();
    }

    @TargetApi(14)
    public static TextServicesManager getTextServicesManager() {
        return ServiceUtil.getTextServicesManager();
    }

    public static KeyguardManager getKeyguardManager() {
        return ServiceUtil.getKeyguardManager();
    }

    public static LayoutInflater getLayoutInflater() {
        return ServiceUtil.getLayoutInflater();
    }

    public static LocationManager getLocationManager() {
        return ServiceUtil.getLocationManager();
    }

    public static NotificationManager getNotificationManager() {
        return ServiceUtil.getNotificationManager();
    }

    @TargetApi(16)
    public static NsdManager getNsdManager() {
        return ServiceUtil.getNsdManager();
    }

    public static PowerManager getPowerManager() {
        return ServiceUtil.getPowerManager();
    }

    public static SearchManager getSearchManager() {
        return ServiceUtil.getSearchManager();
    }

    public static SensorManager getSensorManager() {
        return ServiceUtil.getSensorManager();
    }

    @TargetApi(9)
    public static StorageManager getStorageManager() {
        return ServiceUtil.getStorageManager();
    }

    public static TelephonyManager getTelephonyManager() {
        return ServiceUtil.getTelephonyManager();
    }

    @TargetApi(22)
    public static SubscriptionManager getSubscriptionManager() {
        return ServiceUtil.getSubscriptionManager();
    }

    @TargetApi(23)
    public static CarrierConfigManager getCarrierConfigManager() {
        return ServiceUtil.getCarrierConfigManager();
    }

    @TargetApi(21)
    public static TelecomManager getTelecomManager() {
        return ServiceUtil.getTelecomManager();
    }

    @TargetApi(8)
    public static UiModeManager getUiModeManager() {
        return ServiceUtil.getUiModeManager();
    }

    @TargetApi(12)
    public static UsbManager getUsbManager() {
        return ServiceUtil.getUsbManager();
    }

    public static Vibrator getVibrator() {
        return ServiceUtil.getVibrator();
    }

    public static WallpaperManager getWallpaperManager() {
        return ServiceUtil.getWallpaperManager();
    }

    public static WifiManager getWifiManager() {
        return ServiceUtil.getWifiManager();
    }

    @TargetApi(14)
    public static WifiP2pManager getWifiP2pManager() {
        return ServiceUtil.getWifiP2pManager();
    }

    public static WindowManager getWindowManager() {
        return ServiceUtil.getWindowManager();
    }

    @TargetApi(17)
    public static UserManager getUserManager() {
        return ServiceUtil.getUserManager();
    }

    @TargetApi(19)
    public static AppOpsManager getAppOpsManager() {
        return ServiceUtil.getAppOpsManager();
    }

    @TargetApi(21)
    public static CameraManager getCameraManager() {
        return ServiceUtil.getCameraManager();
    }

    @TargetApi(21)
    public static LauncherApps getLauncherApps() {
        return ServiceUtil.getLauncherApps();
    }

    @TargetApi(21)
    public static RestrictionsManager getRestrictionsManager() {
        return ServiceUtil.getRestrictionsManager();
    }

    @TargetApi(19)
    public static PrintManager getPrintManager() {
        return ServiceUtil.getPrintManager();
    }

    @TargetApi(19)
    public static ConsumerIrManager getConsumerIrManager() {
        return ServiceUtil.getConsumerIrManager();
    }

    @TargetApi(21)
    public static MediaSessionManager getMediaSessionManager() {
        return ServiceUtil.getMediaSessionManager();
    }

    @TargetApi(23)
    public static FingerprintManager getFingerprintManager() {
        return ServiceUtil.getFingerprintManager();
    }

    @TargetApi(21)
    public static TvInputManager getTvInputManager() {
        return ServiceUtil.getTvInputManager();
    }

    @TargetApi(22)
    public static UsageStatsManager getUsageStatsManager() {
        return ServiceUtil.getUsageStatsManager();
    }

    @TargetApi(23)
    public static NetworkStatsManager getNetworkStatsManager() {
        return ServiceUtil.getNetworkStatsManager();
    }

    @TargetApi(21)
    public static JobScheduler getJobScheduler() {
        return ServiceUtil.getJobScheduler();
    }

    @TargetApi(21)
    public static MediaProjectionManager getMediaProjectionManager() {
        return ServiceUtil.getMediaProjectionManager();
    }

    @TargetApi(21)
    public static AppWidgetManager getAppWidgetManager() {
        return ServiceUtil.getAppWidgetManager();
    }

    @TargetApi(23)
    public static MidiManager getMidiManager() {
        return ServiceUtil.getMidiManager();
    }

    /**
     * VibratorUtil
     */
    @TargetApi(11)
    public static boolean hasVibrator() {
        return VibratorUtil.hasVibrator();
    }

    public static void vibrate() {
        VibratorUtil.vibrate();
    }

    public static void vibrate(long milliseconds) {
        VibratorUtil.vibrate(milliseconds);
    }

    public static void vibrate(long[] pattern) {
        VibratorUtil.vibrate(pattern);
    }

    public static void vibrate(long[] pattern, int repeat) {
        VibratorUtil.vibrate(pattern, repeat);
    }

    @TargetApi(21)
    public static void vibrate(long milliseconds, AudioAttributes attributes) {
        VibratorUtil.vibrate(milliseconds, attributes);
    }

    @TargetApi(21)
    public static void vibrate(long[] pattern, int repeat, AudioAttributes attributes) {
        VibratorUtil.vibrate(pattern, repeat, attributes);
    }

    public static void cancel() {
        VibratorUtil.cancel();
    }

    /**
     * ClipboardManagerUtil (Renamed methods)
     */
    public static void clipText(CharSequence text) {
        ClipboardManagerUtil.setText(text);
    }

    public static boolean hasClipedText() {
        return ClipboardManagerUtil.hasText();
    }

    public static CharSequence getClipedText() {
        return ClipboardManagerUtil.getText();
    }

    /**
     * TypeValueUtil
     */
    public static float applyDimension(int unit, float value) {
        return BaseUtil.applyDimension(unit, value);
    }

    public static float complexToDimension(int data) {
        return BaseUtil.complexToDimension(data);
    }

    public static int complexToDimensionPixelOffset(int data) {
        return BaseUtil.complexToDimensionPixelOffset(data);
    }

    public static int complexToDimensionPixelSize(int data) {
        return BaseUtil.complexToDimensionPixelSize(data);
    }

    /**
     * WindowManagerUtil
     */
    public static Display getDefaultDisplay() {
        return WindowManagerUtil.getDefaultDisplay();
    }

    public static void removeViewImmediate(View view) {
        WindowManagerUtil.removeViewImmediate(view);
    }
}
// TODO: Thread safe
// TODO: ripple, bitmap, time, contact list, picture list, video list, connectivity, wake lock, screen lock/off/on, get attributes, cookie
// TODO: keystore
// TODO: http://jo.centis1504.net/?p=1189