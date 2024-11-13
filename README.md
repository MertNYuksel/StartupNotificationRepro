## Reproduction Steps

1. We have to trigger onMessageReceived function in FirebaseMessagingService class.
To do that we have two options:
    - Send a real message.
    - Simulate a message using adb command.

   To simulate a message using adb command:
   1. Ensure that `adb` is running as root.
   2. Verify that the device is rooted.
   3. Trigger the `onMessageReceived` function call using the following command:
```shell
   adb shell am broadcast \
     -n com.mertnevzatyuksel.startupnotification/com.google.firebase.iid.FirebaseInstanceIdReceiver \
     -a "com.google.android.c2dm.intent.RECEIVE" \
     --es "extra" "42"
```   
2. Check the logcat output. See that XInitializer is created before the onMessageReceived function call.