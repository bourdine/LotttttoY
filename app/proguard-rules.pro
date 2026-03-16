# ProGuard rules for the project

# Keep annotations
-keepattributes Annotations

# Keep all classes that might be used in reflection
-dontwarn com.yourcompany.**
-keep class com.yourcompany.** { *; }

# Prevent obfuscating or removing specific methods needed for JNI calls
-keepclasseswithmembernames class * {
    native <methods>;
}

# Preserve Parcelable implementations
-keep class * implements android.os.Parcelable {
    public static final *** CREATOR;
}

# Remove unused resources but keep important ones
-dontnote android.support.v4.internal.view.SupportMenuItem
-dontwarn android.support.v4.**

# Ignore warnings related to R classes
-dontwarn android.databinding.**
-dontwarn androidx.databinding.**

# Keep Debug symbols for debugging purposes
-keeppackagenames com.yourcompany.debug.*

# Enable optimizations carefully
-optimizationpasses 5
-overloadaggressively
-useuniqueclassmembernames
-repackageclasses ''
-allowaccessmodification
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*

# Strip out unnecessary logging code in production builds
-assumenosideeffects class android.util.Log {
    public static *** d(...);
    public static *** v(...);
    public static *** w(...);
    public static *** e(...);
}
