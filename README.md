# MochiJump-Andriod


Andriod port of MochiJump

Definitely a brand new world here: for Andriod Studios, remember whenever starting a new project:

Style name = "AppTheme" parent = "Base.Theme.AppCompat.Light.DarkActionBar" <- must be set in style.xml, default config is incorrect on new project creation.

Okay, so the plan, as of now, is to write most of the logic in classes extending ViewModel (in the style of the desktop app) except I want to use Room as a place to load levels into and save status with onPause()


https://developer.android.com/guide/topics/ui/custom-components

https://developer.android.com/training/data-storage/room/

https://developer.android.com/topic/libraries/architecture/viewmodel
