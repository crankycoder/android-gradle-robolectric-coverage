all:
	./gradlew build

debug_apk:
	./gradlew assembleDebug

install_debug:
	./gradlew installDebug

test:
	./gradlew testUnittest
