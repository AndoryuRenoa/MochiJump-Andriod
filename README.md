# MochiJump-Andriod

Note: Currently working on desktop app and web level editor app. Will come back to this project shortly


Andriod port of MochiJump

Definitely a brand new world here: for Andriod Studios, remember whenever starting a new project:

Style name = "AppTheme" parent = "Base.Theme.AppCompat.Light.DarkActionBar" <- must be set in style.xml, default config is incorrect on new project creation.

Okay, so the plan, as of now, is to write most of the logic in classes extending ViewModel (in the style of the desktop app) except I want to use Room for anything that requires persistance
