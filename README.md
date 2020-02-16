# Android-Dagger-Onboarding
Dagger onboarding task list:

1. Read the Dagger Basics presentation located inside this repo root folder (dagger-basics.key)
2. Go through the [Dagger codelab]( https://codelabs.developers.google.com/codelabs/android-dagger/#0) tutorial
	* Steps 10, 11, 12, 13 are optional
	* Skip steps 14, 16
3. [Optional] Before moving to steps 4 and 5 we recommend you go through these materials:
	* https://developer.android.com/training/dependency-injection/dagger-basics
	* https://developer.android.com/training/dependency-injection/dagger-android
	* https://www.youtube.com/watch?v=ZZ_qek0hGkM&list=PLrnPJCHvNZuA2ioi4soDZKz8euUQnJW65
    * https://dagger.dev/tutorial/
4. Make Android-Dagger-Onboarding project run successfully
    * This sample project has some intentional errors in the Dagger setup. Your task is to analyse the codebase and fix those errors so that at the end you can run this project and see a screen with the mission briefing information in the HeroHeadquartersActivity
5. Migrate Android-Dagger-Onboarding project from the current dagger setup to use the dagger.android setup
    * For more information about the dagger.android setup you can check the official [documentation[(https://dagger.dev/android) under the dagger.android section
    * A sample rundown of the imeplementation: https://blog.mindorks.com/the-new-dagger-2-android-injector-cbe7d55afa6a
    * Check out [this project](https://github.com/infinum/Android-MvvM-Example) for reference on how we use dagger.android at Infinum

 NOTE: This project has the Scabbard plugin integrated. You can use it to see the visual representation of your dependancy graph.
 For more info about how to use it, read the scabbard official [documentation](https://arunkumar9t2.github.io/scabbard/).