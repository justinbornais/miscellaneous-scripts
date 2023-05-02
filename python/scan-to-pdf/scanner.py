# This is for taking photos of a book using a phone setup. Phone must be in LANDSCAPE MODE for this use case.
# Note: Use scrcpy.exe to get the phone to display on the computer screen.

import pyautogui as gui
from time import sleep

# Coordinates of the camera button.
xcam = 336
ycam = 538

# Coordinates of the focus button.
xfocus = 1161
yfocus = 526

# for i in range(100):
#     print(gui.position())
#     sleep(1)

def take_photo():
    print("Focusing...")
    gui.moveTo(x=xfocus, y=yfocus, duration=0.2)
    gui.click()
    sleep(2)
    print("Click!")
    gui.moveTo(x=xcam, y=ycam, duration=0.2)
    gui.click()
    sleep(8)

print("Get ready!")
sleep(5)
for i in range(4):
    print(f"{i + 1}: ", end='')
    take_photo()