import android.Keys._

android.Plugin.androidBuildAar

name := "facebook-android-sdk"

organization := "com.facebook"

version := "3.5.2"

autoScalaLibrary := false

publishArtifact in (Compile, packageDoc) := false

libraryDependencies += "com.android.support" % "support-v4" % "18.0.0" % Compile