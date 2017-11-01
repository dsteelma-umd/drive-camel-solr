sync_testing

Simple test to determine if messages were being processed synchronously
or asynchronously.

Run using:

mvn install && mvn camel:run

The "Message Count" field will increment monotonically, even though two
actions are being passed through the channel, where Action1 is delayed.
